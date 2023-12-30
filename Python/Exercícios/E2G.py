import math
while True:
    x = input("Deseja começar (S/N): ")
    if x.upper() != "S":
        break
    a = int(input("Digite o valor do coeficiente a: "))
    b = int(input("Digite o valor do coeficiente b: "))
    c = int(input("Digite o valor do coeficiente c: "))
    delta = b**2 - 4*a*c
    print ("O valor de delta é: ", delta)
    n = math.sqrt(delta)
    x1 = (-b - (n))/2*a
    x2 = (-b + (n))/2*a
    print ("O valor de x1 é: ", x1)
    print ("O valor de x2 é: ", x2)
