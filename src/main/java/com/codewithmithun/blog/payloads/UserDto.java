package com.codewithmithun.blog.payloads;

import com.codewithmithun.blog.entities.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Setter
@Getter
public class UserDto {


    private int id;
    @NotEmpty
    @Size(min = 4, message = "Username must be minimum of 4 characters")
    private String name;
    @NotEmpty
    @Email(message = "Email address is not valid !!")
    private String email;
    @NotEmpty
    @Size(min = 3,max = 10,message = "Password must be min of 3 chars and max of 10 chars")
    private String password;
    @NotEmpty
    private String about;

    private Set<RoleDto> roles = new HashSet<>();
}
