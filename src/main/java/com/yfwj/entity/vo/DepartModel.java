package com.yfwj.entity.vo;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.yfwj.entity.DepartEntity;
import lombok.Data;

import java.util.Map;

/**
 * @author yanfeiwuji
 * @date 2021/2/6 5:22 下午
 */
@Data
public class DepartModel {

  DepartEntity depart;

  Map<String, String> attrs;

  @JsonGetter
  public Map<String, String> getAttrs() {
    return attrs;
  }

  @JsonSetter
  public void setAttrs(Map<String, String> attrs) {
    this.attrs = attrs;
  }

}
