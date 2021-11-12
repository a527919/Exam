package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Dao {
    @Select("select userId from RoomUser where roomId = #{roomId}")
    List<Integer> findUser(String roomId);
}
