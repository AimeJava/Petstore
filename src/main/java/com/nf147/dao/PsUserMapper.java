package com.nf147.dao;

import com.nf147.entity.PsUser;
import java.util.List;

public interface PsUserMapper {
    int deleteByPrimaryKey(Integer id);
    int deleteByPrimaryName(String name);
    int insert(PsUser record);

    PsUser selectByPrimaryKey(Integer id);

    List<PsUser> selectAll();

    int updateByPrimaryKey(PsUser record);
}