import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    String a;
    do{
      System.out.println("Choose what to do:");
      System.out.println("\tRun");
      System.out.println("\tTest");
      System.out.print("Choice: ");
      a = scnr.nextLine();
      a = a.toLowerCase();
      System.out.println();
    }while(!a.equals("test")&&!a.equals("run"));

    if(a.equals("run")){
      System.out.println("\n--Running Program--\n");
      Math.main(args);
    }
    else if (a.equals("test")){
      System.out.println("\n--Testing Program--\n");
      test();
    }
    System.out.println("\n--Operation Complete--\n");
  }
  public static void test(){
    Result result = JUnitCore.runClasses(MathTest.class);

    if (result.wasSuccessful()){
      System.out.println("All "+result.getRunCount()+" tests passed");
    }else{
      System.out.println((result.getRunCount()-result.getFailureCount())+" out of "+result.getRunCount()+ " tests passed");
      for (Failure failure : result.getFailures()){
        System.out.println(failure.toString());
      }
    }
  }
}
