package com.codewithmithun.blog.services;

import com.codewithmithun.blog.payloads.CommentDto;

public interface CommentService {

    CommentDto CreateComment(CommentDto commentDto, Integer postId);
    void deleteComment(Integer commentId);
}
