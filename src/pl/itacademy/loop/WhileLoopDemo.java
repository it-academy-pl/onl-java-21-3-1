package pl.itacademy.loop;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        int amountOfMilkInBasket = 0;
        while (amountOfMilkInBasket < 5) {
            if(amountOfMilkInBasket == 3) {
                break;
            }
            System.out.println("Checking expiration date on bottle of milk!");
            System.out.println("Put milk inside of basket");
            amountOfMilkInBasket++;
            //amountOfMilkInBasket = amountOfMilkInBasket + 1;
            System.out.printf("We already have %d bottles of milk in basket.%n", amountOfMilkInBasket);
            System.out.println("=========================================");
        }

        System.out.println("We have taken enough amount of milk!");


        System.out.println("===============DO..WHILE==============");

        int amountOfEggsInBasket = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Put eggs-pack to basket");
            amountOfEggsInBasket++;
            System.out.printf("We have %d egg-packs in our basket.%n", amountOfEggsInBasket);
            System.out.println("Do you want another one eggs-pack?");
        } while (input.nextLine().equalsIgnoreCase("yes"));

        System.out.println("We have taken enough amount of eggs!");
    }
}
