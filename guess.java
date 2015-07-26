/* Name: Jessica Xie
 * This program plays an interactive guessing game with the user.
 */

import java.util.Scanner;

class Guess{
  public static void main(String[] args){
  int i; //random number
  double j, k, l; //guesses
  Scanner scan = new Scanner(System.in);

  System.out.println("I'm thinking of an integer in the range 1 to 10. You have three guesses.");
  System.out.print("\nEnter your first guess: ");
  j = scan.nextDouble();
  i = (int)Math.floor(Math.random()*10)+1;

  //first guess
  if (j==i){
     System.out.println("You win!");
  } else if(j>i){
         System.out.println("Your guess is too high.");
         System.out.print("\nEnter your second guess: ");
         j++;
    } else{
          System.out.println("Your guess is too low.");
          System.out.print("\nEnter your second guess: ");
          j++;
    }

  //second guess
  k = scan.nextDouble();
  if (k==i){
     System.out.println("You win!");
  } else if(k>i){
         System.out.println("Your guess is too high.");
         System.out.print("\nEnter your third guess: ");
         k++;
    } else{
      System.out.println("Your guess is too low.");
      System.out.print("\nEnter your third guess: ");
      k++;
    }
    
  //third guess
  l = scan.nextDouble();
  if (l==i){
     System.out.println("You win!");
  } else if(l>i){
         System.out.println("Your guess is too high.");
         System.out.println("\nYou lose. The number was "+i+".");
  } else{
    System.out.println("Your guess is too low.");
    System.out.println("\nYou lose. The number was "+i+".");
  }
 }
}
