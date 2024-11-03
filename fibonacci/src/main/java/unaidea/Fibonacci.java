package unaidea;

public class Fibonacci {
  /*
   *This is the traditional recursive function method to calculate the sequence of n values.
  */

  public static int traditional(int n) {
    // If n is 0 or 1, return n
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      // If n is greater than 1, return the sum of the two previous values
      return traditional(n - 1) + traditional(n - 2);
    }
  }

  /*
   * This method uses a vector where each position is the sum
   * of the two previous positions; it’s another way to implement the Fibonacci algorithm.
   */

  public static int[] vector(int n) {
    int[] fibonacci = new int[n+1];
    fibonacci[0] = 0;
    fibonacci[1] = 1;
    for (int i = 2; i < n + 1; i++) {
      fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    }
    return fibonacci;
  }
}
