palavra = input("")
v = 0
result = ""
for j in palavra:
    if v < 4:
        result = result + j
        v = v + 1
    else:
        result = j + result

print(result)
    
