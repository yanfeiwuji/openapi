package com.yfwj.conf.util;

import lombok.experimental.UtilityClass;

/**
 * @author yanfeiwuji
 * @date 2021/2/5 5:55 下午
 */
@UtilityClass
public class SnowFlakeUtil {

  private static final SnowFlake snowFlake = new SnowFlake(2, 3);

  public Long nextId() {
    return snowFlake.nextId();
  }
}
