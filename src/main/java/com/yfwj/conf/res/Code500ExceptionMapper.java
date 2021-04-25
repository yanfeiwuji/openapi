package com.yfwj.conf.res;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * @author yanfeiwuji
 * @date 2021/2/5 12:49 下午
 */
public class Code500ExceptionMapper implements ExceptionMapper<Exception> {
  @Inject
  private ObjectMapper objectMapper;

  @SneakyThrows
  @Override
  public Response toResponse(Exception exception) {
    return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
      .entity(R.code500(exception.getMessage()))
      .build();
  }
}
