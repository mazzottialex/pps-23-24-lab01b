package e1;
import org.junit.jupiter.api.*;

import e1.Logics;
import e1.LogicsImpl;

import static org.junit.jupiter.api.Assertions.*;
public class LogicTest {

  private Logics log = new LogicsImpl(5);
  private int size = 5;

  @BeforeEach
  void init(){
    log = new LogicsImpl(size);
  }

  @Test 
  void checkGenerateKnightPawn(){
    Boolean checkKnight = false;
    Boolean checkPawn = false;
    for(int i = 0; i<size; i++){
      for(int j = 0;j<size; j++ ){
        if(log.hasKnight(i, j)){
          checkKnight = true;
        }
        if(log.hasPawn(i, j)){
          checkPawn = true;
        }
      }
    }
    assertTrue(checkKnight);
    assertTrue(checkPawn);
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
