#include <SoftwareSerial.h>

int pinoRX = 2;
int pinoTX = 3;
int dadoBtooth = 0;

SoftwareSerial bluetooth(pinoRX,pinoTX);
void setup() {
Serial.begin(9600);
bluetooth.begin(9600);
pinMode(13,OUTPUT);
}

void loop() {
if(bluetooth.available()){
  dadoBtooth = bluetooth.read();
  if(dadoBtooth == '0'){
    digitalWrite(13, LOW);
    bluetooth.write("desligado");
  }else if (dadoBtooth == '1'){
    digitalWrite(13, HIGH);   
    bluetooth.write("ligado"); 
  }
}
}
