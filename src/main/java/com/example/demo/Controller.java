package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exam/")
public class Controller {
    @Autowired
    private Dao dao;


    @RequestMapping("joinRoom")
    public List<Integer> joinRoom(String roomId, String userId){
        return dao.findUser(roomId);
    }

    @RequestMapping("leaveRoom")
    public List<Integer> leaveRoom(String roomId, String userId){
        return dao.findUser(roomId);
    }

}
