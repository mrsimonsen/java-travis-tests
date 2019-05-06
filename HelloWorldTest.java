import junit.Test;
import static junit.Assert.*;

public class HelloWorldTest{
  @Test
  public void Test1(){
    HelloWorld h = new HelloWorld();
    String r = HelloWorld.say();
    assertEquals("Hello Wolrd", r);
  }
}
