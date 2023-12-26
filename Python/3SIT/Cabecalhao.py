def frame(a,b,c):
    while(b > -4):
        print("=", end = "")
        b = b-1
    print("\n||"+a+"||")
    while(c > -4):
        print("=", end = "")
        c = c-1
x = 0
resp = ""
while(x == 0):
    a = input("\nDigite a mensagem: ")
    b = len(a)
    c = len(a)
    frame(a,b,c)
    z = 0
    while(z == 0):
        resp = input("\nDeseja fazer outro cabeçalho? \n1-Sim\n2-Não\n")
        if(resp == "1"):
            x = 0
            z = 1
        elif(resp == "2"):
            x = 1
            z = 1
        else:
            print("Voce digitou errado! \n")

