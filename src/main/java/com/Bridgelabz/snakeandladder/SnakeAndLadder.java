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

        System.out.println("Welcome to Snake And Ladder Game!!!");
        int rollDie = (int) (Math.floor(Math.random() * 10) % 6 + 1);

        int option = (int) (Math.floor(Math.random()* 10) % 2 + 1);

        int position = INITIAL_POSITION;
        // checks for option
        if (option == IS_SNAKE) {
            System.out.println("Snake for the Player");
            position -= rollDie;
        }else if (option == IS_LADDER) {
            System.out.println("Ladder for the Player");
            position += rollDie;
        }else {
            System.out.println("No Play for Player");
        }
        System.out.println("Position: " + position);

    }
}

