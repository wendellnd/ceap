#Murilo Augusto Pereira Nascimento
#Wendell Nascimento Dourado
def Soma(a,b):
    x = a+b
    return x
def Subt(a,b):
    x = a-b
    return x
def Mult(a,b):
    x = a*b
    return x
def Divi(a,b):
    if b != 0:
        x = a/b
    else:
        print("Não é possível dividir números por 0")
    return x
def Pote(a,b):
    x = a**b
    return x
def Resu(a,b,c,d):
    if a == 1:
        print(b,"+",c,"=",d)
    if a == 2:
        print(b,"-",c,"=",d)
    if a == 3:
        print(b,"*",c,"=",d)
    if a == 4:
        print(b,"/",c,"=",d)
    if a == 5:
        print(b,"+",c,"=",d)
def inpu(c,a,b):
    x = 0
    if c == 1:
        x = Soma(a,b)
    if c == 2:
        x = Subt(a,b)
    if c == 3:
        x = Mult(a,b)
    if c == 4:
        x = Divi(a,b)
    if c == 5:
        x = Pote(a,b)
    return x        
loopzin = 0
zin = 0
z = 0
y = 0
while loopzin == 0:
    a = int(input("Digite o número correspondente a operação:\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Potenciação\n"))
    c = float(input("Digite o primeiro valor: "))
    b = float(input("Digite o segundo valor: "))
    z = inpu(a,c,b)
    Resu(a,c,b,z)
    y = 0
    while y == 0:
        zin = int(input("Deseja refazer o programa? \n1-Sim\n2-Não\n"))
        if zin == 1:
            loopzin = 0
            y = 1
        elif zin == 2:
            loopzin = 1
            y = 1
        else:
            print("Voce digitou errado!\n")
