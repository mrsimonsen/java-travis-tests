import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {
  Main student = new Main();

  @Test
  public void testSum1(){
    int result = student.sum(1,2);
    assertEquals(3, result);
  }
  @Test
  public void testSum2(){
    int result = student.sum(4,6);
    assertEquals(3, result);
  }
  @Test
  public void testSub1(){
    int result = student.sub(1,2);
    assertEquals(-1, result);
  }
  @Test
  public void testSub2(){
    int result = student.sub(6,4);
    assertEquals(2, result);
  }
  @Test
  public void testDiv1(){
    double result = student.div(1,2);
    assertEquals(0.5, result);
  }
  @Test
  public void testDiv2(){
    int result = student.div(6,3);
    assertEquals(2.0, result);
  }
  @Test
  public void testMul1(){
    int result = student.mul(1,2);
    assertEquals(2, result);
  }
  @Test
  public void testMul2(){
    int result = student.mul(4,6);
    assertEquals(24, result);
  }
}
