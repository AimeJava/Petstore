package com.nf147.dao;

import com.nf147.entity.PsCategory;
import java.util.List;

public interface PsCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PsCategory record);

    PsCategory selectByPrimaryKey(Integer id);

    List<PsCategory> selectAll();

    int updateByPrimaryKey(PsCategory record);
}