package webddapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webddapp.data.ArticleDataRepository;
import webddapp.model.Article;

import java.util.Collections;
import java.util.List;

@Service
public class ArticleService {

    /*
    wstrzykiwanie przez pole i konstruktor wtedy gdy obietky są niezbędne do działania danej klasy
    jesli dany element nie musi byc inicjalizowany, to wtedy przez setter, w specjlanych przypakach
     */
    @Autowired
    private ArticleDataRepository articleDataRepository;

    public List<Article> getNewestPostes() {
        List<Article> allArticles = articleDataRepository.findAll();
        Collections.reverse(allArticles);
        return allArticles;
    }

    public void saveArticle(Article article) {
        articleDataRepository.save(article);
    }
}
