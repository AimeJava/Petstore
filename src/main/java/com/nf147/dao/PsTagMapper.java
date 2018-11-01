package com.nf147.dao;

import com.nf147.entity.PsTag;
import java.util.List;

public interface PsTagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PsTag record);

    PsTag selectByPrimaryKey(Integer id);

    List<PsTag> selectAll();

    int updateByPrimaryKey(PsTag record);
}