#1
print("oi")
#2
a = input("digita o numero: ")
print("O número digitado é: "+a)
#3
b = int(input("digit o numer "))
c = int(input("digit o oto "))
print (b+c)
#4
d = float(input("digit a primera nota "))
e = float(input("digit a segunda "))
f = float(input("digit a tercera "))
g = float(input("digit quarta "))
media = float((d+e+f+g)/4)
print("media",media)
#5
h = float(input("digit uns metro "))
print("valor em cm:",h*100)
#6
i = float(input("qual o raio do seu circulo?"))
j = 3.14*(i*i)
print("a area eh",j)
#7
k = float(input("DIGITA O LADO DO QUADRADR"))
print("O DOBRO DA AREA DO QUADRADO E",(k*k)*2)
#8
l = float(input("digit a quanto vc ganha por hr "))
m = float(input("digit quantas zora vc trabalho no mes "))
print("vc ganho isso nesse mes: ",l*m)
#9
n = float(input("digit a temperatura em farenheit "))
print("temperatura em celcius",(5*(n-32)/9))
#10
o = float(input("digita a temperatura em celsos"))
print("a temperatura em farenheit eh",(o*9/5)+32)
#11
p = int(input("digite um numero inteiro"))
q = int(input("digite otro"))
r = float(input("digite um real agr"))
print("o dobro do primeiro com metade do segundo", ((p*2)+(q/2)))
print("soma do triplo do primeiro com o terceiro", ((p*3)+r))
print("o terceiro ao cubo", r*r*r)
#12
s = float(input("digita a altura em metros "))
print("o peso ideal eh", ((72.7*s)-58))
#13
print("o peso ideal para homes eh", ((72.7*s)-58))
print("o peso ideal para molieres eh", ((62.1*s)-44.7))
#14
peso = float(input("digita o peso dos pexe"))
estado = peso-50
if estado > 0 :
    print("ce vai ter q paga", estado*4)
    print("e imposto é roubo")
else:
    print("taokei")
#15
l = float(input("digit a quanto vc ganha por hr "))
m = float(input("digit quantas zora vc trabalho no mes "))
t = l*m
ir = (t/100)*11
inss = (t/100)*8
sind = (t/100)*5
print("vc ganho isso nesse mes: ",t)
print("Desconto do INSS:", inss)
print("Desconto do Sindicato:", sind)
print("Salário líquido:", (t-ir-inss-sind))
#16
u = float(input("digit a area que será pintada em metros quadrados "))
v = (u/3)/18
print("Vc vai gastar ",v,"latas de tinta\n O equivalente a", (v*80),"reais")
#17
u = float(input("digit a area que será pintada em metros quadrados "))
v = (u/6)/18
w = (u/6)/3.6
print("Vc vai gastar ",v,"latas de tinta\n O equivalente a", (v*80),"reais")
