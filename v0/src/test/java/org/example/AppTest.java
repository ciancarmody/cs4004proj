package org.example;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest{

    @Test
    public void StockTest(){
        LocalDateTime releaseDate = LocalDateTime.now();
        String author = "author";
        String title = "title";
        String edition = "1";
        String publisher = "publisher";
        Book a = new Book(author, releaseDate, title, edition, publisher);
        String str = String.format("%s, %tB %<te, %<tY, %s, edition: %s, %s",author,releaseDate,title,edition,publisher);
        assertTrue(a.toString().matches(str));
        author = "new title";
        title = "title";
        edition = "2";
        publisher = "new publisher";
        releaseDate = releaseDate.plusDays(3);

        a.setAuthor(author);
        a.setReleaseDate(releaseDate);
        a.setTitle(title);
        a.setEdition(edition);
        a.setPublisher(publisher);
        String str2 = String.format("%s, %tB %<te, %<tY, %s, edition: %s, %s",author,releaseDate,title,edition,publisher);
        String str3 = String.format("%s, %tB %<te, %<tY, %s, edition: %s, %s"
                ,a.getAuthor(),a.getReleaseDate(),a.getTitle(),a.getEdition(),a.getPublisher());
        assertTrue(str3.matches(str2));
    }
}
