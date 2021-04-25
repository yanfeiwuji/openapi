package com.yfwj.conf.res;

import org.jboss.resteasy.spi.UnhandledException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * @author yanfeiwuji
 * @date 2021/2/6 6:11 下午
 * null is success
 */
@Provider
public class UnhandledExceptionMapper implements ExceptionMapper<UnhandledException> {

  @Override
  public Response toResponse(UnhandledException exception) {
    return Response.status(Response.Status.OK).entity(R.ok()).build();
  }
}
