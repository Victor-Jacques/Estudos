num = int(input("Insira um número para calcular o fatorial: "))
fatorial = 1
x = 1

while x <= num:
    fatorial = x * fatorial
    x += 1

print(fatorial)
