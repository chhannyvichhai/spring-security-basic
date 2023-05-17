package com.chhai.springsecuritybasic.repository;

import com.chhai.springsecuritybasic.model.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserRepository {

    @Select("select * from accounttb where email like #{email}")
    Account findUserByEmail(String email);
}
