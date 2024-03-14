package com.github.zipcodewilmington;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        int numberOfTry = 5;

        String box = "";
        String[] words = {"Elephant", "Banana", "Computer", "Sunshine", "Dragon", "Bicycle", "Puzzle", "Chocolate", "Umbrella", "Guitar", "Starfish", "Kangaroo", "Lemonade", "Telescope", "Rainbow", "Galaxy", "Butterfly", "Watermelon", "Backpack", "Octopus"};
        String wordToGuess = wordToGuess(words).toLowerCase();
        Scanner input = new Scanner(System.in);

        // Scanner


for (int i = 0; i < wordToGuess.length(); i++){
    box += "_";
}

//        dash.replace(" ", guess.length())
        // loop to go through the word
       while (numberOfTry > 0 && box.contains("_")){
           System.out.println("Here is a guess game. Guess the word in my mind. (" + box + ")");
           String userInput = input.next();
           Boolean found = false;

//           System.out.println(box);
    for (int i = 0; i < wordToGuess.length(); i++){
           if (userInput.charAt(0) == wordToGuess.charAt(i)) {
               System.out.println("Bingo! you got your  letter");
//               box = Character.toString(wordToGuess.charAt(i)).replace("_", userInput);
           //I don't understand
              box = box.substring(0, i) + userInput + box.substring(i + 1);


            found = true;
           }
           }

                if (found == false) {
                   numberOfTry --;
                    System.out.println("Incorrect guess! " + numberOfTry + " attempts remaining.");



                    System.out.println("Wrong Input");



           }


    }
       if (box.equals(wordToGuess)) {
           System.out.println("You won congrats " + "the correct word is " + wordToGuess);
       }
       if (numberOfTry == 0){
           System.out.println("You lost the game");
           System.out.println(wordToGuess);
       }


        // array of words
        // method to pick random words from the array
        // number of chances


    }
    public static String wordToGuess(String [] words) {


        int rand = (int) (Math.random() * words.length);
    return words[rand];
    }
}
