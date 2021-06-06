/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package Ex15.base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String username = "Sparky";
        String password = "Hell0Th3re";

        String userGuess = myApp.getUser();
        String passGuess = myApp.getPass();

        myApp.check(username, password, userGuess, passGuess);
    }

    private void check(String username, String password, String userGuess, String passGuess) {
        if(username.equals(userGuess))
        {
            if(password.equals(passGuess))
            {
                System.out.println("Welcome!");
            }
            else
            {
                System.out.println("I don't know you. (Error code 2)");
            }
        }
        else
        {
            System.out.println("I don't know you. (Error code 1)");
        }
    }

    private String getUser() {
        System.out.print("Enter Username: ");
        return in.nextLine();
    }

    private String getPass() {
        System.out.print("Enter Password: ");
        return in.nextLine();
    }

}
