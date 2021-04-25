package com.yfwj.biz;

import com.yfwj.dao.DepartAttrDao;
import com.yfwj.dao.DepartDao;
import com.yfwj.entity.vo.DepartModel;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author yanfeiwuji
 * @date 2021/2/6 5:21 下午
 */
@Singleton
public class DepartBiz {

  @Inject
  DepartDao departDao;
  @Inject
  DepartAttrDao departAttrDao;


  @Transactional
  public void save(DepartModel departModel) {
    final Map<String, String> attrs = departModel.getAttrs();

//    if (attrs != null) {
//      List<DepartAttr> departAttrs = new ArrayList<>();
//      attrs.forEach((k, v) -> departAttrs.add(new DepartAttr(k, v, departModel.getId())));
//      departAttrDao.saveAll(departAttrs);
//    }




  }
}
