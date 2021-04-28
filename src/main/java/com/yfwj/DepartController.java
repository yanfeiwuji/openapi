package com.yfwj;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author yanfeiwuji
 * @date 2021/2/5 11:22 下午
 */
@Path("depart")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DepartController {

  @GET
  public List<String> get() {
    return Collections.singletonList("1234");
  }

  @POST
  public List<String> post() {
    return Collections.singletonList("1234");
  }

  @Data
  @AllArgsConstructor
  static class A {
    int id;
    String name;
  }

  public static void main(String[] args) {
  }

}
