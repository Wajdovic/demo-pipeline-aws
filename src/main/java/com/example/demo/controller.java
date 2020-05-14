package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController("/")
public class controller{

    @GetMapping
    public String test(){
        try{
            InetAddress localhost = InetAddress.getLocalHost();
            return "Wajdi Testing #--!!--# " + localhost.getHostAddress();
        }
        catch (Exception e){
            return "Something went wrong!";
        }
    }

    @GetMapping("/crash")
    public void crash(){
        System.exit(-1);
    }

}
