from random import randint,choice
print("Uma charada será sorteada!")
print("ATENÇÃO: Todas as palavras começam com letra maiuscula!")
charada = randint(1,4)
if charada == 1:
    print("Parte do corpo")
    c = input
    partes = ["Braço","Coração","Olho","Mão"]
    partes_2 = choice(partes)
    t = int(0)
    while c != partes_2:
        c = input("Digite seu palpite: ")
        t +=1
    print("Voçê acertou em",t,"tentativas")
    print("Fim de jogo!")
elif charada == 2:
    print("Animal grande")
    c = input
    animal = ["Girafa","Elefante","Baleia","Hipopotamo"]
    animal_2 = choice(animal)
    t = int(0)
    while c != animal_2:
        c = input("Digite seu palpite: ")
        t +=1
    print("Voçê acertou em",t,"tentativas")
    print("Fim de jogo!")
elif charada == 3:
    print("Aula")
    c = input
    aula = ["Programação","RHU","NAD","LIN"]
    aula_2 = choice(aula)
    t = int(0)
    while c != aula_2:
        c = input("Digite seu palpite: ")
        t +=1
    print("Voçê acertou em",t,"tentativas")
    print("Fim de jogo!")
elif charada == 4:
    print("Esporte")
    c = input
    esporte = ["Futebol","Basquete","Volei","Handbol"]
    esporte_2 = choice(esporte)
    t = int(0)
    while c != esporte_2:
        c = input("Digite seu palpite: ")
        t +=1
    print("Voçê acertou em",t,"tentativas")
    print("Fim de jogo!")
