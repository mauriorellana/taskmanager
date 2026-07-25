package com.morellana.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.morellana.enums.Role;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    private Long id;

    private String email;

    private String password;

    private Role role;

    private List<TaskDTO> tasks;
}
