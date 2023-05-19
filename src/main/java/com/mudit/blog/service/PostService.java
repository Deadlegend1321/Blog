package com.mudit.blog.service;

import com.mudit.blog.payload.PostDto;

public interface PostService {
    PostDto createPost(PostDto postDto);
}
