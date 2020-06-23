package com.example.retailgenie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PromotionController{


    @GetMapping("/")
public String firstTest(){

   return "App is working";
    }


@GetMapping("/testapp")
public String test(){


return "testapp";


}

@GetMapping("/promotions")
@ResponseBody
public String promotions(@RequestParam(required = true) Integer from, @RequestParam(required = true) Integer to){

int c = from  + to;
return Integer.toString(c);


}

@GetMapping("/promotion")
@ResponseBody
public String promotions(@RequestParam(required = true) Integer number){

return Integer.toString(number);


}





}