package com.nf147.dao;

import com.nf147.entity.PsOrder;
import java.util.List;

public interface PsOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PsOrder record);

    PsOrder selectByPrimaryKey(Integer id);

    List<PsOrder> selectAll();

    int updateByPrimaryKey(PsOrder record);
}