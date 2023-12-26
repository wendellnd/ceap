### PROJETO JOGO DA VELHA - 3SRT - PROF ALEF ###
#Murilo Augusto Pereira Nascimento, Wendell Nascimento Dourado
#Explique como a função funciona:
    #Imprime o tabuleiro (vetor string de 10 posições) com linhas verticais para separar cada posição em colunas e traços horizontais após 3 colunas serem exibidas. Além de imprimir o vetor inteiro logo após.
def mostra_tabuleiro(tabuleiro):
    print('\n'*100)
    print(tabuleiro[1]+'|'+tabuleiro[2]+'|'+tabuleiro[3])
    print('-'*5)
    print(tabuleiro[4]+'|'+tabuleiro[5]+'|'+tabuleiro[6])
    print('-'*5)
    print(tabuleiro[7]+'|'+tabuleiro[8]+'|'+tabuleiro[9])
    print('\n', tabuleiro)
#Teste da função:
    '''
    def mostra_tabuleiro(tabuleiro):
        print('\n'*100)
        print(tabuleiro[1]+'|'+tabuleiro[2]+'|'+tabuleiro[3])
        print('-'*5)
        print(tabuleiro[4]+'|'+tabuleiro[5]+'|'+tabuleiro[6])
        print('-'*5)
        print(tabuleiro[7]+'|'+tabuleiro[8]+'|'+tabuleiro[9])
        print('\n', tabuleiro)
    tabuleiro = [" ","a","b","c","d","e","f","g","h","i"]
    mostra_tabuleiro(tabuleiro)
    '''

#Explique como a função funciona:
    #Define X ou O. O player 1 decide qual marcador ele deseja por meio de um input que é mantido em loop até que o usuário dê um valor válido. O player 2 recebe seu "oposto" e a função retorna os valores de player 1 e player 2, respectivamente. 
def player_escolha():
    '''
    OUTPUT = (player 1 marcador, player 2 marcador)
    '''

    marcador = ''

    while marcador != 'X' and marcador != 'O':
        marcador = input('Player1: Escolha X ou O: ').upper()
    if marcador == 'X':
        return('X','O')
    else:
        return('O','X')
#Testando a função:
    '''
    def player_escolha():

        marcador = ''

        while marcador != 'X' and marcador != 'O':
            marcador = input('Player1: Escolha X ou O: ').upper()
        if marcador == 'X':
            return('X','O')
        else:
            return('O','X')
    a,b = player_escolha()
    print("Jogador 1:",a,"\nJogador 2:",b)
    '''

#Explique como a função funciona:
    #Faz a posição escolhida no vetor do tabuleiro receber o marcador do player que a escolheu.
def place_marcador(tabuleiro, marcador, posicao):
    tabuleiro[posicao] = marcador
#teste:
    '''
    def place_marcador(tabuleiro, marcador, posicao):
        tabuleiro[posicao] = marcador
    tabuleiro = [' ']*10
    marcador = input("X ou O")
    posicao = int(input("digita 1-9"))
    place_marcador(tabuleiro,marcador,posicao)
    print(tabuleiro)
    '''
#Explique como a função funciona:
    #Retorna a comparação responsável por verificar as condições de vitória.
def vitoria_check(tabuleiro, marcador):
    return (tabuleiro[1]==tabuleiro[2]==tabuleiro[3]==marcador) or (tabuleiro[4]==tabuleiro[5]==tabuleiro[6]==marcador) or(tabuleiro[7]==tabuleiro[8]==tabuleiro[9]==marcador) or(tabuleiro[1]==tabuleiro[4]==tabuleiro[7]==marcador) or(tabuleiro[2]==tabuleiro[5]==tabuleiro[8]==marcador) or(tabuleiro[3]==tabuleiro[6]==tabuleiro[9]==marcador) or (tabuleiro[1]==tabuleiro[5]==tabuleiro[9]==marcador) or(tabuleiro[3]==tabuleiro[5]==tabuleiro[7]==marcador)
#teste:

#Explique como a função funciona:
    #Sorteia 0 ou 1 dentro da variável moeda, compara o seu valor e retorna o player correspondente.
import random
def vai_primeiro():
    moeda = random.randint(0,1)
    if moeda == 0:
        return 'Player 1'
    else:
        return 'Player 2'
#teste:

#Explique como a função funciona:
    #Retorna um espaço vazio na posição recebida, referente ao vetor do tabuleiro.
def espaco_vazio(tabuleiro, posicao):
    return tabuleiro[posicao] == ' '
#teste:

#Explique como a função funciona:
    #Recebe o vetor tabuleiro, verifica todas as posições do vetor e retorna falso se alguma estiver vazia, do contrário, o tabuleiro está cheio e a função retorna verdadeiro.
def tabuleiro_cheio(tabuleiro):
    for i in range(1,10):
        if espaco_vazio(tabuleiro, i):
            return False
    #Se verificamos o tabuleiro td no for e n retornou
    #falso, entao já está cheio e retorna Vdd
    return True
#teste:

#Explique como a função funciona:
    #Recebe o tabuleiro. Recebe a posição digitada pelo usuário usando um loop que repete até que a posição digitada esteja entre 1-9 e seja igual a um espaço vazio e a retorna.
def player_jogada(tabuleiro):
    posicao = 0

    while posicao not in [1,2,3,4,5,6,7,8,9] or not espaco_vazio(tabuleiro, posicao):
        posicao = int(input('Escolha a posicao: (1-9) '))
    return posicao

#Explique como a função funciona:
    #Recebe um input em uma variável e retorna uma comparação com esta variável. 
def replay():
    choice = input("Jogar de novo? s ou n")

    return choice == 's'

# LOOP WHILE PRA DEIXAR O JOGO RODANDO (Aqui o jogo inicia e executamos as funções criadas)
print("Vamos jogar Jogo da Velha!")

while True:
    #PLAY THE GAME

    ##INICIA TD (tabuleiro, qm vai 1o, escolha marcador X, O)
    tabuleiro_jogo = [' ']*10
    player1_marcador, player2_marcador = player_escolha()

    turno = vai_primeiro()
    print (turno + ' joga primeiro')

    play_game = input("Preparado para jogar? s ou n?")

    if play_game == 's':
        game_on = True
    else:
        game_on = False

    ##GAME PLAY

    while game_on:
        ###PLAYER1 turno
        if turno == 'Player 1':

            #
            mostra_tabuleiro(tabuleiro_jogo)
            #
            posicao = player_jogada(tabuleiro_jogo)
            #
            place_marcador(tabuleiro_jogo, player1_marcador, posicao)
            #
            if vitoria_check(tabuleiro_jogo, player1_marcador):
                mostra_tabuleiro(tabuleiro_jogo)
                print("Player 1 GANHOU!")
                game_on = False
            #
            else:
                if tabuleiro_cheio(tabuleiro_jogo):
                    mostra_tabuleiro(tabuleiro_jogo)
                    print("Deu VELHA!")
                    game_on = False
                    break
                else:
                    turno = "Player 2"
            

            #Sem vitoria ou empate? vez do 2o jogador
        
        ###PLAYER2 turno
        else:
            #
            mostra_tabuleiro(tabuleiro_jogo)
            #
            posicao = player_jogada(tabuleiro_jogo)
            #
            place_marcador(tabuleiro_jogo, player2_marcador, posicao)
            #
            if vitoria_check(tabuleiro_jogo, player2_marcador):
                mostra_tabuleiro(tabuleiro_jogo)
                print("Player 2 GANHOU!")
                game_on = False
            else:
                if tabuleiro_cheio(tabuleiro_jogo):
                    mostra_tabuleiro(tabuleiro_jogo)
                    print("Deu VELHA!")
                    game_on = False
                    break
                else:
                    turno = "Player 1"
            

            #Sem vitoria ou empate? vez do 2o jogador
        

    if not replay():
        break
