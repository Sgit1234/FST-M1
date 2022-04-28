numbers = list(input("Enter a sequence of comma separated numbers: ").split(","))

if(numbers[0]==numbers[-1]):
    print ("Same") 
else:
    print("Different")