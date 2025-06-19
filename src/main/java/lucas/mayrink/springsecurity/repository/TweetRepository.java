package lucas.mayrink.springsecurity.repository;

import lucas.mayrink.springsecurity.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
    
}
