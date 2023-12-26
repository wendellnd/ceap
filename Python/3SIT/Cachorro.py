class Dog():
    def __init__(self,nome,cor,idade):
        self.nome = nome
        self.cor = cor
        self.idade = idade
    def latir(self, num):
        while(num > 0):
            print(self.nome)
            num = num-1
new_dog = Dog("AA","aaa",4)
num = int(input("Quantas vezes o cachorro vai latir?"))
new_dog.latir(num)


