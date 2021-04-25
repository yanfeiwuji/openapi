package com.yfwj.conf.res;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import javax.inject.Inject;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * @author yanfeiwuji
 * @date 2021/2/4 12:56 下午
 */
@Provider
public class GlobeExceptionMapper implements ExceptionMapper<GlobeException> {
  @Inject
  private ObjectMapper objectMapper;


  @SneakyThrows
  @Override
  public Response toResponse(GlobeException exception) {
    return
      Response.status(Response.Status.OK)
        .type(MediaType.APPLICATION_JSON)
        .entity(R.error(exception.getError()))
        .build();

  }
}
