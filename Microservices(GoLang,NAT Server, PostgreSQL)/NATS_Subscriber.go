package main

import (
	"database/sql"
	"encoding/json"
	"fmt"
	"log"
	"sync"
	"time"

	_ "github.com/lib/pq"
	"github.com/nats-io/nats.go"
)

//Postgres SQL connection configuration to local
const (
	host     = "localhost"
	port     = 5432
	user     = "postgres"
	password = "Abhikemp11@"
	dbname   = "sensordb"
)

var received int64
var wg sync.WaitGroup

func main() {

	//received incremental counter
	received = 0
	wg.Add(1)

	//Call to CreateSubscriber implementation
	go createSubscriber()
	go check()

	wg.Wait()
}

//createSubscriber Method implementation
func createSubscriber() {

	log.Println("*******Subscriber Started***********")
	defer wg.Done()

	nc, err := nats.Connect(nats.DefaultURL)
	if err != nil {
		log.Fatal(err)
	}
	defer nc.Close()

	//NATS message discovery
	nc.Subscribe("SubscriberToAbhi", func(msg *nats.Msg) {
		var f interface{}
		//JSON Unmarshalling
		json.Unmarshal(msg.Data, &f)
		fmt.Printf("MESSAGE received : %+v", f)
		str := fmt.Sprintf("%v", f)
		psqlInfo := fmt.Sprintf("host=%s port=%d user=%s "+
			"password=%s dbname=%s sslmode=disable",
			host, port, user, password, dbname)
		db, err := sql.Open("postgres", psqlInfo)
		if err != nil {
			panic(err)
		}
		defer db.Close()
		err = db.Ping()
		if err != nil {
			panic(err)
		}
		fmt.Println("Successfully connected to Postgres!")

		var lastId int
		db.QueryRow("INSERT INTO incomingmessages(message) VALUES ($1);", str).Scan(&lastId)

		fmt.Printf("Coverted to string format: ", str)
		received++
	})
	nc.Flush()

	for {

	}
}

func check() {
	for {
		fmt.Println("-----------------------")
		fmt.Println("still running")
		fmt.Println("received", received)
		fmt.Println("-----------------------")
		time.Sleep(time.Second * 2)
	}
}
