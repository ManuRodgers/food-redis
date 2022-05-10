package com.mlr.foodRedis.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 *
 *
 * <h1>UserVo</h1>
 *
 * @author manurodgers
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserVo {
  private Long id;
  private int isValid;
  private Timestamp createTime;
  private Timestamp updateTime;
  private String username;
  private String email;
  private String password;
  private String nickname;
  private String phone;
  private String avatarUrl;
  private String roles;
}
