package com.morellana.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.morellana.enums.Category;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskDTO {

    private Long id;

    private String tittle;

    private String description;

    private Category category;

    private boolean isCompleted;

//    private UserDTO user;
}
