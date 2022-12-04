package se.jensen.javacourse.week3.Mohamed.Service;

import org.springframework.stereotype.Service;
import se.jensen.javacourse.week3.Mohamed.Athor.Author;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service
public class AthorService {



    private List<Author> authorList;
    public AthorService() {

        Author author1 = new Author( "tom",60, 7);
        Author author2 = new Author( "bob",50, 9);
        Author author3 = new Author( "jerry",70, 12);
        authorList.addAll(Arrays.asList(author1, author2, author3));

    }

    public Optional<Author> getAthorByAge(Integer age) {
        Optional optional = Optional.empty();
        for (Author author: authorList){
            if (age == author.getAge()){
                optional = Optional.of(author);
                return optional;
            }
        }
        throw new RuntimeException("Athor with age " + age + " does not exist");
    }


}
