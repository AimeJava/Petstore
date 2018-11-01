package com.nf147.dao;

import com.nf147.entity.PsApiResponse;
import java.util.List;

public interface PsApiResponseMapper {
    int insert(PsApiResponse record);

    List<PsApiResponse> selectAll();
}