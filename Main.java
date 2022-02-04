package com.Zigeuner;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        double number1;
        double number2;
        char operator;

        System.out.println("Erste Zahl bitte eingeben");
        number1 = scanner.nextDouble();

        System.out.println("Zweite Zahl bitte eingeben");
        number2 = scanner.nextDouble();

        System.out.println("Operator eingeben");
        operator = scanner.next().charAt(0);

        if (operator == '/') {
            System.out.println("Das Ergebnis lautet" + number1 / number2);}
        else if (operator == '*') {
            System.out.println("Das Ergebnis lautet" + number1 * number2);}
        else if (operator == '+') {
            System.out.println("Das Ergebnis lautet" + number1 + number2);}
        else if (operator == '-') {
            System.out.println("Das Ergebnis lautet" + number1 - number2);}
        }

    }
