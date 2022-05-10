package com.mlr.foodRedis.exception;

/**
 * @author manurodgers
 */
public class UserNotFoundException extends RuntimeException {
  public UserNotFoundException(String message) {
    super(message);
  }
}
