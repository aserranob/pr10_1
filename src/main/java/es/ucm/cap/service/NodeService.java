package es.ucm.cap.service;

import org.springframework.http.ResponseEntity;

public interface NodeService {

  public ResponseEntity<?> calculate(int num);

  public ResponseEntity<?> calculate2(int num);

}
