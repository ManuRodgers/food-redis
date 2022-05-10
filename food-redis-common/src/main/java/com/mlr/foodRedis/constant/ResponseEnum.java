package com.mlr.foodRedis.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author manurodgers
 */
@Getter
@AllArgsConstructor
public enum ReturnCode {
  /** 成功 */
  SUCCESS(0, "success"),
  /** 失败 */
  FAIL(1, "Oops! Something was wrong."),
  /** 未登录 */
  NOT_LOGIN(2, "not login");

  /** 自定义状态码* */
  private final Integer code;
  /** 自定义描述* */
  private final String message;
}
