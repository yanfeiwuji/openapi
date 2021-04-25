package com.yfwj.conf.res;

import com.yfwj.conf.constant.GlobeConstant;
import io.smallrye.common.constraint.Assert;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * @author yanfeiwuji
 * @date 2021/2/5 9:58 上午
 */
@Provider
public class RContainerResponseFilter implements ContainerResponseFilter {

  private String reqId = GlobeConstant.REQ_ID;

  @Override
  public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
    addRPack(responseContext);
  }

  private void addRPack(ContainerResponseContext responseContext) {

    Object o = responseContext.getEntity();
    if (o == null) {
      responseContext.setEntity(R.ok());
      return;
    }
    if (!(o instanceof R)) {
      responseContext.setEntity(R.ok(o));
      return;
    }
  }


  private void handleReqId(ContainerRequestContext requestContext) {
    Object reqObj = requestContext.getProperty(reqId);
    Assert.assertFalse(reqObj != null);
  }


}
