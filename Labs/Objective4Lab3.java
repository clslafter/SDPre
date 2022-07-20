import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {

    int currentYear = 2022;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    int age = input.nextInt();

    int birthYear = currentYear - age;
    //Only accurate assuming the inputting subject has already had a birthday in the current year

    System.out.println("You were born in " + birthYear);
  }
}
