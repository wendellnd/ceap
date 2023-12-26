especificacao = ["Cachorro quente","Bauru Simples","Bauru com ovo","Hambúrguer","Cheeseburguer","Refrigerante"]
codigo = [100,101,102,103,104,105]
preco = [1.2,1.3,1.5,1.2,1.3,1]
a = 0
for x in especificacao:
    print(especificacao[a],"  ", codigo[a],"  ",preco[a])
    a = a+1
b = 0
c = 0
d = 0
e = 0
total = 0
f = 0
while b == 0:
    c = int(input("informe o codigo do produto desejado"))
    e = int(input("informe a quantidade desejada deste produto"))
    if c == codigo[0]:
        d = preco[0]*e
        total = total+d
    elif c == codigo[1]:
        d = preco[1]*e
        total = total+d
    elif c == codigo[2]:
        d = preco[2]*e
        total = total+d
    elif c == codigo[3]:
        d = preco[3]*e
        total = total+d
    elif c == codigo[4]:
        d = preco[4]*e
        total = total+d
    elif c == codigo[5]:
        d = preco[5]*e
        total = total+d
    else:
        print("Valor inválido!")
    f = input("Voce quer outro produto?\n 1-Sim\n 2-Não\n")
    if f == "2":
        b = 1
print("O total é:",total)
