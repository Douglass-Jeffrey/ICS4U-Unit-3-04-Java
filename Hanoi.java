/*
* This program uses recursion to play the tower of hanoi in java.
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2021-01-05
* Class Hanoi.
*/

class Hanoi {

  /**
   * Recursive function that plays the game out and prints moved.
   */
  public static void towerOfHanoi(int height, String fromRod, String toRod, String auxRod) {
    // When there is a ring on every spike move ring 1 and print it
    if (height == 1) {
      System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
      return;
    }
    towerOfHanoi(height - 1, fromRod, auxRod, toRod);
    System.out.println("Move disk " + height + " rom rod " + fromRod + " to rod " + toRod);
    towerOfHanoi(height - 1, auxRod, toRod, fromRod);
    
  }

  /**
   * main function to begin the game.
   */
  public static void main(String[] args) {
    int height = 3;
    towerOfHanoi(height, "A", "C", "B");
  }
}
