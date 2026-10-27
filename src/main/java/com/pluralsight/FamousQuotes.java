package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] quotes = {"\"Life is like riding a bicycle. To keep your balance, you must keep moving.\" - Alber Einstein","\"Life is what happens to you while you're busy making other plans.\" - John Lennon", "\"The greatest wealth is to live content with little.\" - Pato", "\"Be the change that you wish to see in the world.\" - Mahatma Gandhi", "\"The unexamined life is not worth living.\" - Socrates", "\"There is no greater agony than bearing an untold story inside you.\" - Maya Angelou", "\"We're all in the gutter, but some of us are looking at the stars.\" - Oscar Wilde", "\"You miss 100% of the shots you don't take.\" - Wayne Gretzky", "\"If you are going through hell, keep going.\" - Winston Churchill", "\"Believe you can and you are halfway there.\" - Thodore Roosevelt"};

        try {

            System.out.println("Please enter a number between 1 and 10.");
            int number = scanner.nextInt();
            System.out.println(quotes[number - 1]);
        } catch (Exception exception) {
            System.out.println("Invalid input. Please enter a number between 1 and 10.");
            scanner.nextLine();
        }

        /* try {
            System.out.println("Would you like to see another quote? Enter (Y/N)");
            String answer = scanner.next();
        }
    */
    scanner.close();
    }
}
