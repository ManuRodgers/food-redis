package com.mlr.foodRedis.controller;

import com.mlr.foodRedis.service.UserService;
import com.mlr.foodRedis.vo.ResponseVo;
import com.mlr.foodRedis.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author manurodgers
 */
@RestController
@RequestMapping("/user")
@RefreshScope
public class UserController {

  @Autowired private UserService userService;

  @GetMapping("/{id}")
  public ResponseVo<UserVo> getUserById(@PathVariable String id) {
    return userService.getUserById(Long.valueOf(id));
  }
}
