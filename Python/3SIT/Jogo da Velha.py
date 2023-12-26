import random

def ResumoXO(es,a,b,p):
    print("Jogador",es,"começa")
    while a != "X" and a != "O":
        a = input("X ou O? ")
    if a == "X":
        b = "O"
    elif a == "O":
        b = "X"
    p = 1
    return (a,b,p)
def Jogada(coor,ve,xo,p1,p2,loop,ganhap1):
    loop2 = 0
    while loop2 == 0:
        print("Jogador",ganhap1,"digite a posição(1 a 9): ", end = "")
        coor = int(input())
        if (coor >= 1 and coor <= 9) and ve[coor-1] == " ":
            ve[coor-1] = xo
            p1 = 1
            p2 = 0
            loop = Ganha(loop,xo,ve,ganhap1)
            loop2 = 1
    return (ve,p1,p2,loop)
def Ganha(loop,a,ve,ganha):
    if (ve[0] == a and ve[4] == a and ve[8] == a) or (ve[2] == a and ve[4] == a and ve[6] == a) or (ve[0] == a and ve[3] == a and ve[6] == a) or (ve[1] == a and ve[4] == a and ve[7] == a) or (ve[2] == a and ve[5] == a and ve[8] == a) or (ve[0] == a and ve[1] == a and ve[2] == a) or (ve[3] == a and ve[4] == a and ve[5] == a) or (ve[6] == a and ve[7] == a and ve[8] == a):
        print("Parabéns! Jogador",ganha,"venceu!")
        return 1
    elif ve[0] != " " and ve[1] != " " and ve[2] != " " and ve[3] != " " and ve[4] != " " and ve[5] != " " and ve[6] != " " and ve[7] != " " and ve[8] != " ":
        print("Deu velha!!!!!!!!!")
        return 1
    else:
        return 0

loopdeus = 0
while loopdeus == 0:
    ganhap1 = 1
    ganhap2 = 2
    p1 = 0
    p2 = 0
    loop = 0
    coor = 0
    xo = " "
    ox = " "
    loop3 = 0
    escolha = random.choice([1,2])
    if escolha == 1:
        xo,ox,p2 = ResumoXO(escolha,xo,ox,p2)
    elif escolha == 2:
        ox,xo,p1 = ResumoXO(escolha,ox,xo,p1)
    ve = [" "," "," "," "," "," "," "," "," "]
    while loop == 0:
        print("\n"*100+ve[0]+"|"+ve[1]+"|"+ve[2]+"\n"+ve[3]+"|"+ve[4]+"|"+ve[5]+"\n"+ve[6]+"|"+ve[7]+"|"+ve[8]+"\n")
        if p1 == 0:
            ve,p1,p2,loop = Jogada(coor,ve,xo,p1,p2,loop,ganhap1)
        elif p2 == 0:
            ve,p2,p1,loop = Jogada(coor,ve,ox,p2,p1,loop,ganhap2) 
    print(ve[0]+"|"+ve[1]+"|"+ve[2]+"\n"+ve[3]+"|"+ve[4]+"|"+ve[5]+"\n"+ve[6]+"|"+ve[7]+"|"+ve[8]+"\n")
    while loop3 == 0:
        loopdeus = int(input("Deseja jogar de novo?\n 0-Sim\n 1-Não\n"))
        if loopdeus == 0 or loopdeus == 1:
            loop3 = 1

