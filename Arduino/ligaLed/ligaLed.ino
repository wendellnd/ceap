  const int pinoBotao = 10;
const int pinoLed = 3;

int estadoBotao = 0;
int estadoLed = 0;

void setup() {
  pinMode(pinoLed, OUTPUT);
  pinMode(pinoBotao, INPUT);
}

void loop() {
  estadoBotao = digitalRead(pinoBotao);
  if (estadoBotao == HIGH){
    if (estadoLed == 0){
      digitalWrite(pinoLed, HIGH);
      delay(200);
      estadoLed = 1;
    }else{
      digitalWrite(pinoLed, LOW);
      delay(200);
      estadoLed = 0;
    }
  }
}
