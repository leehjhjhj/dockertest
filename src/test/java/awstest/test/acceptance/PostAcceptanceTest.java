package awstest.test.acceptance;

import awstest.test.dto.PostSaveRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;

//public class PostAcceptanceTest {
//
//    @DisplayName("글을 작성한다")
//    @Test
//
//    void creatPost() {
//        PostSaveRequest postSaveRequest = new PostSaveRequest();
//        postSaveRequest.setBody("반갑습니다.");
//
//        ExtractableResponse<Response> response = RestAssured.given().log().all()
//                .contentType(MediaType.APPLICATION_JSON_VALUE)
//                .body(memberCreateRequest)
//                .when()
//                .post("/members/")
//                .then().log().all()
//                .extract();
//
//    }
//}
