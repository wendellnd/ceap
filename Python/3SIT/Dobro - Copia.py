def double(a):
    for x in a:
        x = x*2
        print(x)
         
lista = [2,4,2,5,6,2]
x = 0
while x != 6:
    lista[x] = int(input("Digite um número: "))
    x+=1
double(lista)
b = 0
z = 0
while z == 0:
    b = int(input("Deseja dobrar mais uma vez\n1 - sim\n2 - nao\n"))
    if b == 1:
        double(lista)
    elif b == 2:
        z = 1
    else:
        print("Você digitou errado\n")
#Não terminamos ;-;
