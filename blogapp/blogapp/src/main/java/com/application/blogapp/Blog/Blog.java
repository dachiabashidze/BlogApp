package com.application.blogapp.Blog;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor

@Entity
public class Blog {
    @Id
    private String id;
    private String description;
    private String author;
    private String authorId;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Enumerated(EnumType.STRING)
    private Status status;

}
