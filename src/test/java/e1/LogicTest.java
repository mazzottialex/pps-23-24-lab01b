package e1;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class LogicTest {

  private Logics log = new LogicsImpl(5);
  private final int SIZE = 5;
  private final Pair<Integer, Integer> knight = new Pair<Integer,Integer>(0, 0);
  private final Pair<Integer, Integer> pawn = new Pair<Integer,Integer>(2, 1);

  @BeforeEach
  void init(){
    log = new LogicsImpl(SIZE);
  }

  @Test 
  void checkGenerateKnightPawn(){
    Boolean checkKnight = false;
    Boolean checkPawn = false;
    for(int i = 0; i<SIZE; i++){
      for(int j = 0;j<SIZE; j++ ){
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
  void checkHit(){
    log = new LogicsImpl(SIZE, knight, pawn);
    assertTrue(log.hit(2,1));
    log = new LogicsImpl(SIZE, knight, pawn);
    assertTrue(!log.hit(1,2));
    assertTrue(!log.hit(3,3));
    assertTrue(log.hit(2,1));
  }

  @Test
  void exceptionParametersOutOfBoundHit(){
    log = new LogicsImpl(SIZE, knight, pawn);
    assertThrows( IndexOutOfBoundsException.class, () -> log.hit(6,4));
  }
}
