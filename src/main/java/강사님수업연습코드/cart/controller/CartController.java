package 강사님수업연습코드.cart.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    @GetMapping("/search/{searchedWord}")
    public String searchList(@PathVariable String searchWord) {

        return searchWord;
    }

}
