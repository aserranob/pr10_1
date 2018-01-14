package es.ucm.cap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
// @EnableSwagger2
@EnableDiscoveryClient
public class NodeApplication {

  public static void main(String[] args) {
    SpringApplication.run(NodeApplication.class, args);
  }

}
