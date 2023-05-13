package awstest.test.controller;

import awstest.test.dto.PostSaveRequest;
import awstest.test.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final PostService postService;
    @GetMapping("")
    public ResponseEntity test(){
        return ResponseEntity.ok().body("CI, CD 구축 성공!");
    }

    @PostMapping("/posts/")
    public ResponseEntity savePost(@RequestBody PostSaveRequest postSaveRequest) {
        Long postId = postService.savePost(postSaveRequest);
        return ResponseEntity.created(URI.create("/post/" + postId)).build();
    }
}
