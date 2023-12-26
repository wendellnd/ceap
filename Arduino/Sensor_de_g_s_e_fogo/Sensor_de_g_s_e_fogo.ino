//Quardando as informações dentro de variaveis
int fogo = A2;
int gas = A1;
int led = 13;
int buzzer = 2;
void setup() {
//Definindo as variaveis
pinMode(fogo,INPUT);
pinMode(gas,INPUT);
pinMode(led,OUTPUT);
pinMode(buzzer,OUTPUT);
//Ativando porta serial
Serial.begin(9600);
}

void loop() {
//Quardando a leitura do sensor dentro de uma variavel
int leitura_gas = analogRead(gas);
int leitura_fogo = analogRead(fogo);
//Se chamas forem detectadas pelo sensor
if(leitura_fogo <= 600){
  digitalWrite(led,HIGH);
  digitalWrite(buzzer,HIGH);
  delay(1500);
  digitalWrite(buzzer,LOW);
  delay(1500);
}else{
  digitalWrite(led,LOW);
  digitalWrite(buzzer,LOW);
}
//Gás detectado
if(leitura_gas <= 600){
  digitalWrite(led,HIGH);
  digitalWrite(buzzer,HIGH);
  delay(500);
  digitalWrite(buzzer,LOW);
  delay(500);
}else{
 digitalWrite(led,LOW);
 digitalWrite(buzzer,LOW); 
}
}
