package com.tq.mapper;


import com.tq.mapper.entiy.BaseIp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ZylMapper {

    @Select(value = "select en_1_ip from base_ip")
    List<BaseIp> selectIdList();
}



