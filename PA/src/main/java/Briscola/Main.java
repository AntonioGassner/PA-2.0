package Briscola;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random random = new Random();
    public static Scanner sc = new Scanner(System.in);
    public static InputOutput io = new InputOutput();

    public static void main(String[] args) {

        boolean quit = false;
        while (!quit) {
            int choice = io.menu();
            switch (choice) {
                case 1:
                    Game game = new Game();
                    game.playGame();
                    break;
                case 2:
                    io.printRules();
                    break;
                case 3:
                    quit = true;
                    break;

            }
        }

        sc.close();
    }
}
