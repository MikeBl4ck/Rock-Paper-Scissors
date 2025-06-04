# Rock-Paper-Scissors
- **Code Project:** Rock Paper Scissors Game (Game Master Series)
> Created: May 26th, 2025

![Image of Rock, Paper, Scissors](https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pinterest.com%2Faud100%2Fpaper-rock-scissor%2F&psig=AOvVaw2LclAstXfEeUuofESy2Ese&ust=1749082866578000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCPjtleS_1o0DFQAAAAAdAAAAABAE)

# Steps Of Program
- **Game Master** Introduction
- Ask for Game Mode Choice From Player
- Heads or Tails Coinflip to Determine Who Chooses First
- If Player Wins Coin Toss
    - Player Chooses Rock, Paper, Scissors First
    - Game Master Chooses Rock, Paper, Scissors Next
    - Choices Get Compared and Winner Gets a Point
    - Cycle Continues Until Victory Point Threshold is Reached
    - Whoever Gets to Max Point Threshold First Wins
- If Game Master Wins Coin Toss
    - Game Master Chooses Rock, Paper, Scissors First
    - Player Chooses Rock, Paper, Scissors Next
    - Choices Get Compared and Winner Gets a Point
    - Cycle Continues Until Victory Point Threshold is Reached
    - Whoever Gets to Max Point Threshold First Wins
- Player is Asked if They'd Like to Play Again
    - If Yes: Game Cycle Starts Over
    - If No: Game Concludes With Final Message From Game Master





# Variable Breakdown
* (int) choice 
    - Condition Varible for Player's Coin Flip Choice: 
        - "1" = "Heads"
        - "2" = "Tails"

* (int) victory
    - Threshold Variable for Total Points Needed to Trigger "Win" or "Loss" Code Execution

* (String) yn
    - Storage Variable for Player "Yes or No" Choice
        - Triggers the Repeat or Ending for "Play Again?"

* (int) gm
    - Storage Variable for Player "Game Mode" Choice
        - "1" = "Singles"
        - "2" = "Best of 3"
        - "3" = "Best of 5"

* (int) turn
    - Condition Variable for "Who Goes First" Priority
        - "1" = Player Goes First
        - "2" = Game Master Goes First

* (int) again
    - Condition Variable for Repeat or Ending for "Play Again"
    - Changes based on the value stored in the Variable "yn"
    - "0" = Repeat
    - "1" = Stop

* (int) outcome
    - Storage Variable Tied to the Result of the Coinflip
    - "1" = "Heads"
    - "2" = "Tails"
    - Triggers Display: "The Coin Landed on Heads!" or "The Coin Landed on Tails!"

* (Random) coinflip
    - A "Random" Method that Simulates a Coin Flip

* (int) coinside
    - Storage Variable Tied to the Result of the Coinflip
    - "1" = "Heads"
    - "2" = "Tails"
    - Gets compared to the Variable "choice" to Determine the Value Stored in "turn" for Turn Priority

* (int) roll
    - Storage Variable that Contains Values Based on the Player's Choice of Rock, Paper, or Scissors
    - "1" = "Rock"
    - "2" = "Paper"
    - "3" = "Scissors"
    - Gets Compared to "botchoice" to Determine Incrementation of "botpoints" or "playerpoints"

* (int) botpoints 
    - Storage Variable that Contains the Amount of Points the Game Master Has (Rounds Won)
    - Gets Compared to Threshold Variable "victory" for "Win" or "Loss" Code Trigger

* (int) playerpoints
    - Storage Variable that Contains the Amount of Points the Player Has (Rounds Won)
    - Gets Compared to Threshold Variable "victory" for "Win" or "Loss" Code Trigger

* (int) botchoice
    - Storage Variable that Containes Values Based on the Game Master's Choice of Rock, Paper, or Scissors
    - "1" = "Rock"
    - "2" = "Paper"
    - "3" = "Scissors"
    - Gets Compared to "roll" to Determine Incrementation of "botpoints" or "playerpoints"

* (int) confirm
    - Storage Variable that's used to Trigger Error Managing While Loop for Restart/End
    - Is Influenced by Value Stored in Variable "again".

* (Random) bot
    - A "Random Method" That Simulates the Game Master's Choice for Rock, Paper, or Scissors
    - Outcome is Stored in Variable "botchoice" For Further Use in the Script

* (Scanner) alpha
    - Main Scanner Method That's Used to Collect ALL Player Inputs