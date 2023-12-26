int pinoLdr = A5;
int luminosidade = 0;
const int a = 5;
const int b = 6;
const int c = 7;
const int d = 8;
const int e = 9;
const int f = 10;
const int g = 11;
//const int pt = 9;
int de = 1000;
void setup() {
  pinMode(a,OUTPUT);
  pinMode(b,OUTPUT);
  pinMode(c,OUTPUT);
  pinMode(d,OUTPUT);
  pinMode(e,OUTPUT);
  pinMode(f,OUTPUT);
  pinMode(g,OUTPUT);
//  pinMode(pt,OUTPUT);
//  pinMode(pinoLed,OUTPUT);
  pinMode(pinoLdr,INPUT);

}

//COM LUZ
void segC(){
  //COM E SEM LUZ
  digitalWrite(a,HIGH);
  digitalWrite(b,LOW);
  digitalWrite(c,LOW);
  digitalWrite(d,HIGH);
  digitalWrite(e,HIGH);
  digitalWrite(f,HIGH);
  digitalWrite(g,LOW);
}
void segL(){
  digitalWrite(a,LOW);
  digitalWrite(b,LOW);
  digitalWrite(c,LOW);
  digitalWrite(d,HIGH);
  digitalWrite(e,HIGH);
  digitalWrite(f,HIGH);
  digitalWrite(g,LOW);
}
void segA(){
  digitalWrite(a,HIGH);
  digitalWrite(b,HIGH);
  digitalWrite(c,HIGH);
  digitalWrite(d,LOW);
  digitalWrite(e,HIGH);
  digitalWrite(f,HIGH);
  digitalWrite(g,HIGH);
}

//SEM LUZ
void segE(){
  digitalWrite(a,HIGH);
  digitalWrite(b,LOW);
  digitalWrite(c,LOW);
  digitalWrite(d,HIGH);
  digitalWrite(e,HIGH);
  digitalWrite(f,HIGH);
  digitalWrite(g,HIGH);
}
void segS(){
  digitalWrite(a,HIGH);
  digitalWrite(b,LOW);
  digitalWrite(c,HIGH);
  digitalWrite(d,HIGH);
  digitalWrite(e,LOW);
  digitalWrite(f,HIGH);
  digitalWrite(g,HIGH);
}

void loop() {
  luminosidade = analogRead(pinoLdr);
  if(luminosidade < 600){
    segC();
    delay(de);
    segL();
    delay(de);
    segA();
    delay(de);
  }else{
    segE();
    delay(de);
    segS();
    delay(de);
    segC();
    delay(de);
  }
}
