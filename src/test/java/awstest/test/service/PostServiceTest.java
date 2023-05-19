package awstest.test.service;

import awstest.test.domain.Post;
import awstest.test.dto.PostSaveRequest;
import awstest.test.repository.PostRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class PostServiceTest {

    @Autowired
    private PostService postService;
    @Autowired
    private PostRepository postRepository;

    @Test
    void postSaveTest() {
        //given
        PostSaveRequest postSaveRequest = new PostSaveRequest();
        postSaveRequest.setBody("반갑습니다");
        Post post = new Post(postSaveRequest.getBody());
        postRepository.save(post);

        //when
        Post findpost = postService.findPost(1L);

        //then

        Assertions.assertThat(findpost.getBody()).isEqualTo("반갑습니다");

    }
}
