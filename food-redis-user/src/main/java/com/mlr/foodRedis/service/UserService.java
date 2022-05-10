package com.mlr.foodRedis.service;

import com.mlr.foodRedis.vo.ResponseVo;
import com.mlr.foodRedis.vo.UserVo;

/**
 *
 *
 * <h1>用户微服务相关服务接口定义</h1>
 */
public interface UserService {

  /**
   * @param id
   * @return ResponseVo<UserVo>
   */
  public ResponseVo<UserVo> getUserById(Long id);
}
