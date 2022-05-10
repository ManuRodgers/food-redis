package com.mlr.foodRedis.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author manurodgers
 */
@Getter
@AllArgsConstructor
public enum ResponseEnum {
  /** 成功 */
  ERROR(-1, "server error"),
  SUCCESS(0, "success"),
  PASSWORD_ERROR(1, "password error"),
  USERNAME_EXIST(2, "username already exists"),
  PARAM_ERROR(3, "parameter error"),
  EMAIL_EXIST(4, "email already exists"),
  USER_NOT_FOUND(5, "user not found"),
  NEED_LOGIN(10, "user have not logged in, Please login"),
  USERNAME_OR_PASSWORD_ERROR(11, "username or password error"),
  ;
  /** 自定义状态码* */
  private final Integer code;
  /** 自定义描述* */
  private final String description;
}
