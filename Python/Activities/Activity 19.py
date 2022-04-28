import pandas
from pandas import ExcelWriter  

data={
"FirstName":["Satvik","Avinash","Lahri"],
"LastName":["Shah","Kati","Rath"],
"Email":["satshah@example.com","avinashk@example.com","lahri.rath@example.com"],
"PhoneNumber":["4537829158","5892184058","4528727830"]
}

df=pandas.DataFrame(data)
print(df)
writer=ExcelWriter("User details.xlsx")

df.to_excel(writer, "users_sheet",index=False)
writer.save()
