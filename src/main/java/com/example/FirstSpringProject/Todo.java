package com.example.FirstSpringProject;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Todo {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    Integer id;

    @Column
    String title;


    @Column
    Boolean isCompleted;
    @Column
    Integer userId;
    @Column
    String description;
    @Column
    String priority;
}
