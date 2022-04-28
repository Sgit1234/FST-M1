import pandas as pnd
    	
data = {
  "Usernames":["admin","Charles","Deku"],
  "Passwords":["password","Charl13","AllMight"]
}
df=pnd.DataFrame(data)
print(df)
df.to_csv("User Credentials.csv ",index=False)
