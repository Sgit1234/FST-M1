import pandas as pd

df=pd.read_excel("User details.xlsx","users_sheet")
print("Original data:")
print(df)
print("==========================================================")
print("Number of rows and columns in the sheet are: ")
print(df.shape)
print("==========================================================")
print("Email details of the users: ")
print(df["Email"])
print("==========================================================")
print("First names sorted ascending:")
print(df.sort_values("FirstName"))