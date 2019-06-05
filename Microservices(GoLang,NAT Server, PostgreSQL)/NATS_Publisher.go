package main

import (
	"encoding/json"
	"fmt"
	"log"
	"sync"
	"time"

	"github.com/nats-io/nats.go"
)

type Sensors struct {
	name      string    `json:"sensorName"`
	timestamp time.Time `json:"timestamp"`
	value     float64   `json:"value"`
}

//creation of wait group
var wg sync.WaitGroup

func main() {

	wg.Add(1)
	//call to the createPublisher() function
	go createPublisher()
	wg.Wait()
}

//createPublisher() method implementation
func createPublisher() {

	log.Println("****Publisher Started*********")
	defer wg.Done()

	//connection to the NATS server from Publisher
	nc, err := nats.Connect(nats.DefaultURL)
	if err != nil {
		log.Fatal(err)
	}
	defer nc.Close()

	//JSON inputs
	sensorVal := `[{"name":"Sensor1","timestamp":1520859501538,"value":52.7},{"name":"Sensor2","timestamp":1520859501538,"value":22.3},
		{"name":"Sensor3","timestamp":1520859501538,"value":33.8}]`

	/*	sensorVal := `[{"name":"sensor4","timestamp":"2019-05-27","value":10},{"name":"sensor5","timestamp":"2019-05-26","value":40},
		{"name":"sensor6","timestamp":"2019-05-25","value":80}]` */

	// JSON Marshalling process
	byteArray, err := json.Marshal(sensorVal)
	for {
		//Publishing the json message to the NATS server
		nc.Publish("SubscriberToAbhi", byteArray)
		fmt.Println("MESSAGE SENT ACROSS CHANNEL TO SUBSCRIBER : ", string(byteArray))
	}
	//Pre defined interval
	time.Sleep(time.Millisecond)

	log.Println("***Publish finish****")

	nc.Flush()

}
