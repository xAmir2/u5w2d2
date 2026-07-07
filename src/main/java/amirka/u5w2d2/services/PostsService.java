package amirka.u5w2d2.services;

import amirka.u5w2d2.entities.Post;
import amirka.u5w2d2.exceptions.NotFoundEx;
import amirka.u5w2d2.payloads.PostPayload;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostsService {
    private List<Post> posts = new ArrayList<>();

    public List<Post> findAll() {
        return this.posts;
    }

    public Post savePost(PostPayload p) {
        Post newPost = new Post(p.getCategory(), p.getTitle(), p.getContent());
        this.posts.add(newPost);
        return newPost;
    }

    public Post findById(long userId) {
        Post found = null;

        for (Post post : this.posts) {
            if (post.getId() == userId) found = post;
        }

        if (found == null) throw new NotFoundEx(userId);

        return found;
    }

    public Post findByIdAndUpdate(long postId, PostPayload p) {
        Post found = null;

        for (Post post : this.posts) {
            if (post.getId() == postId) {
                found = post;
                found.setCategory(p.getCategory());
                found.setTitle(p.getTitle());
                found.setContent(p.getContent());
            }
        }

        if (found == null) throw new NotFoundEx(postId);
        return found;
    }

    public void findByIdAndDelete(long id) {
        Post found = null;

        for (Post post : this.posts) {
            if (post.getId() == id) found = post;
        }

        if (found == null) throw new NotFoundEx(id);

        this.posts.remove(found);
    }
}
