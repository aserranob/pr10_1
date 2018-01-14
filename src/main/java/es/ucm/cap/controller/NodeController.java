package es.ucm.cap.controller;

import es.ucm.cap.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class NodeController {

  @Autowired
  private NodeService nodeService;

  @RequestMapping(value = "/node/calculate/{num}", method = RequestMethod.GET)
  public ResponseEntity<?> calculate(@PathVariable Integer num) {
    return nodeService.calculate(num);
  }

  @RequestMapping(value = "/node/calculate2/{num}", method = RequestMethod.GET)
  public ResponseEntity<?> calculate2(@PathVariable Integer num) {
    return nodeService.calculate2(num);
  }

}
