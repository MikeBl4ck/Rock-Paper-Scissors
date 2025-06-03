/******************************************************************************
Michael Black
Program: Basic Rock, Paper, Scissors
May 26th, 2025
*******************************************************************************/


import java.util.Scanner;
import java.util.Random;


public class RockPaperScissors
{


public static void main(String[] args) {


int choice = 0; //Choice 1: (Heads), 2: (Tails)
int victory = 0; //Condition to Win Game Modes
String yn; //Yes or No Choice For Repeat
int gm = 0;
int turn = 0;
int again = 0; //Repeat Condition: Play Game Again (0 Repeat/ 1 Stop)
int outcome;
Random coinflip = new Random();
int coinside = 0;
int roll = 0;
int botpoints = 0;
int playerpoints = 0;
int botchoice = 0;
int confirm = 0;
Random bot = new Random ();
Scanner alpha = new Scanner(System.in);


//Credit To Developer


System.out.println("****************************************************");
System.out.println("This Program Was Developed by Michael Azar Black Jr.");
System.out.println("****************************************************\n\n\n.\n.\n.\n\n");


//Opening Greeting For Game
System.out.println("************************************");
System.out.println("Lets Play Rock, Paper, Scissors!");
System.out.println("************************************");


//Choose Player Name
System.out.println("\nPlease Enter Your Player Name: ");
String PlayerName = alpha.nextLine();


//Greet Player
System.out.println("\n\n**********************************************************");
System.out.println("Welcome " + PlayerName + ", to \"Rock, Paper, Scissors!\"");
System.out.println("I Am The \"Game Master\", As Well As Your Rival!");
System.out.println("You Have One Objective: Beat ME!");


//Game Mode Selection
while (again == 0)
{


gm = 0;
System.out.println("\nWhich Way Would You Like To Play?");


do {
System.out.println("(1) Singles\n(2) Best of 3\n(3) Best of 5\n");


//Error Safety
while (!alpha.hasNextInt())
{
System.out.println("Thats not a Number!");
alpha.next();
alpha.nextLine();


System.out.println("Please Choose The Corresponding Number for Your Choice:");
System.out.println("(1) Singles\n(2) Best of 3\n(3) Best of 5\n");


}


gm = alpha.nextInt();
alpha.nextLine();


if (gm < 1 || gm > 3)
{
System.out.println("\n*********************************************");
System.out.println(gm + " Is Not a Valid Choice!"+"\nPlease choose a Valid Choice Number!");
System.out.println("\n*********************************************");
}


} while (gm < 1 || gm > 3);




if (gm == 1)
{
System.out.println("You Chose: Singles");
System.out.println("In This Game Mode, One Choice is All you Get.\nThe First Person to Win a Round, Wins the Game!");
victory = 1;
}
else if (gm == 2)
{
System.out.println("You Chose: Best of 3");
System.out.println("In This Game Mode, The First Person to Win Two Rounds, Wins the Game!");
victory = 2;
}
else if (gm == 3)
{
System.out.println("You Chose: Best of 5");
System.out.println("In This Game Mode, The First Person to Win Three Rounds, Wins the Game!");
victory = 3;
}






//Heads or Tails
System.out.println("\nLet's Do Heads or Tails to Decide Who Goes First!");
System.out.println("\nPick One: Heads or Tails?");
String HT = alpha.nextLine();
choice = 0;


//Choose Between Heads or Tails
if (HT.equalsIgnoreCase("heads") || HT.equalsIgnoreCase("h"))
{
choice = 1;
}
else if (HT.equalsIgnoreCase("tails") || HT.equalsIgnoreCase("t"))
{
choice = 2;
}


//Error Statement and Repeat
while (choice == 0)
{
System.out.println("\n" + HT + " Isn't a Valid Choice!");
System.out.println("**********************************");
System.out.println("\nPick One: Heads or Tails?");
HT = alpha.nextLine();
if (HT.equalsIgnoreCase("heads") || HT.equalsIgnoreCase("h"))
{
choice = 1;
}
else if (HT.equalsIgnoreCase("tails") || HT.equalsIgnoreCase("t"))
{
choice = 2;
}


}


//Randomizer Between 1 and 2 for Coin Flip
outcome = coinflip.nextInt(2) + 1;
coinside = 0;
if (outcome == 1)
{
System.out.println("The Coin Landed on Heads!");
coinside = 1;
}
else if (outcome == 2)
{
System.out.println("The Coin Landed on Tails!");
coinside = 2;
}


//Win or Lose: First Pick Decision
turn = 0; //For Turn Priority (Player vs Bot)
if (coinside == choice)
{
System.out.println("\n******************************************************\n");
System.out.println("You Won the Coin Flip, So I'll Let You Choose First");
turn = 1;
}
else if (coinside != choice)
{
System.out.println("\n******************************************************\n");
System.out.println("Ha! You Lost the Coin Flip, I'll Choose First");
turn = 2;
}




roll = 0; //R,P,S Choices
botpoints = 0;
playerpoints = 0;
botchoice = 0;




//While Loop this Portion For Multiple Rounds
while (playerpoints < victory && botpoints < victory)
{
System.out.println("\n*************");
System.out.println("- Score Breakdown -");
System.out.println(PlayerName + ": " + playerpoints);
System.out.println("Game Master: " + botpoints);
System.out.println("*************\n");




if (turn == 1) //Player Goes First
{


//Player Choice
do {
System.out.println("Please Choose The Corresponding Number for Your Choice:");
System.out.println("(1) Rock\n(2) Paper\n(3) Scissors");


//Error Safety
while (!alpha.hasNextInt())
{
System.out.println("Thats not a Number!");
alpha.next();
alpha.nextLine();


System.out.println("Please Choose The Corresponding Number for Your Choice:");
System.out.println("(1) Rock\n(2) Paper\n(3) Scissors");
}


roll = alpha.nextInt();
alpha.nextLine();


if (roll < 1 || roll > 3)
{
System.out.println(roll + " Is Not a Valid Choice!");
}


} while (roll < 1 || roll > 3);




if (roll == 1)
{
System.out.println("You Chose \"Rock\"");
}
else if (roll == 2)
{
System.out.println("You Chose \"Paper\"");
}
else if (roll == 3)
{
System.out.println("You Chose \"Scissors\"");
}




//Bot Choice
botchoice = bot.nextInt(3) + 1;


if (botchoice == 1)
{
System.out.println("I Chose \"Rock\"");
}
else if (botchoice == 2)
{
System.out.println("I Chose \"Paper\"");
}
else if (botchoice == 3)
{
System.out.println("I Chose \"Scissors\"");
}




if (roll == 1 && botchoice == 1)//Rock-Rock: Tie
{
System.out.println("Since We Both Chose Rock, This Round is a Tie!");
System.out.println("...No One Gets a Point");
}
else if (roll == 2 && botchoice == 2)//Paper-Paper: Tie
{
System.out.println("Since We Both Chose Paper, This Round is a Tie!");
System.out.println("...No One Gets a Point");
}
else if (roll == 3 && botchoice == 3)//Scissors-Scissors: Tie
{
System.out.println("Since We Both Chose Scissors, This Round is a Tie!");
System.out.println("...No One Gets a Point");
}
else if (roll == 1 && botchoice == 3)//Rock-Scissors: Win
{
System.out.println("Since You Chose Rock and I Chose Scissors, You Won This Round!");
System.out.println("You Get One Point");
playerpoints++;
}
else if (roll == 2 && botchoice == 1)//Paper-Rock: Win
{
System.out.println("Since You Chose Paper and I Chose Rock, You Won This Round!");
System.out.println("You Get One Point");
playerpoints++;
}
else if (roll == 3 && botchoice == 2)//Scissors-Paper: Win
{
System.out.println("Since You Chose Scissors and I Chose Paper, You Won This Round!");
System.out.println("You Get One Point");
playerpoints++;
}
else if (roll == 1 && botchoice == 2)//Rock-Paper: Loss
{
System.out.println("Since You Chose Rock and I Chose Paper, I Won This Round!");
System.out.println("I Get One Point");
botpoints++; 
}
else if (roll == 2 && botchoice == 3)//Paper-Scissors: Loss
{
System.out.println("Since You Chose Paper and I Chose Scissors, I Won This Round!");
System.out.println("I Get One Point");
botpoints++;
}
else if (roll == 3 && botchoice == 1)//Scissors-Rock: Loss
{
System.out.println("Since You Chose Scissors and I Chose Rock, I Won This Round!");
System.out.println("I Get One Point");
botpoints++;
}


}
else if (turn == 2) //Bot Goes First
{


//Randomizer Between 1 (Rock), 2 (Scissors), and 3 (Paper) (Hides Choice)
botchoice = bot.nextInt(3) + 1;
System.out.println("Choosing Between Rock, Paper, and Scissors\n.\n.\n.");
System.out.println("I've Made My Choice");


//Player Choice
do {
System.out.println("Please Choose The Corresponding Number for Your Choice:");
System.out.println("(1) Rock\n(2) Paper\n(3) Scissors");


//Error Safety
while (!alpha.hasNextInt())
{
System.out.println("That’s not a Number!");
alpha.next();
alpha.nextLine();


System.out.println("Please Choose The Corresponding Number for Your Choice:");
System.out.println("(1) Rock\n(2) Paper\n(3) Scissors");
}


roll = alpha.nextInt();
alpha.nextLine();


if (roll < 1 || roll > 3)
{
System.out.println(roll + " Is Not a Valid Choice!");
}


} while (roll < 1 || roll > 3);




if (roll == 1)
{
System.out.println("You Chose \"Rock\"");
}
else if (roll == 2)
{
System.out.println("You Chose \"Paper\"");
}
else if (roll == 3)
{
System.out.println("You Chose \"Scissors\"");
}


//Bot Says "I Chose: "
if (botchoice == 1)
{
System.out.println("I Chose \"Rock\"");
}
else if (botchoice == 2)
{
System.out.println("I Chose \"Paper\"");
}
else if (botchoice == 3)
{
System.out.println("I Chose \"Scissors\"");
}




//3 Beats 1, 1 Beats 2, 2 Beats 3
if (roll == 1 && botchoice == 1)//Rock-Rock: Tie
{
System.out.println("Since We Both Chose Rock, This Round is a Tie!");
System.out.println("...No One Gets a Point");
}
else if (roll == 2 && botchoice == 2)//Paper-Paper: Tie
{
System.out.println("Since We Both Chose Paper, This Round is a Tie!");
System.out.println("...No One Gets a Point");
}
else if (roll == 3 && botchoice == 3)//Scissors-Scissors: Tie
{
System.out.println("Since We Both Chose Scissors, This Round is a Tie!");
System.out.println("...No One Gets a Point");
}
else if (roll == 1 && botchoice == 3)//Rock-Scissors: Win
{
System.out.println("Since You Chose Rock and I Chose Scissors, You Won This Round!");
System.out.println("You Get One Point");
playerpoints++;
}
else if (roll == 2 && botchoice == 1)//Paper-Rock: Win
{
System.out.println("Since You Chose Paper and I Chose Rock, You Won This Round!");
System.out.println("You Get One Point");
playerpoints++;
}
else if (roll == 3 && botchoice == 2)//Scissors-Paper: Win
{
System.out.println("Since You Chose Scissors and I Chose Paper, You Won This Round!");
System.out.println("You Get One Point");
playerpoints++;
}
else if (roll == 1 && botchoice == 2)//Rock-Paper: Loss
{
System.out.println("Since You Chose Rock and I Chose Paper, I Won This Round!");
System.out.println("I Get One Point");
botpoints++;
}
else if (roll == 2 && botchoice == 3)//Paper-Scissors: Loss
{
System.out.println("Since You Chose Paper and I Chose Scissors, I Won This Round!");
System.out.println("I Get One Point");
botpoints++;
}
else if (roll == 3 && botchoice == 1)//Scissors-Rock: Loss
{
System.out.println("Since You Chose Scissors and I Chose Rock, I Won This Round!");
System.out.println("I Get One Point");
botpoints++;
}
}
}
//while loop for Again


if (playerpoints > botpoints)//Player Wins
{
System.out.println("Congratulations, You've Won the Game!");
System.out.println("Are You Up For Another Game?\n(Yes) or (No): ");
yn = alpha.nextLine();


if (yn.equalsIgnoreCase("yes") || yn.equalsIgnoreCase("yea") || yn.equalsIgnoreCase("yeah"))
{
again = 0;
confirm = 1;
}
else if (yn.equalsIgnoreCase("no") || yn.equalsIgnoreCase("nah"))
{
again = 1;
confirm = 1;
System.out.println("A True Game Master Knows How to Admit Defeat...\nGood Bye \"Victorious One\"");
}
else
{
confirm = 0;
}
//Error Shelf
while (confirm == 0)
{
System.out.println("What?" + " I Don't Understand What \"" + yn + "\" Means");
System.out.println("Are You Up For Another Game?\n(Yes) or (No): ");
yn = alpha.nextLine();


if (yn.equalsIgnoreCase("yes") || yn.equalsIgnoreCase("yea") || yn.equalsIgnoreCase("yeah"))
{
again = 0;
confirm = 1;
}
else if (yn.equalsIgnoreCase("no") || yn.equalsIgnoreCase("nah"))
{
again = 1;
confirm = 1;
System.out.println("A True Game Master Knows How to Admit Defeat...\nGood Bye, \"Victorious One\"");
}
else
{
confirm = 0;
}
}
}
else if (botpoints > playerpoints)//Bot Wins
{
System.out.println("Ha! I Knew You Couldn't Defeat Me!");
System.out.println("Want to Try Your Luck Again?\n(Yes) or (No): ");
yn = alpha.nextLine();


if (yn.equalsIgnoreCase("yes") || yn.equalsIgnoreCase("yea") || yn.equalsIgnoreCase("yeah"))
{
again = 0;
confirm = 1;
}
else if (yn.equalsIgnoreCase("no") || yn.equalsIgnoreCase("nah"))
{
again = 1;
confirm = 1;
System.out.println("I Knew You Didn't Have What It Took...\nGood Bye, \"Rookie\"");
}


//Error Shelf
while (confirm == 0)
{
System.out.println("What?" + " I Don't Understand What \"" + yn + "\" Means");
System.out.println("Are You Up For Another Game?\n(Yes) or (No): ");
yn = alpha.nextLine();


if (yn.equalsIgnoreCase("yes") || yn.equalsIgnoreCase("yea") || yn.equalsIgnoreCase("yeah"))
{
again = 0;
confirm = 0;
}
else if (yn.equalsIgnoreCase("no") || yn.equalsIgnoreCase("nah"))
{
again = 1;
confirm = 1;
System.out.println("I Knew You Didn't Have What It Took...\nGood Bye, \"Rookie\"");
}
}
}
}


System.out.println("\n\n****************************************************");
System.out.println("This Program Was Developed by Michael Azar Black Jr.");
System.out.println("\nThanks For Playing!!");
System.out.println("****************************************************\n\n\n");


alpha.close();
}
}
