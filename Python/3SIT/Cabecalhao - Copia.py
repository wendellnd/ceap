def frame(a,b,c):
    while(b > -4):
        print("=", end = "")
        b = b-1
    print("\n||"+a+"||")
    while(c > -4):
        print("=", end = "")
        c = c-1

    a = input("Digite a mensagem: ")
    b = len(a)
    c = len(a)
    frame(a,b,c)

