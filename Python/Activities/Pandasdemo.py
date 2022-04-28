import pandas as pd
values = {
"A": [1,2,3,4,5],
"B": [5,4,3,2,1],
"C": [10,11,12,13,14]
}
table=pd.DataFrame(values)
print(table)
print(table["A"] [1])