package awstest.test.repository;

import awstest.test.domain.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public interface PostRepository extends JpaRepository<Post, Long> {
}
