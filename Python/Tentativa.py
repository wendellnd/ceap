print(" Usuário e senha\n Você só tem três tentativas\n ")
n = input
s = input
tentativa = int(0)
while tentativa < 3:
    n = input("Digite seu nome: ")
    s = input("Digite sua senha: ")
    if n == "Wendell" and s == "123":
        print("Login liberado!")
        tentativa = 4
    if n != "Wendell" or s != "123":
        print("Tentativa falha!")
        tentativa = tentativa+1
if tentativa == 3:
    print("Suas tentativas acabaram!")
