class Circulo():
    pi = 3.14
    def __init__(self,raio = 1):
        self.raio = raio
    def gera_circunferencia(self):
        return self.raio*self.pi*2
    def gera_diametro(self):
        return self.raio*2
    def gera_area(self):
        return self.pi*self.raio*self.raio
num = float(input("Digite o valor do raio: "))
circulo1 = Circulo(num)
print("O valor do raio é: ",circulo1.raio)
print("O valor da cincunferência é: ",circulo1.gera_circunferencia())
print("O valor do diâmetro é: ",circulo1.gera_diametro())
print("O valor da área é: ",circulo1.gera_area())
