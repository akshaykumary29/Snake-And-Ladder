package com.Bridgelabz.snakeandladder;


/**
 * Snake And Ladder Simulator
 */
public class SnakeAndLadder {

    public static void main(String[] args) {
        // Constant variable
        int INITIAL_POSITION = 0;
        int NUMBER_OF_PLAYER = 1;
        int IS_SNAKE = 1;
        int IS_LADDER = 2;
        int WINNING_POSITION = 100;
        int position = INITIAL_POSITION;

        System.out.println("Welcome to Snake And Ladder Game!!!");

        while (position < WINNING_POSITION) {

            int rollDie = (int) (Math.floor(Math.random() * 10) % 6 + 1);

            int option = (int) (Math.floor(Math.random() * 10) % 2 + 1);

            // checks for option
            if (option == IS_SNAKE) {
                System.out.println("Snake for the Player");
                position -= rollDie;
                if (position < 0) {
                    position = 0;
                }
            } else if (option == IS_LADDER) {
                System.out.println("Ladder for the Player");
                position += rollDie;
            } else {
                System.out.println("No Play for Player");
            }
            System.out.println("Position: " + position);

        }
    }
}

