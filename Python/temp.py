
try:
    celsius = int(input('Enter temperature value in celsius(integer only): '))
    fahrenheit = (celsius * 9/5) + 32
    kelvin = celsius + 273.15
    print('Temperature in fahrenheit is: ', fahrenheit)
    print('Temperature in kelvin is: ', kelvin)
except:
    print('Invalid input')


names = ["Josh", "Drake", "Clebin", "Wanderley"]
for i in names:
    print (i)
    
