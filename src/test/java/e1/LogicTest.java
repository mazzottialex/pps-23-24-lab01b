package e1;
import org.junit.jupiter.api.*;

import e2.Logics;
import e2.LogicsImpl;

import static org.junit.jupiter.api.Assertions.*;
public class LogicTest {

  private Logics log;

  @BeforeEach
  void init(){
    log = new LogicsImpl(5);
  }

  @Test
  public void test() {
    assertTrue(true);
    // TODO: Add your test logic here
    // You can generate random inputs and assert the expected output
    // For example:
    // int result = Logic.someMethod(5, 10);
    // assertEquals(expectedResult, result);
  }
}
