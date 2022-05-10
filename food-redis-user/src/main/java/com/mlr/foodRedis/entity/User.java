package com.mlr.foodRedis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

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
public class UserEntity extends BaseEntity {
  @Column private String username;
  @Column private String nickname;
  @Column private String phone;
  @Column private String email;
  @Column private String password;
  @Column private String avatarUrl;
  @Column private String roles;
}
