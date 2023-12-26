from random import shuffle
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
e = []
shuffle(n)
print("Ordem de premiação:")
p = int(0)
for y in n:
    p +=1
    print(str(p)+"°",y)
