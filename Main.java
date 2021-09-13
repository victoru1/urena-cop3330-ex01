/*
*  UCF COP3330 Fall 2021 Assignment 1 Solution
*  Copyright 2021 Victor Urena
*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    var scanner = new java.util.Scanner(System.in);
    System.out.print("What is your name? ");
    var name = scanner.nextLine();
    System.out.println("Hello, " + name + ", nice to meet you!");
  }
}