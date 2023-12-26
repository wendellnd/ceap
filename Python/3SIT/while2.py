x = 0
a = " "
b = " "
while x == 0:
    a = input("Digite um nome de usuario: ")
    b = input("Digite uma senha: ")
    if a == b:
        print("O nome de usuario e senha nao podem ser iguais!")
    else:
        print("acesso permitido.")
        x = 1;
