import java.math.BigInteger;

public class FibonacciSequence  {
  public static void main(String[] args) {
    int i = 0;
    int count = 2;
    BigInteger limit = (new BigInteger("10")).pow(999);
    BigInteger[] fibonacciNumbers = new BigInteger[3];

    fibonacciNumbers[0] = BigInteger.ONE;
    fibonacciNumbers[2] = BigInteger.ONE;

    while ((fibonacciNumbers[i]).compareTo(limit) < 0) {
        i = (i + 1) % 3;
        count++;
        fibonacciNumbers[i] = fibonacciNumbers[(i + 1) % 3].add(fibonacciNumbers[(i + 2) % 3]);
    }
    System.out.printf("The first term in the Fibonacci sequence to contain 1,000 digits is term:"+count);
  }
}