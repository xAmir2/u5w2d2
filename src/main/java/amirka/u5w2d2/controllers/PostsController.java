package amirka.u5w2d2.controllers;

import amirka.u5w2d2.entities.Post;
import amirka.u5w2d2.payloads.PostPayload;
import amirka.u5w2d2.services.PostsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostsController {
    private final PostsService postsService;

    public PostsController(PostsService ps) {
        this.postsService = ps;
    }

    @GetMapping
    public List<Post> findAll() {
        return this.postsService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Post createPost(@RequestBody PostPayload p) {
        return this.postsService.savePost(p);
    }

    @GetMapping("/{postId}")
    public Post findById(@PathVariable long postId) {
        return this.postsService.findById(postId);
    }

    @PutMapping("/{postId}")
    public Post findByIdAndUpdate(@PathVariable long postId, @RequestBody PostPayload p) {
        return this.postsService.findByIdAndUpdate(postId, p);
    }

    @DeleteMapping("/{postId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void findByIdAndDelete(@PathVariable long postId) {
        this.postsService.findByIdAndDelete(postId);
    }
}
