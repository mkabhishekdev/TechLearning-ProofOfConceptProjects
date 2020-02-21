'use strict';

/**
 * This is a Lambda function that sends an Email on the click of an AWS IoT
 * button by publishing to an SNS topic.
 *
 * 1. Enter the ARN (Amazon Resource Name) of the SNS topic you have created.
 * 2. Edit the content of the message to be delivered upon single clicks, double clicks, and 
 * long clicks by changing the text within the single quotation marks
 */

const AWS = require('aws-sdk');
const SNS = new AWS.SNS({ apiVersion: '2010-03-31' });

// !!CHANGE THIS!! Enter the ARN of your SNS Topic
const TOPIC_ARN = 'arn:aws:sns:us-east-1:282052529943:DevTreats';   //my SNS topic I created

exports.handler = (event, context, callback) => {

// !!CHANGE THIS!! Your text to display goes in the single quotation marks below    
    const singleClick = 'We have a Birthday today! Donuts on the Usual place!!';  // Birthday mail, I know surprise lies in finding who's birthday
    const doubleClick = 'No special reason! Pastries on the Usual place!!';  // Generic email for pastries
    const longClick = 'Immediately please assemble in the Plaza!!';  // In the case of any emergencies
   
var devTeamAlert = singleClick;   

if(event.clickType == "DOUBLE"){
    devTeamAlert = doubleClick;
}

if(event.clickType == "LONG"){
    devTeamAlert = longClick;
}
    
 const params = {
            Message: devTeamAlert,
            // !!CHANGE THIS!! Enter the subject of your email in the single quotation marks below
            Subject: `Treats!`,
            TopicArn: TOPIC_ARN,
        };
        // result will go to function callback
        SNS.publish(params, callback);
};

//email is: VST-Development@tylertech.com
// create the dynamo db feature for data analysis

