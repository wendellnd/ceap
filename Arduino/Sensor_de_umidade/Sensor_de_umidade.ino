int vermelho = 9;
int verde = 8;
int sensor = A2;
void setup() {
pinMode(vermelho,OUTPUT);
pinMode(verde,OUTPUT);
Serial.begin(9600); 

}

void loop() {
int leitura = analogRead(sensor);
Serial.println(leitura);
if (leitura >= 600){
  digitalWrite(vermelho,HIGH);
  digitalWrite(verde,LOW);
}else{
  digitalWrite(vermelho,LOW);
  digitalWrite(verde,HIGH);
}
}
