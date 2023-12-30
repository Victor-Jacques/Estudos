import time
import random
k = 0
palavra = ("piranha" , "calcinha" , "xereca")
undeline1 = ["_", "_", "_", "_", "_", "_", "_",]
undeline2 = ["_", "_", "_", "_", "_", "_", "_", "_",]
undeline3 = ["_", "_", "_", "_", "_", "_",]
palavra_secreta = random.choice(palavra)
letras_escolhidas_pela_pessoa = []
tentativas = 8
acertos = 0

print("="*20)
print("Jogo da Forca")
print("=*20")
print("Ola, você quer jogar um jogo ?")
jogar = str(input("Sim ou não: ")).strip().upper()

if jogar == "SIM":
    print("Você tem 8 chances para acertar a palavra! Se não teu pai vai dançar com o bluesão")
    print("\033[31mPensando em palavra...")
    time.sleep(3)
    print("\033[30mPalavra escolhida com sucesso!")
    print("A palavra escolhida tem {} letras".format(len(palavra_secreta)))
    print("_"*len(palavra_secreta))

else:
    print("Até a próxima seu bunda mole!")


while True:
    print("Qual letra você acha que tem a palavra?")
    letra = str(input("letra: "))
    letras_escolhidas_pela_pessoa.append(letra)
    print("Letras tentadas{}".format(letras_escolhidas_pela_pessoa))

    if palavra_secreta == "piranha":
        if letra in palavra_secreta:
            print("Você acertou uma letra na {} posição".format(palavra_secreta.index(letra)))
            undeline1[palavra_secreta.index(letra)] = (letra)
            print(undeline1)
            acertos += 1
            
        else:
            k = k+1
            print("Não consegue né ?")
            tentativas -= 1
            print("Agora você tem {} chances".format(8-k))
            if tentativas <= 0:
                print("Você foi de brazzers!")
                break
            if acertos == 7:
                print("Parabéns, você é uma piranha!")
                break

    if palavra_secreta == "calcinha":
        if letra in palavra_secreta:
            print("Você acertou uma letra na {} posição".format(palavra_secreta.index(letra)))
            undeline2[palavra_secreta.index(letra)] = (letra)
            print(undeline2)
            acertos += 1

        else:
            k = k+1
            print("Não consegue né ?")
            tentativas -= 1
            print("Agora você tem {} chances".format(8-k))
            if tentativas <= 0:
                print("Você foi de brazzers!")
                break
            if acertos == 8:
                print("Parabéns, seu pai usa calcinha!")
                break

    if palavra_secreta == "xereca":
        if letra in palavra_secreta:
            print("Você acertou uma letra na {} posição".format(palavra_secreta.index(letra)))
            undeline3[palavra_secreta.index(letra)] = (letra)
            print(undeline3)
            acertos += 1

        else:
            k = k+1
            print("Não consegue né ?")
            tentativas -= 1
            print("Agora você tem {} chances".format(8-k))
            if tentativas <= 0:
                print("Você foi de brazzers!")
                break
            if acertos == 6:
                print("Parabéns, você um xerequinha!")
                break
