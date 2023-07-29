package com.codewithmithun.blog.payloads;


//import com.codewithmithun.blog.entities.Comment;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
public class PostDto {

    private Integer postId;
    @NotEmpty
    @Size(min = 4, message = "Title must be minimum of 4 characters")
    private String title;
    @NotEmpty
    @Size(min = 4, message = "Content must be minimum of 4 characters")
    private String content;
    private String imageName;
    private Date addedDate;


    private CategoryDto category;
    private UserDto user;

    private Set<CommentDto> comments = new HashSet<>();


}
