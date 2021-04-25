package com.yfwj.sys.e;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yanfeiwuji
 * @date 2021/2/5 8:03 下午
 */
@Data
@AllArgsConstructor
public class Dict {
  String dictKye;
  List<DictKeyValue> values;

  @Data
  @AllArgsConstructor
  private static class DictKeyValue {
    String key;
    String name;
  }

  @SneakyThrows
  public static Dict enum2Dict(Class<? extends EnumBase> clazz, EnumBase[] enumBases) {
    final List<DictKeyValue> collect = Arrays.stream(enumBases).map(e ->
      new DictKeyValue(((Enum) e).toString(), e.getName())
    ).collect(Collectors.toList());
    return new Dict(clazz.getSimpleName().replace("Enum",""), collect);
  }

}
