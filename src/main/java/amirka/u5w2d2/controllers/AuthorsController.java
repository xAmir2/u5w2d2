package amirka.u5w2d2.controllers;

import amirka.u5w2d2.entities.Author;
import amirka.u5w2d2.payloads.AuthorPayload;
import amirka.u5w2d2.services.AuthorsServices;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorsController {
    private final AuthorsServices authorsServices;

    public AuthorsController(AuthorsServices as) {
        this.authorsServices = as;
    }

    @GetMapping
    public List<Author> findAll() {
        return this.authorsServices.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Author createPost(@RequestBody AuthorPayload a) {
        return this.authorsServices.saveAuthor(a);
    }

    @GetMapping("/{authorId}")
    public Author findById(@PathVariable long authorId) {
        return this.authorsServices.findById(authorId);
    }

    @PutMapping("/{authorId}")
    public Author findByIdAndUpdate(@PathVariable long authorId, @RequestBody AuthorPayload a) {
        return this.authorsServices.findByIdAndUpdate(authorId, a);
    }

    @DeleteMapping("/{authorId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void findByIdAndDelete(@PathVariable long authorId) {
        this.authorsServices.findByIdAndDelete(authorId);
    }
}
