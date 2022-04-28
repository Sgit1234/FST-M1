
numberlist1 = [7, 28, 28, 15, 121]
numberlist2 = [16, 43, 88, 36, 19]

Finalset =[]

print ("First set of numbers")
print(numberlist1)
print ("Second set of numbers")
print(numberlist2)

for odd in numberlist1:
    if(odd % 2 != 0):
        Finalset.append(odd)
for even in numberlist2:
    if(even % 2 == 0):  
        Finalset.append(even)
print("Final list is:")
print(Finalset)
