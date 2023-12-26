from random import randint,shuffle,choice
print("Sorteio")
nm = int(input("A partir de: "))
nmx = int(input("Até: "))
modo = input(" 1-Um sorteado\n 2-Ordem dos números\n 3-Quantidade de sorteados\n Como quer sortear? ")
lista = []
numero = int(0)
if modo == "1":
    sorte = randint(nm,nmx)
    print("Sorteado:",sorte)
elif modo == "2":
    while nm <= nmx:
        numero = nm
        nm+=1
        lista.append(numero)
    shuffle(lista)
    conta = int(0)
    for x in lista:
        conta+=1
        print(str(conta)+"°-",x)
elif modo == "3":
    qs = int(input("Quantos sorteados? "))
    while nm <= nmx:
        numero = nm
        nm+=1
        lista.append(numero)
    shuffle(lista)
    qs_2 = int(qs)
    var = int(0)
    while qs_2 >= qs:
        var = choice(lista)
        if var != var:
            

