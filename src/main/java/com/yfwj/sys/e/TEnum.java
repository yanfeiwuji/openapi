package com.yfwj.sys.e;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author yanfeiwuji
 * @date 2021/2/5 7:37 下午
 */
@AllArgsConstructor
public enum TEnum implements EnumBase<TEnum> {
  T1("t1"),
  T2("t2");
  @Getter
  String name;
}
