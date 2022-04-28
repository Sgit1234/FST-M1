fruits = {
"apple" : 20,
"banana": 30,
"cherry": 40,
"orange": 50
}

pick_fruit = input ("Enter the fruit you want to pick up: ").lower()
if pick_fruit in fruits:
    print(f"Your choice of fruit {pick_fruit} is available in the shop")
else:
    print("Your choice of fruit is not available")



