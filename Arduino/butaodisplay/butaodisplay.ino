const int botao = 10;
int estbotao = 0;
const int a = 2;
const int b = 3;
const int c = 4;
const int d = 5;
const int e = 6;
const int f = 7;
const int g = 8;
const int pt = 9;
int cont = 0;
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
  pinMode(botao,INPUT);
}

void seg0(){
  //0
  digitalWrite(a,HIGH);
  digitalWrite(b,HIGH);
  digitalWrite(c,HIGH);
  digitalWrite(d,HIGH);
  digitalWrite(e,HIGH);
  digitalWrite(f,HIGH);
  digitalWrite(g,LOW);
  digitalWrite(pt,LOW);  
}
void seg1(){
  //1
  digitalWrite(a,LOW);
  digitalWrite(b,HIGH);
  digitalWrite(c,HIGH);
  digitalWrite(d,LOW);
  digitalWrite(e,LOW);
  digitalWrite(f,LOW);
  digitalWrite(g,LOW);
  digitalWrite(pt,LOW);
}
void seg2(){
  //2
  digitalWrite(a,HIGH);
  digitalWrite(b,HIGH);
  digitalWrite(c,LOW);
  digitalWrite(d,HIGH);
  digitalWrite(e,HIGH);
  digitalWrite(f,LOW);
  digitalWrite(g,HIGH);
  digitalWrite(pt,LOW);
}
void seg3(){
  //3
  digitalWrite(a,HIGH);
  digitalWrite(b,HIGH);
  digitalWrite(c,HIGH);
  digitalWrite(d,HIGH);
  digitalWrite(e,LOW);
  digitalWrite(f,LOW);
  digitalWrite(g,HIGH);
  digitalWrite(pt,LOW);
}
void seg4(){
  //4
  digitalWrite(a,LOW);
  digitalWrite(b,HIGH);
  digitalWrite(c,HIGH);
  digitalWrite(d,LOW);
  digitalWrite(e,LOW);
  digitalWrite(f,HIGH);
  digitalWrite(g,HIGH);
  digitalWrite(pt,LOW);
}
void seg5(){
  //5
  digitalWrite(a,HIGH);
  digitalWrite(b,LOW);
  digitalWrite(c,HIGH);
  digitalWrite(d,HIGH);
  digitalWrite(e,LOW);
  digitalWrite(f,HIGH);
  digitalWrite(g,HIGH);
  digitalWrite(pt,LOW);
}
void seg6(){
  //6
  digitalWrite(a,HIGH);
  digitalWrite(b,LOW);
  digitalWrite(c,HIGH);
  digitalWrite(d,HIGH);
  digitalWrite(e,HIGH);
  digitalWrite(f,HIGH);
  digitalWrite(g,HIGH);
  digitalWrite(pt,LOW);
}
void seg7(){
  //7
  digitalWrite(a,HIGH);
  digitalWrite(b,HIGH);
  digitalWrite(c,HIGH);
  digitalWrite(d,LOW);
  digitalWrite(e,LOW);
  digitalWrite(f,LOW);
  digitalWrite(g,LOW);
  digitalWrite(pt,LOW);
}
void seg8(){
  //8
  digitalWrite(a,HIGH);
  digitalWrite(b,HIGH);
  digitalWrite(c,HIGH);
  digitalWrite(d,HIGH);
  digitalWrite(e,HIGH);
  digitalWrite(f,HIGH);
  digitalWrite(g,HIGH);
  digitalWrite(pt,LOW);
}
void seg9(){
  //9
  digitalWrite(a,HIGH);
  digitalWrite(b,HIGH);
  digitalWrite(c,HIGH);
  digitalWrite(d,LOW);
  digitalWrite(e,LOW);
  digitalWrite(f,HIGH);
  digitalWrite(g,HIGH);
  digitalWrite(pt,LOW);
}
void segA(){
  //A
  digitalWrite(a,HIGH);
  digitalWrite(b,HIGH);
  digitalWrite(c,HIGH);
  digitalWrite(d,LOW);
  digitalWrite(e,HIGH);
  digitalWrite(f,HIGH);
  digitalWrite(g,HIGH);
  digitalWrite(pt,LOW);
}
void segB(){
  //b
  digitalWrite(a,LOW);
  digitalWrite(b,LOW);
  digitalWrite(c,HIGH);
  digitalWrite(d,HIGH);
  digitalWrite(e,HIGH);
  digitalWrite(f,HIGH);
  digitalWrite(g,HIGH);
  digitalWrite(pt,LOW);
}
void segC(){
    //C
  digitalWrite(a,HIGH);
  digitalWrite(b,LOW);
  digitalWrite(c,LOW);
  digitalWrite(d,HIGH);
  digitalWrite(e,HIGH);
  digitalWrite(f,HIGH);
  digitalWrite(g,LOW);
  digitalWrite(pt,LOW);
}
void segD(){
  //d
  digitalWrite(a,LOW);
  digitalWrite(b,HIGH);
  digitalWrite(c,HIGH);
  digitalWrite(d,HIGH);
  digitalWrite(e,HIGH);
  digitalWrite(f,LOW);
  digitalWrite(g,HIGH);
  digitalWrite(pt,LOW);
}
void segE(){
  //E
  digitalWrite(a,HIGH);
  digitalWrite(b,LOW);
  digitalWrite(c,LOW);
  digitalWrite(d,HIGH);
  digitalWrite(e,HIGH);
  digitalWrite(f,HIGH);
  digitalWrite(g,HIGH);
  digitalWrite(pt,LOW);
}
void segF(){
  //F
  digitalWrite(a,HIGH);
  digitalWrite(b,LOW);
  digitalWrite(c,LOW);
  digitalWrite(d,LOW);
  digitalWrite(e,HIGH);
  digitalWrite(f,HIGH);
  digitalWrite(g,HIGH);
  digitalWrite(pt,LOW);
}

void loop() {
  estbotao = digitalRead(botao);
  if(estbotao == HIGH && cont == 0){
  while(estbotao == HIGH){
    estbotao = digitalRead(botao);
    seg0();
  }
  cont++;
  delay(de);
  }
  else if(estbotao == HIGH && cont == 1){
  while(estbotao == HIGH){
    estbotao = digitalRead(botao);
    seg1();
  }
  cont++;
  Serial.print(cont);
  delay(de);
  }
  else if(estbotao == HIGH && cont == 2){
  while(estbotao == HIGH){
    estbotao = digitalRead(botao);
    seg2();
  }
  cont++;
  Serial.print(cont);
  delay(de);
  }
  else if(estbotao == HIGH && cont == 3){
  while(estbotao == HIGH){
    estbotao = digitalRead(botao);
    seg3();
  }
  cont++;
  Serial.print(cont);
  delay(de);
  }
  else if(estbotao == HIGH && cont == 4){
  while(estbotao == HIGH){
    estbotao = digitalRead(botao);
    seg4();
  }
  cont++;
  Serial.print(cont);
  delay(de);
  }
  else if(estbotao == HIGH && cont == 5){
  while(estbotao == HIGH){
    estbotao = digitalRead(botao);
    seg5();
  }
  cont++;
  Serial.print(cont);
  delay(de);
  }
  else if(estbotao == HIGH && cont == 6){
  while(estbotao == HIGH){
    estbotao = digitalRead(botao);
    seg6();
  }
  cont++;
  Serial.print(cont);
  delay(de);
  }
  else if(estbotao == HIGH && cont == 7){
  while(estbotao == HIGH){
    estbotao = digitalRead(botao);
    seg7();
  }
  cont++;
  Serial.print(cont);
  delay(de);
  }
  else if(estbotao == HIGH && cont == 8){
  while(estbotao == HIGH){
    estbotao = digitalRead(botao);
    seg8();
  }
  cont++;
  Serial.print(cont);
  delay(de);
  }
  else if(estbotao == HIGH && cont == 9){
  while(estbotao == HIGH){
    estbotao = digitalRead(botao);
    seg9();
  }
  cont++;
  Serial.print(cont);
  delay(de);
  }
  else if(estbotao == HIGH && cont == 10){
  while(estbotao == HIGH){
    estbotao = digitalRead(botao);
    segA();
  }
  cont++;
  Serial.print(cont);
  delay(de);
  }
  else if(estbotao == HIGH && cont == 11){
  while(estbotao == HIGH){
    estbotao = digitalRead(botao);
    segB();
  }
  cont++;
  Serial.print(cont);
  delay(de);
  }
  else if(estbotao == HIGH && cont == 12){
  while(estbotao == HIGH){
    estbotao = digitalRead(botao);
    segC();
  }
  cont++;
  Serial.print(cont);
  delay(de);
  }
  else if(estbotao == HIGH && cont == 13){
  while(estbotao == HIGH){
    estbotao = digitalRead(botao);
    segD();
  }
  cont++;
  Serial.print(cont);
  delay(de);
  }
  else if(estbotao == HIGH && cont == 14){  
  while(estbotao == HIGH){
    estbotao = digitalRead(botao);
    segE();
  }
  cont++;
  Serial.print(cont);
  delay(de);
  }
  else if(estbotao == HIGH && cont == 15){
  while(estbotao == HIGH){
    estbotao = digitalRead(botao);
    seg0();
  }
  cont = 0;
  Serial.print(cont);
  delay(de);
  }
}
