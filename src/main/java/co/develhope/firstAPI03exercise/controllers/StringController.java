package co.develhope.firstAPI03exercise.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/strings")
    public String concatenationStrings(@RequestParam(value = "string1") String string1, @RequestParam(required = false, value = "string2") String string2){
        if(string2 == null){
            return string1;
        }else {
            return String.format("%s %s", string1, string2);
        }
    }
}
