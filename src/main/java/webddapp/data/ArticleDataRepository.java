package webddapp.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webddapp.model.Article;


@Repository
public interface ArticleDataRepository extends JpaRepository<Article, Long> {

    //Naucz się jak nazywa się ten jezyk SQL, chyba JPQL ale nie jestem pewien
    //@Query("SELECT article from Article article where article.creationTime > :currentDateTime")
    //List<Article> findLast24HoursPosts(@Param(value = "currentDateTime")LocalDateTime currentDateTime);
}
