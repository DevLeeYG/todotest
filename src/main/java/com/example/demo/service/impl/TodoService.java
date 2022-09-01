package com.example.demo.service.impl;

import com.example.demo.service.TodoServiceIf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService implements TodoServiceIf {


    @Override
    public String todoService(){
        return "Test Service";
    }
}
