package com.yfwj.conf.req;

import com.yfwj.conf.constant.GlobeConstant;
import com.yfwj.conf.util.SnowFlakeUtil;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * @author yanfeiwuji
 * @date 2021/2/5 5:45 下午
 */
@Provider
public class ReqContainerResponseFilter implements ContainerRequestFilter {


  private String reqId = GlobeConstant.REQ_ID;

  @Override
  public void filter(ContainerRequestContext requestContext) throws IOException {
    // header reqId 先生效
    String reqIdInHeader = requestContext.getHeaderString(reqId);
    if (reqIdInHeader == null) {
      requestContext.setProperty(reqId, SnowFlakeUtil.nextId());
    }
  }
}
