package com.example.retailgenie;

import org.springframework.web.bind.annotation.GetMapping;
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

@GetMapping("/getpromotions")
public String promotions(){


return "promotions";


}





}