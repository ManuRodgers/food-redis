package com.mlr.foodRedis.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.mlr.foodRedis.constant.ResponseEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.BindingResult;
import java.util.Objects;

/**
 * @author manurodgers
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseVo<T> {
  private Integer status;
  private String msg;
  private T data;
  private long timestamp;

  public static <T> ResponseVo<T> success(String msg) {
    return ResponseVo.<T>builder()
        .msg(msg)
        .status(ResponseEnum.SUCCESS.getCode())
        .timestamp(System.currentTimeMillis())
        .build();
  }

  public static <T> ResponseVo<T> success(T data) {
    return ResponseVo.<T>builder()
        .status(ResponseEnum.SUCCESS.getCode())
        .data(data)
        .timestamp(System.currentTimeMillis())
        .build();
  }

  public static <T> ResponseVo<T> success() {
    return ResponseVo.<T>builder()
        .status(ResponseEnum.SUCCESS.getCode())
        .msg(ResponseEnum.SUCCESS.getDescription())
        .timestamp(System.currentTimeMillis())
        .build();
  }

  public static <T> ResponseVo<T> error(ResponseEnum responseEnum) {
    return ResponseVo.<T>builder()
        .msg(responseEnum.getDescription())
        .status(responseEnum.getCode())
        .timestamp(System.currentTimeMillis())
        .build();
  }

  public static <T> ResponseVo<T> error(ResponseEnum responseEnum, String msg) {
    return ResponseVo.<T>builder()
        .msg(msg)
        .status(responseEnum.getCode())
        .timestamp(System.currentTimeMillis())
        .build();
  }

  public static <T> ResponseVo<T> error(ResponseEnum responseEnum, BindingResult bindingResult) {
    return ResponseVo.<T>builder()
        .msg(
            Objects.requireNonNull(bindingResult.getFieldError()).getField()
                + " "
                + Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage())
        .status(responseEnum.getCode())
        .timestamp(System.currentTimeMillis())
        .build();
  }
}
