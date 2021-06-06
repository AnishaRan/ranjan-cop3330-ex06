package org.example;
import java.time.Year;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 6 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);
        int year = Year.now().getValue();

        System.out.print("What is your current age? ");
        String currentAgeStr = in.nextLine();
        System.out.print("At what age would you like to retire? ");
        String retireAgeStr = in.nextLine();

        int IntCurrentAge = Integer.parseInt(currentAgeStr);
        int IntRetireAge = Integer.parseInt(retireAgeStr);

        int resultAge = IntRetireAge - IntCurrentAge;
        int retireYear = year + resultAge;

        System.out.printf("You have %d years left until you can retire.\nIt's %d, so you can retire in %d.", resultAge, year, retireYear);



    }
}
