
/*Given an integer number n, return the difference between the product of its digits and the sum of its digits*/
import java.util.Scanner;

class intnum {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int sum = 0, prod = 1, num, res;

    System.out.println("enter the number : ");
    num = s.nextInt();

    while (num != 0) {

      sum += (num % 10);
      prod *= (num % 10);
      num /= 10;
    }
    res = prod - sum;
    System.out.println("sum value is : " + sum);
    System.out.println("product value is : " + prod);
    System.out.println("difference value is " + res);

  }
}