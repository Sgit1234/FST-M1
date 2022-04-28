def sum(n): 
  if(n<=0):
    return n 
  else:
      return(n+sum(n-1))
print("Sum is:", sum(4))   