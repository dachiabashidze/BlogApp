package com.application.blogapp.Blog;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BlogController {

    private final BlogService blogService;

    public BlogController(BlogService blogService) {
           this.blogService = blogService;
    }

    @GetMapping("/blogs")
    public List<Blog> getAllBlogs() {
        return blogService.getAllBlogs();
    }

    @GetMapping("/blogs/{id}")
    public Optional<Blog> getBlog(@PathVariable String id) {
        return blogService.getBlog(id);
    }

    @PostMapping("/blogs")
    public void addBlog(Blog blog) {
        blogService.addBlog(blog);
    }

    @PutMapping("/blogs/{id}")
    public void updateBlog(Blog blog, @PathVariable String id) {
        blogService.updateBlog(id, blog);
    }

    @DeleteMapping("/blogs/{id}")
    public void deleteBlog(@PathVariable String id) {
        blogService.deleteBlog(id);
       }
    }
