package es.ucm.cap.service;

import es.ucm.cap.facade.NodeFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class NodeServiceImpl implements NodeService {

  @Autowired
  private NodeFacade nodeFacade;

  @Override
  public ResponseEntity<?> calculate(int num) {
    return nodeFacade.calculate(num);
  }


  @Override
  public ResponseEntity<?> calculate2(int num) {
    return nodeFacade.calculate2(num);
  }

}
