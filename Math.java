import java.util.Scanner;

class Math {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("enter a number");
    int a = scnr.nextInt();
    System.out.println("anter another number");
    int b = scnr.nextInt();
    System.out.println("+ is "+ sum(a,b));
    System.out.println("- is "+ sub(a,b));
    System.out.println("/ is "+ div(a,b));
    System.out.println("* is "+ mul(a,b));
  }
  public static int sum(int a, int b){
    return a + b;
  }
  public static int sub(int a, int b){
    return a - b;
  }
  public static double div(int a, int b){
    return (double)a / b;
  }
  public static int mul(int a, int b){
    return a * b;
  }
}
