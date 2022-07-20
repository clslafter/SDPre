import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is your first name?");
    String fName = keyboard.nextLine();

    System.out.println("What is your last name?");
    String lName = keyboard.nextLine();

    System.out.println("What is your favorite animal?");
    String favoriteAnimal = keyboard.nextLine();

    System.out.println("What is your favorite food?");
    String favoriteFood = keyboard.nextLine();

    System.out.println("What is your favorite song?");
    String favoriteSong = keyboard.nextLine();

    System.out.println("My name is " + fName + " " + lName + ".");
    System.out.println("My favorite animal is the " + favoriteAnimal + ".");
    System.out.println("My favorite food is " + favoriteFood + ".");
    System.out.println("My favorite song is " + favoriteSong + ".");
  }
}
