Oint pinoLed = 7;
int pinoLdr = A1;
int luminosidade = 0;
const int a = 2;
const int b = 3;
const int c = 4;
const int d = 5;
const int e = 6;
const int f = 7;
const int g = 8;
const int pt = 9;
int de = 200;

void setup() {
  pinMode(a,OUTPUT);
  pinMode(b,OUTPUT);
  pinMode(c,OUTPUT);
  pinMode(d,OUTPUT);
  pinMode(e,OUTPUT);
  pinMode(f,OUTPUT);
  pinMode(g,OUTPUT);
  pinMode(pt,OUTPUT);
  pinMode(pinoLed,OUTPUT);
  pinMode(pinoLdr,INPUT);
  Serial.begin(9600);

}
void seg0(){
  //0
  digitalWrite(a,LOW);
  digitalWrite(b,LOW);
  digitalWrite(c,LOW);
  digitalWrite(d,LOW);
  digitalWrite(e,LOW);
  digitalWrite(f,HIGH);
  digitalWrite(g,LOW);
  digitalWrite(pt,LOW);  
}
void seg1(){
  //1
  digitalWrite(a,HIGH);
  digitalWrite(b,LOW);
  digitalWrite(c,LOW);
  digitalWrite(d,LOW);
  digitalWrite(e,LOW);
  digitalWrite(f,HIGH);
  digitalWrite(g,LOW);
  digitalWrite(pt,LOW);
}
void seg2(){
  //2
  digitalWrite(a,HIGH);
  digitalWrite(b,HIGH);
  digitalWrite(c,LOW);
  digitalWrite(d,LOW);
  digitalWrite(e,LOW);
  digitalWrite(f,HIGH);
  digitalWrite(g,LOW);
  digitalWrite(pt,LOW);
}
void seg3(){
  //3
  digitalWrite(a,HIGH);
  digitalWrite(b,HIGH);
  digitalWrite(c,HIGH);
  digitalWrite(d,LOW);
  digitalWrite(e,LOW);
  digitalWrite(f,HIGH);
  digitalWrite(g,LOW);
  digitalWrite(pt,LOW);
}
void seg4(){
  //4
  digitalWrite(a,HIGH);
  digitalWrite(b,HIGH);
  digitalWrite(c,HIGH);
  digitalWrite(d,HIGH);
  digitalWrite(e,LOW);
  digitalWrite(f,HIGH);
  digitalWrite(g,LOW);
  digitalWrite(pt,LOW);
}
void seg5(){
  //5
  digitalWrite(a,HIGH);
  digitalWrite(b,HIGH);
  digitalWrite(c,HIGH);
  digitalWrite(d,HIGH);
  digitalWrite(e,HIGH);
  digitalWrite(f,HIGH);
  digitalWrite(g,LOW);
  digitalWrite(pt,LOW);
}

void segOff(){
  //5
  digitalWrite(a,LOW);
  digitalWrite(b,LOW);
  digitalWrite(c,LOW);
  digitalWrite(d,LOW);
  digitalWrite(e,LOW);
  digitalWrite(f,LOW);
  digitalWrite(g,LOW);
  digitalWrite(pt,LOW);
}

void loop() {
  luminosidade = analogRead(pinoLdr);
  if(luminosidade < 160){
    segOff();
  }
  else if(luminosidade > 160 && luminosidade < 320){
      seg0();
  }
  else if(luminosidade > 320 && luminosidade < 480){
      seg1();
  }
  else if(luminosidade > 480 && luminosidade < 640){
      seg2();
  }
  else if(luminosidade > 640 && luminosidade < 800){
      seg3();
  }
  else if(luminosidade > 800 && luminosidade < 960){
      seg4();
  }
  else if(luminosidade > 960){
      seg5();
  }
  Serial.println(luminosidade);
} 
