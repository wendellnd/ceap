int m1 = 7;
int m2 = 8;
int m3 = 9;
int m4 = 10;

void setup() {
 pinMode(m1,OUTPUT);
 pinMode(m2,OUTPUT);
 pinMode(m3,OUTPUT);
 pinMode(m4,OUTPUT);
 
}

void loop() {

  Frente();

}
void Frente(){
  digitalWrite(m1,LOW);
  digitalWrite(m2,HIGH);
  digitalWrite(m3,HIGH);
  digitalWrite(m4,LOW);u
}
void Tras(){
  digitalWrite(m1,HIGH);
  digitalWrite(m2,LOW);
  digitalWrite(m3,LOW);
  digitalWrite(m4,HIGH);
}
void Direita(){
  digitalWrite(m1,LOW);
  digitalWrite(m2,HIGH);
  digitalWrite(m3,LOW);
  digitalWrite(m4,LOW);
}
void Esquerda(){
  digitalWrite(m1,LOW);
  digitalWrite(m2,LOW);
  digitalWrite(m3,HIGH);
  digitalWrite(m4,LOW);
}
void Para(){
  digitalWrite(m1,LOW);
  digitalWrite(m2,LOW);
  digitalWrite(m3,LOW);
  digitalWrite(m4,LOW);
  
}
