import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest{
  @Test
  public void Test1(){
    HelloWorld h = new HelloWorld();
    String r = h.say();
    assertEquals("Hello World", r);
  }
}
