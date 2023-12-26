int chama = A4;
int buzzer = 7;
int gas = 5;
int vermelho = 8;
void setup() {
Serial.begin(9600);
pinMode(vermelho,OUTPUT);
pinMode(buzzer,OUTPUT);
}

void loop() {
int leitura = analogRead(chama);
int leitura_gas = digitalRead(gas);
if(leitura >= 10){
  digitalWrite(vermelho,HIGH);
  tone(7,1);
  delay(1000);
  noTone(7);
  delay(1000);
}else{
  digitalWrite(vermelho,LOW);
  digitalWrite(buzzer,LOW);
}
if(leitura_gas == 1){
  digitalWrite(vermelho,HIGH);
  tone(7,10);
  delay(1000);
  noTone(7);
  delay(1000);
}else{
  digitalWrite(vermelho,LOW);
  digitalWrite(buzzer,LOW);
} 
}
