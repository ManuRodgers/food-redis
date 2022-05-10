package com.mlr.foodRedis.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mlr.foodRedis.vo.UserVo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 *
 * <h1>商品表实体类定义</h1>
 *
 * @author manurodgers
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "users")
public class User implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(updatable = false, nullable = false)
  private Long id;

  @Column(name = "username", nullable = false)
  private String username;

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "password", nullable = false)
  private String password;

  @Column(name = "nickname", nullable = false)
  private String nickname;

  @Column(name = "phone", nullable = false)
  private String phone;

  @Column(name = "avatar_url", nullable = false)
  private String avatarUrl;

  @Column(name = "roles", nullable = false)
  private String roles;

  @Column(nullable = false)
  private int isValid;

  @JsonIgnore @CreatedDate private Timestamp createTime;
  @JsonIgnore @LastModifiedDate private Timestamp updateTime;

  /**
   *
   *
   * <h2>将 UserVo 转成实体对象</h2>
   */
  public static User toUser(UserVo userVo) {
    return User.builder()
        .username(userVo.getUsername())
        .email(userVo.getEmail())
        .password(userVo.getPassword())
        .nickname(userVo.getNickname())
        .phone(userVo.getPhone())
        .avatarUrl(userVo.getAvatarUrl())
        .roles(userVo.getRoles())
        .isValid(userVo.getIsValid())
        .build();
  }

  /**
   *
   *
   * <h2>将实体对象转成 UserVo </h2>
   */
  public UserVo toUserVo() {
    return UserVo.builder()
        .id(this.id)
        .username(this.getUsername())
        .email(this.getEmail())
        .password(this.getPassword())
        .nickname(this.getNickname())
        .phone(this.getPhone())
        .avatarUrl(this.getAvatarUrl())
        .roles(this.getRoles())
        .isValid(this.getIsValid())
        .createTime(this.createTime)
        .updateTime(this.updateTime)
        .build();
  }
}
