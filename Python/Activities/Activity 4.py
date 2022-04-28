from pickle import TRUE

while True:
    
    player1=input("Player1 - Enter your choice: rock/paper/scissors:  ")
    player2=input("Player2 - Enter your choice: rock/paper/scissors:  ")

    if(player1 and player2) not in ("rock", "paper","scissors"):
        print("Not a valid input, enter either rock, paper or scissors")
    elif player1==player2: 
        print("Its a tie")
    elif(player1=="rock"):
        if(player2 == "paper"):
            print("Player2 (Paper) wins")
        elif(player2=="scissors"):
            print("Player1 (Rock) wins")
    elif(player1=="paper"):
        if(player2=="rock"):
            print("Player1 (Paper) wins")
        elif(player2=="scissors"):
            print("Player2 (Scissors) wins")
    elif(player1=="scissors"):    
        if(player2=="rock"):    
            print("Player2 (Rock) wins")
        elif(player2=="paper"):
            print("Player 1 (scissors) wins")

    game=input("Do you want to play again? (yes/no): ")
    if(game=="yes"):
        pass
    elif(game=="no"):
        print("The game ends")
        raise SystemExit
    else:
        print("Incorrect input, game ends")
        raise SystemExit