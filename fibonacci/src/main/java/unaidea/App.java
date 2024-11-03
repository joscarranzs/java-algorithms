package unaidea;

public class App {
  public static void main(String[] args) {
    // Number of terms to calculate
    int n = 10;

    // Conventional recursion method
    System.out.println("Fibonacci(10) = " + Fibonacci.traditional(n));

    // Vector method
    int[] fibonacci = Fibonacci.vector(n);
    for (int i = 0; i < fibonacci.length; i++) {
      System.out.print(fibonacci[i] + " ");
    }
    System.out.println();
  }
}
