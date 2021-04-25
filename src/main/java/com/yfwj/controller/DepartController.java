package com.yfwj.controller;

import com.yfwj.conf.res.R;
import com.yfwj.dao.DepartAttrDao;
import com.yfwj.dao.DepartDao;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author yanfeiwuji
 * @date 2021/2/5 11:22 下午
 */
@Path("depart")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DepartController {


  @Inject
  DepartDao departDao;
  @Inject
  DepartAttrDao departAttrDao;

  @GET
  public Response get() {
    return Response.ok(R.ok()).build();
  }


}
