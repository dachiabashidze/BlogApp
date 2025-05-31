package com.application.blogapp.Blog;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository){
        this.blogRepository = blogRepository;
    }
    public List<Blog> getAllBlogs() {

        List<Blog> blogs = new ArrayList<>();
        blogRepository.findAll().forEach(blogs::add);
        return blogs;
    }

    public Optional<Blog> getBlog(String id) {
        return blogRepository.findById(id);
    }

    public void addBlog(Blog blog) {
        blogRepository.save(blog);
    }

    public void updateBlog(String id, Blog blog) {
        blogRepository.save(blog);
    }

    public void deleteBlog(String id) {
        blogRepository.deleteById(id);
    }
}
