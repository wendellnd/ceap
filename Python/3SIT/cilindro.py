class Cilindro():
    pi = 3.14
    def __init__(self, raio = 1, altura = 1):
        self.raio = raio
        self.altura = altura
    def gera_basearea(self):
        return self.pi*self.raio*self.raio
    def gera_volume(self):
        return self.gera_basearea()*self.altura
    def gera_lateral(self):
        return self.pi*2*self.raio*self.altura
    def gera_superarea(self):
        return self.gera_basearea()*2+self.gera_lateral()
num = float(input("Digite o valor do raio: "))
num2 = float(input("Digite o valor da altura: "))
cilindro1 = Cilindro(num,num2)
print("O valor da área da base é: ", cilindro1.gera_basearea())
print("O valor do volume é: ",cilindro1.gera_volume())
print("O valor da superficie lateral é: ",cilindro1.gera_lateral())
print("O valor da superficie é: ",cilindro1.gera_superarea())


        
