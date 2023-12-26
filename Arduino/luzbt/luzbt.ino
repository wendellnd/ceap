#include <SoftwareSerial.h>

int pinoRX = 2;
int pinoTX = 3;
int dadoBtooth = 0;
int pinoLDR = A0;
int luminosidade = 0;
SoftwareSerial bluetooth(pinoRX,pinoTX);

void setup() {
  Serial.begin(9600);
  bluetooth.begin(9600);
  pinMode(13,OUTPUT);
  pinMode(pinoLDR,INPUT);
  bluetooth.write("Digite 1 para saber a luminosidade da sala");
}

void loop() {
  if(bluetooth.available()){
    luminosidade = analogRead(pinoLDR);
    dadoBtooth = bluetooth.read();
    if(dadoBtooth == '1'){
      bluetooth.write(luminosidade);
      Serial.println(luminosidade);
    }
  }
}
