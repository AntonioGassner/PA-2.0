package Briscola;

public class InputOutput {

    private int getInt() {
        while (true) {
            if (Main.sc.hasNextInt()) {
                return Main.sc.nextInt();
            } else {
                System.out.println("Insert Integer please. ");
            }
        }
    }

    private String getString() {
        return Main.sc.nextLine();
    }

    public String getPlayerName() {
        System.out.println("Please insert your name: ");
        while (true) {
            String name = getString();
            if (name.length() > 3) {
                return name;
            } else
                System.out.println("Name must be at least 3 characters");
        }
    }

    public int getNumberOfPlayers() {
        System.out.println("Pick an option: ");
        System.out.println("1) 2 Players");
        System.out.println("2) 4 Players");
        while (true) {
            int n = getInt();
            if (n == 1)
                return 2;
            else if (n == 2)
                return 4;
            else
                System.out.println("Use keys {1,2} to select an option");
        }
    }

    public int menu() {
        printMenu();
        int choice = getInt();
        while (true) {
            if (choice >= 0 && choice <= 3)
                return choice;
            else printMenu();
        }


    }

    private void printMenu() {
        System.out.println("Welcome to the menu, here are your options: ");
        System.out.println("1) Play game");
        System.out.println("2) Read rules");
        System.out.println("3) Quit");
    }

    public void printRules() {
        System.out.println("https://en.wikipedia.org/wiki/Briscola");
    }
}
