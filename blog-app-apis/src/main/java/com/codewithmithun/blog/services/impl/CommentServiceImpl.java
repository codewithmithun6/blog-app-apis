package com.codewithmithun.blog.services.impl;

import com.codewithmithun.blog.entities.Comment;
import com.codewithmithun.blog.entities.Post;
import com.codewithmithun.blog.exceptions.ResourceNotFoundException;
import com.codewithmithun.blog.payloads.CommentDto;
import com.codewithmithun.blog.repositories.CommentRepo;
import com.codewithmithun.blog.repositories.PostRepo;
import com.codewithmithun.blog.services.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private PostRepo postRepo;
    @Autowired
    private CommentRepo commentRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CommentDto CreateComment(CommentDto commentDto, Integer postId) {

        Post post = this.postRepo.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", "post id", postId));
        Comment comment = this.modelMapper.map(commentDto, Comment.class);
        comment.setPost(post);
        Comment savedComment = this.commentRepo.save(comment);
        return this.modelMapper.map(savedComment,CommentDto.class);
    }

    @Override
    public void deleteComment(Integer commentId) {
        Comment com = this.commentRepo.findById(commentId).orElseThrow(() -> new ResourceNotFoundException("Comment", "comment id", commentId));
        this.commentRepo.delete(com);

    }
}
