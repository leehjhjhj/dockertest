package awstest.test.service;

import awstest.test.domain.Post;
import awstest.test.dto.PostSaveRequest;
import awstest.test.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    @Transactional
    public Long savePost(PostSaveRequest request) {
        Post post = new Post(request.getBody());
        postRepository.save(post);
        return post.getId();
    }

    public Post findPost(Long postId) {
        Post post = postRepository.findById(postId).orElseThrow();
        return post;
    }
}
