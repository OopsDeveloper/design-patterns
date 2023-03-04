package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._02_after;

import me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._01_before.Post;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Board {

    List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    public Iterator<Post> getRecentPostIterator() {
        List<Post> posts1 = posts;
        posts1.stream().collect(Collectors.toList());
        return new RecentPostIterator(posts1);
    }


}
