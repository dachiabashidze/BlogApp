package com.application.blogapp.Blog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends JpaRepository<Blog,String> {
}
