package es.ucm.cap.facade;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class NodeFacade {

  public ResponseEntity<?> calculate(int num) {
    return new ResponseEntity<Long>(fibonacci(Long.valueOf(num)), HttpStatus.OK);
  }

  public ResponseEntity<?> calculate2(int num) {
    long startTime = System.currentTimeMillis();

    Map<Integer, Long> result = new HashMap<Integer, Long>();
    for (int i = 0; i < num; i++) {
      result.put(i, fibonacci(Long.valueOf(i)));
    }
    long endTime = System.currentTimeMillis();
    result.put(-1, endTime - startTime);
    return new ResponseEntity<Map<Integer, Long>>(result, HttpStatus.OK);
  }

  private Long fibonacci(Long n) {
    if (n > 1) {
      return fibonacci(n - 1) + fibonacci(n - 2); // función recursiva
    } else if (n == 1) { // caso base
      return 1L;
    }
    return 0L;
  }
}
