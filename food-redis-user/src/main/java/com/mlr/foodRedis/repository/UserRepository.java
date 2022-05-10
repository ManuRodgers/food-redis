package com.mlr.foodRedis.repository;

import com.mlr.foodRedis.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author manurodgers
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
