
t=tuple(input("Enter some valid comma separated numbers: ").split(","))

print (t)
for x in t:
    a=int(x)
    if (a % 5 == 0):
        print(a)
'''   else:
        print(f"The number {a} is not divisible by 5")
'''

