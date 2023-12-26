def double(a):
    for x in a:
        print(x*2)
lista = [2,4,2,5,6,2]
x = 0
while x != 6:
    lista[x] = int(input("Digite um número: "))
    x+=1
double(lista)
