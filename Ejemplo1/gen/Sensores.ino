
/***   BOARD :  Sensores  ***/
#include "DHT.h"
#include <ESP8266WiFi.h>
#include <ESP8266HTTPClient.h>
#include <PubSubClient.h> 
#include <Servo.h>
#include <Wire.h>
#include <LiquidCrystal_I2C.h>



#define DEBUG(a) Serial.println(a);
String data;



/***   Global variables  ***/




void actuators(String aux){
	delay(1000);

  	int aux1 = aux.indexOf("attribute\":", 0);
  	int aux2 = aux.indexOf(",\"ar", 0);
  	String atributo=aux.substring(aux1+11, aux2);

  	int aux11 = aux.indexOf("artefact\":", 0);
  	int aux22 = aux.indexOf("}", 0);
  	String artefacto=aux.substring(aux11+11, aux22-1);

}

void sensors(){
	delay(1000);
}

void setup() {
	delay(5000);
	Serial.begin(115200);
}

void loop() {
    Serial.flush();
	if(client.loop()){
		sensors();
	}
	else{
		Serial.println("desconectado...");
	}
}
