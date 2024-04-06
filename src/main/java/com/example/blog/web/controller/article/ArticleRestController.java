package com.example.blog.web.controller.article;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ArticleRestController {

    // GET /articles/1
    @GetMapping("/articles/{id}")
    public ArticleDTO showArticle(@PathVariable("id") long id){
        return new ArticleDTO(
                id,
                "This is a title: id = " + id,
                "This is contents",
                LocalDateTime.now(),
                LocalDateTime.now()
        );
    }
}
