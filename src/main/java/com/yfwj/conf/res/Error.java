package com.yfwj.conf.res;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yanfeiwuji
 * @date 2021/2/4 7:31 下午
 */
@Data
@AllArgsConstructor
public class Error {
  private String code;
  private String msg;

  public interface DefaultError {
    Error SUCCESS = new Error("000000", "success");
    Error ERROR = new Error("111111", "error");
    Error CODE500 = new Error("000500", "code500");
  }
}
