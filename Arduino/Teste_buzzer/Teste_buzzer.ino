void setup() {
pinMode(7,OUTPUT);

}

void loop() {
  // put your main code here, to run repeatedly:
  tone(7,10);
  delay(1000);
  noTone(7);
  delay(1000);
}
