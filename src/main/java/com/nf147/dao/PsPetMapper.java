package com.nf147.dao;

import com.nf147.entity.PsPet;
import java.util.List;

public interface PsPetMapper {
    int deleteByPrimaryKey(Integer id);

    List<PsPet> selectByPrimaryStatus(String status);

    int insert(PsPet record);

    PsPet selectByPrimaryKey(Integer id);

    List<PsPet> selectAll();

    List<PsPet> selectAllPet();

    int updateByPrimaryKey(PsPet record);
}