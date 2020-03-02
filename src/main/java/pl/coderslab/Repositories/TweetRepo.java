package pl.coderslab.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.model.Tweet;
import pl.coderslab.model.User;

import java.awt.print.Book;
import java.util.List;

public interface TweetRepo extends JpaRepository<Tweet, Long> {
    List<Tweet> findByUser(User user);

}
