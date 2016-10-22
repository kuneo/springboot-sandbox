package org.kuneo.stex.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.kuneo.stex.model.base.UserEntity;

@Mapper
public interface UserRepository {
  
  @Select("SELECT * FROM users WHERE name = #{name}")
  UserEntity findOneByName(@Param("name") String name);
}
