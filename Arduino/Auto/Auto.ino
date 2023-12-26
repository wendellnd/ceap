#include <SoftwareSerial.h>
#include <Ultrasonic.h>

#define pino_trigger 4
#define pino_echo 5

int m1 = 8;
int m2 = 7;
int m3 = 10;
int m4 = 9;
int pinoRX = 2;
int pinoTX = 3;
char valor = '0';
float cmMsec;
SoftwareSerial bluetooth(pinoRX, pinoTX);
Ultrasonic ultrasonic(pino_trigger,pino_echo);
void setup() {
  pinMode(m1, OUTPUT);
  pinMode(m2, OUTPUT);
  pinMode(m3, OUTPUT);
  pinMode(m4, OUTPUT);
  Serial.begin(9600);
  bluetooth.begin(9600);
  valor = 'P';

}

void loop() {
  long microsec = ultrasonic.timing();
  cmMsec = ultrasonic.convert(microsec, Ultrasonic::CM);
  Serial.println(cmMsec);
  delay(100);
  bluetooth.println(cmMsec);
   if(cmMsec <= 25 && cmMsec != 5.79  && valor != 'T'){
      bluetooth.println("Obstaculo a frente.");
  }
  

  
  if(bluetooth.available()) {
    valor = bluetooth.read();
    if(valor == 'F') {
      Frente();
    }else if (valor == 'T') {
      Tras();
    }else if (valor == 'D') {
      Direita();
    }else if (valor == 'E') {
      Esquerda();
    }else{
      Para();
    }
  } 
  if (cmMsec < 20 && valor == 'A'){
    bluetooth.println("Ia bater!");
    Tras();
    delay(500);
    long microsec2 = ultrasonic.timing();
    float cmMsec2 = ultrasonic.convert(microsec2, Ultrasonic::CM);
    while(cmMsec2 < 40){
      Esquerda();  
      microsec2 = ultrasonic.timing();
      cmMsec2 = ultrasonic.convert(microsec2, Ultrasonic::CM);
      Serial.println(cmMsec2);
      delay(400);
    }
    Frente();
  }
}
void Auto(){
  if (cmMsec < 5.79){
    bluetooth.println("Ia bater!");
    Tras();
    delay(500);
    long microsec2 = ultrasonic.timing();
    float cmMsec2 = ultrasonic.convert(microsec2, Ultrasonic::CM);
    while(cmMsec2 < 10){
      Esquerda();  
      microsec2 = ultrasonic.timing();
      cmMsec2 = ultrasonic.convert(microsec2, Ultrasonic::CM);
      Serial.println(cmMsec2);
      delay(100);
    }
    Frente();
  }else{
    Frente();
  }
}
void Frente(){
  digitalWrite(m1,HIGH);
  digitalWrite(m2,LOW);
  digitalWrite(m3,LOW);
  digitalWrite(m4,HIGH);
}
void Tras(){  
  digitalWrite(m1,LOW);
  digitalWrite(m2,HIGH);
  digitalWrite(m3,HIGH);
  digitalWrite(m4,LOW);
}
void Direita(){
  digitalWrite(m1,LOW);
  digitalWrite(m2,LOW);
  digitalWrite(m3,LOW);
  digitalWrite(m4,HIGH);
}
void Esquerda(){
  digitalWrite(m1,HIGH);
  digitalWrite(m2,LOW);
  digitalWrite(m3,LOW);
  digitalWrite(m4,LOW);
}
void Para(){
  digitalWrite(m1,LOW);
  digitalWrite(m2,LOW);
  digitalWrite(m3,LOW);
  digitalWrite(m4,LOW);
  
}
