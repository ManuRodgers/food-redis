package com.mlr.foodRedis.exception;

import com.mlr.foodRedis.constant.ResponseEnum;
import com.mlr.foodRedis.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author manurodgers
 */
@RestControllerAdvice(value = "com.mlr.foodRedis")
@Slf4j
public class RuntimeExceptionHandler<T> {

  //  @ExceptionHandler(value = UserNotFoundException.class)
  //  public ResponseVo<T> handleUserNotFoundException(UserNotFoundException userNotFoundException)
  // {
  //    log.error("UserNotFoundException: {}", userNotFoundException.getMessage());
  //    return ResponseVo.error(ResponseEnum.USER_NOT_FOUND, userNotFoundException.getMessage());
  //  }

  @ExceptionHandler(value = RuntimeException.class)
  public ResponseVo<T> handleRuntimeException(RuntimeException runtimeException) {
    log.error("RuntimeException: {}", runtimeException.getMessage());
    return ResponseVo.error(ResponseEnum.ERROR, runtimeException.getMessage());
  }
}
