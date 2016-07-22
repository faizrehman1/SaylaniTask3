package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int value;
        int min=1;
        int max=10;
        char optionStart;
        int trial=0;
        Scanner input = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Enter You want to play Game or not Y/n ?");
        optionStart=input.next().charAt(0);
        if(optionStart=='y'||optionStart=='Y'){
            do{
                value= random.nextInt(max - min + 1) + min;
               // System.out.println(value);
                int inputValue;
              //  System.out.println("You Enter in Trial Version");
                System.out.println("Enter Number");
                inputValue=input.nextInt();
                if(value==inputValue){
                    System.out.println("Your Numer "+inputValue+" Random Number "+value);
                         System.out.println("Your Number is Match you Won the Game..");
                }else{
                    System.out.println("Your Numer "+inputValue+" Random Number "+value);
                    System.out.println("Your Number not match.. You Lose");

                }

              //  System.out.println("You have "+trial+" Chance Left");
                trial++;


            }while(trial<3);

            System.out.println("YOu Want to Buy Premium coins?");
            int premium;
            System.out.println("Enter Your amount of Coin Between 1-10 ");
            premium=input.nextInt();
            if(premium>0 && premium<=10){
                trial=premium;
            }



        }else if(optionStart=='N'||optionStart=='n'){
            System.out.println("Good Bye");
        }



    }

}
