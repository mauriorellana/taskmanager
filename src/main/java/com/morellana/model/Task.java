package com.morellana.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.morellana.enums.Category;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tasks")
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tittle;
    private String description;

    @Enumerated(EnumType.STRING)
    private Category category;
    private boolean isCompleted = false;

    @ManyToOne
    @JoinColumn(name = "users_id")
    @JsonBackReference(value = "users-tasks")
    private User user;
}
