package com.example.retailgenie;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
class PromotionController{
@Autowired
PromotionRepository repository;

    @GetMapping("/")
public String firstTest(){

   return "App is working";
    }


@GetMapping("/testapp")
public String test(){


return "testapp";


}

/*@GetMapping("/promotions")
@ResponseBody
public String promotions(@RequestParam(required = true) Integer from, @RequestParam(required = true) Integer to){

int c = from  + to;
return Integer.toString(c);


}*/

@GetMapping("/promotion")
@ResponseBody
public Optional<Promotion> promotions(@RequestParam(required = true) Long promotionid){

return repository.findById(promotionid);


}

@GetMapping("/promotions")
@ResponseBody
public Iterable<Promotion> promotions(){

return repository.findAll();


}

@PostMapping(path = "/promotion", consumes = "application/json", produces = "application/json")
public String addPromotion(@RequestBody Promotion promotion) {

repository.save(promotion);

return "test okay";
    
}

@DeleteMapping("/promotion")
@ResponseBody
public String deletePromotion(@RequestParam(required = true) Long promotionid){

    repository.deleteById(promotionid);

    return "Deleted";
}




}