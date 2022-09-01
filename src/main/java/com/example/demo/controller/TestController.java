package com.example.demo.controller;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.dto.TestRequestBodyDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {


    @GetMapping()
    public String testController3(@RequestParam int id){
        return "params" + id;
    }

    @GetMapping("/testRequestBody")
    public String testControllerRequestBody(@RequestBody TestRequestBodyDTO testRequestBodyDTO){



        return "Id" + testRequestBodyDTO.getId() + "message" + testRequestBodyDTO.getMessage();
    }

    @GetMapping("/testResponseBody")
    public ResponseEntity<?> testControllerResponseBody(){
        List<String> list = new ArrayList<>();
        list.add("Hello World");

        ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);

    }



}
