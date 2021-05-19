package pl.itacademy.conditions;

import java.util.concurrent.ThreadLocalRandom;

public class CheckConditionsDemo {
    public static void main(String[] args) {
        int number = 10;
        if (number > 10) {
            System.out.println("Condition is TRUE");
            System.out.println("Second line of IF statement also been executed!");
        }


        /*
        Hello, this is also comment,
        but split by lines!
         */

        //Be careful! Only first line of code belongs to this IF!
        if (number > 10)
            System.out.println("Condition is TRUE");
            System.out.println("This line out of IF statement and always been executed!");


        String browser = "Internet Explorer 5.0";
        if (browser.equals("Internet Explorer 7.0")) {
            System.out.println("Your system requirements met minimum expectation");
        } else {
            System.out.println("Please, check your browser. Upgrade it to 7.0 version");
        }

        int randomNumber = ThreadLocalRandom.current().nextInt(100);
        if (randomNumber > 90) {
            System.out.printf("Number %d is more than 90.%n", randomNumber);
            System.out.println("Number " + randomNumber + " is more than 90.");
        } else if (randomNumber > 50) {
            System.out.printf("Number %d is more than 50.%n", randomNumber);
        } else if (randomNumber > 10) {
            System.out.printf("Number %d is more than 10.%n", randomNumber);
        } else {
            System.out.printf("Number %d is less or equals to 10.%n", randomNumber);
        }

        String answer = randomNumber > 50 ? "Big random number" : "Small random number";
        System.out.println(answer);

        char letter = 'a';
        int buildingNumber = 10;
        String addressLookUp = "10a";

        if (buildingNumber == 10 && letter == 'a') {
            System.out.println("We have found the proper address");
        }

        boolean niceWeather = false; //rain today
        if(!niceWeather) {
            System.out.println("I will recommend you to stay at home today.");
        }

        boolean niceMindset = true;
        if(niceWeather || niceMindset) {
            System.out.println("Let's go for a walk!");
        }

        byte b = 127;
        switch (b) {
            case 10:
                System.out.println("Value is 10");
                break;
            case 20:
                System.out.println("Value is 20");
                break;
            case 127:
                System.out.println("Value is 127");
                break;
            case 30:
                System.out.println("Value is 30");
                break;
            case 50:
            case 100:
                System.out.println("Value is 100 or 50");
                break;
            default:
                System.out.println("No one case been chosen");
        }
    }
}
