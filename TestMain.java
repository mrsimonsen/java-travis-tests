public class TestMain{
  public static void main(String[] args){
  Math student = new Math();
  int[] answer;
  int pass = 0;
  int total = 0;
    answer = sumTest(student);
    pass += answer[0];
    total += answer[1];
  System.out.println("+ test: "+answer[0] + "/" + answer[1]);
    answer = sumTest(student);
    pass += answer[0];
    total += answer[1];
  System.out.println("- test: "+answer[0] + "/" + answer[1]);
    answer = sumTest(student);
    pass += answer[0];
    total += answer[1];
  System.out.println("/ test: "+answer[0] + "/" + answer[1]);
    answer = sumTest(student);
    pass += answer[0];
    total += answer[1];
  System.out.println("* test: "+answer[0] + "/" + answer[1]);
  System.out.println();
  System.out.println("Completed "+ pass +" out of "+total+" tests.");
  }

  static int[] sumTest(Math m){
    int passCount = 0;
    int numTests = 2;
    if (m.sum(1,2)==3){
      passCount++;
    }
    if (m.sum(4,6)==10){
      passCount++;
    }
    int[] answer = {passCount, numTests};
    return answer;
  }
  static String subTest(Math m){
    int passCount = 0;
    int numTests = 2;
    int answer;
    if (m.sub(1,2)==-1){
      passCount++;
    }
    if (m.sub(6,4)==2){
      passCount++;
    }
    String result = passCount + "/" + numTests;
    return result;
  }
  static String divTest(Math m){
    int passCount = 0;
    int numTests = 2;
    int answer;
    if (m.div(1,2)==.5){
      passCount++;
    }
    if (m.div(6,3)==2.0){
      passCount++;
    }
    String result = passCount + "/" + numTests;
    return result;
  }
  static String mulTest(Math m){
    int passCount = 0;
    int numTests = 2;
    int answer;
    if (m.mul(1,2)==2){
      passCount++;
    }
    if (m.mul(4,6)==24){
      passCount++;
    }
    String result = passCount + "/" + numTests;
    return result;
  }

}
