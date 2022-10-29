package ro.tefacprogramator.m4.examplegitproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetInfo {
    
    @GetMapping("/get-info")
    public String getInfo(){
        return "Get info";
    }

}
