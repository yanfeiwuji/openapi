package com.yfwj.sys.e;



import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author yanfeiwuji
 * @date 2021/2/5 7:43 下午
 */
@Path("/dict")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DictController {


  private static final List<Dict> dicts = new ArrayList<>();
  static {
    // 在此处添加
    dicts.add(Dict.enum2Dict(TEnum.class, TEnum.values()));
  }

  @GET
  public List<Dict> as() {
    return dicts;
  }

}
