package com.codewithmithun.blog.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Setter
@Getter
@NoArgsConstructor

public class CategoryDto {

    private Integer categoryId;
    @NotEmpty
    @Size(min = 4,message = "Min size of category title is 4")
    private String categoryTitle;
    @NotEmpty
    @Size(min = 10,message = "Min size of category description is 10")
    private String categoryDescription;
}
