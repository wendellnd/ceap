class Bola():
    pi = 3.14
    def __init__(self,cor,material,raio = 1):
       self.cor = cor
       self.material = material
       self.raio = raio
    def gera_circunferencia(self):
        return self.pi*2*self.raio
    def trocacor(self,valor):
        self.cor = self.valor
    def mostracor(self):
        print("A cor da bola é: ",self.cor)
loop = int(0)
num = float(input("Digite o raio da bola: "))
cor = input("Digite a cor: ")
mat = input("Digite o material: ")
bola1 = Bola(cor,mat,num)
print("O valor da circunferência é:",bola1.gera_circunferencia())
print(" Material:",bola1.material)
print(" Cor:",bola1.cor)

while loop == 0:
    opcao = input(" 1 - Trocar de Cor \n 2 - Mostrar Cor\n 3 - Sair\n")
    if opcao == "1":
        bola1.cor = input("Digite a cor: ")
    elif opcao == "2":
        bola1.mostracor()
    elif opcao == "3":
        loop = 1
    else:
        print("Você digitou errado!")
