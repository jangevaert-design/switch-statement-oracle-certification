package edu.cnm.deepdive;

import java.util.Random;

public class SwitchStatement {

  public static void main(String[] args) {
    int dayOfWeek = 0;

    switch(dayOfWeek) {
      case 0:
        System.out.println("Monday");
        break;
      case 1:
      System.out.println("Tuesday");
      break;
      case 2:
      System.out.println("Wednesday");
      break;
      case 3:
        System.out.println("Thursday");
        break;
      case 4:
        System.out.println("Friday");
        break;
      default: //default is optional
        System.out.println("Weekend");
        break; //optional
    }

    Random random = new Random();
    int c = random.nextInt(26) + 'a'; // adding offset to produce lower case letters.
    System.out.println((char)c + ", " + c + ": ");

    switch(c) {
      case 'a':
      case 'e':
      case'i':
      case'o':
      case'u':
        System.out.println("vowel");
        break;
      case'y':
        System.out.println("sometimes a vowel");
        break;
      default:
        System.out.println("consonant");
        break;
    }
  }
}
