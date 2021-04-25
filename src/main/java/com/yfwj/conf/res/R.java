package com.yfwj.conf.res;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yanfeiwuji
 * @date 2021/2/4 7:22 下午
 */
@Data
@AllArgsConstructor
public class R<T> {
  private String code;
  private String msg;
  private T data;

  public static <T> R<T> ok() {
    return ok(null);
  }

  public static <T> R<T> ok(T data) {
    return error2R(Error.DefaultError.SUCCESS, data);
  }

  public static <T> R<T> error(Error error) {
    return error2R(error, null);
  }

  public static <T> R<T> error(T data) {
    return error2R(Error.DefaultError.ERROR, data);
  }

  public static <T> R<T> code500(T data) {
    return error2R(Error.DefaultError.CODE500, data);
  }

  private static <T> R<T> error2R(Error error, T data) {
    return new R<>(error.getCode(), error.getMsg(), data);
  }
}
