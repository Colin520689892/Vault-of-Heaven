package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    //select setmeal id from setmeal dish where dish_id in(1,2,3,4)
    List<Long> getSetmealIdByDishIds(List<Long> dishIds);
}
