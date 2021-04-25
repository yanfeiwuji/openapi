package com.yfwj.conf.res;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author yanfeiwuji
 * @date 2021/2/4 7:25 下午
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GlobeException extends RuntimeException {

  private Error error;

  public GlobeException(Error error) {
    this.error = error;
  }
}
