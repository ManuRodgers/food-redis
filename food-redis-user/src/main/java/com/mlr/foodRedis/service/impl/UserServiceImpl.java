package com.mlr.foodRedis.service.impl;

import com.mlr.foodRedis.entity.User;
import com.mlr.foodRedis.exception.UserNotFoundException;
import com.mlr.foodRedis.repository.UserRepository;
import com.mlr.foodRedis.service.UserService;
import com.mlr.foodRedis.vo.ResponseVo;
import com.mlr.foodRedis.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 *
 * <h1>商品微服务相关服务功能的实现</h1>
 *
 * @author manurodgers
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
  @Autowired private UserRepository userRepository;

  /**
   * @param id
   * @return ResponseVo<UserVo>
   */
  @Override
  public ResponseVo<UserVo> getUserById(Long id) throws UserNotFoundException {
    User user =
        userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    UserVo userVo = user.toUserVo();
    return ResponseVo.success(userVo);
  }
}
