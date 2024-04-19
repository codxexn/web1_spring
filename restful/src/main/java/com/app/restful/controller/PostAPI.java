package com.app.restful.controller;

import com.app.restful.domain.PostVO;
import com.app.restful.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/posts/api/*")
public class PostAPI {
    private final PostService postService;
    
//    게시글 추가
    @PostMapping("write")
    public void write(PostVO postVO){
        postService.write(postVO);
    }

//    게시글 조회 GetMapping
//    게시글 전체 조회 GetMapping
//    게시글 수정 PutMapping
//    게시글 삭제 DeleteMapping
}
