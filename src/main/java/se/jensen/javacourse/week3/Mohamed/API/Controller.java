package se.jensen.javacourse.week3.Mohamed.API;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.jensen.javacourse.week3.Mohamed.Athor.Author;
import se.jensen.javacourse.week3.Mohamed.Service.AthorService;

import java.util.Optional;


@RestController
public class Controller {

    private AthorService athorService;

    @Autowired
    public Controller(AthorService athorService) {
        this.athorService = athorService;
    }


    @GetMapping("/athor")
    public Author getAthor(){
        Author author = new Author( "bob", 50, 3);
        return author;
    }

    @RequestMapping("/Athors{id}")
    public Author getAthorByage(@PathVariable Integer age){
        Optional<Author> author = athorService.getAthorByAge(age);
        if (author.isPresent()) {
            return author.get();
        }
        throw new RuntimeException("Athor with age " +age + " does not exist");
    }
}
