from random import choice
print("Sorteio")
a = int(input("Quantos candidatos? "))
b = int(0)
n = []
while a > b:
    n.append(input("Digite o nome do canditato: "))
    b +=1
print("Lista:")
for x in n:
    print(x)
e = choice(n)
print("Premiado:",e)
