package amirka.u5w2d2.services;

import amirka.u5w2d2.entities.Author;
import amirka.u5w2d2.exceptions.NotFoundEx;
import amirka.u5w2d2.payloads.AuthorPayload;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorsServices {
    private List<Author> authors = new ArrayList<>();

    public List<Author> findAll() {
        return this.authors;
    }

    public Author saveAuthor(AuthorPayload p) {
        Author newAuthor = new Author(p.getName(), p.getSurname(), p.getEmail(), p.getBirthDate());
        this.authors.add(newAuthor);
        return newAuthor;
    }

    public Author findById(long authorId) {
        Author found = null;

        for (Author author : this.authors) {
            if (author.getId() == authorId) found = author;
        }

        if (found == null) throw new NotFoundEx(authorId);

        return found;
    }

    public Author findByIdAndUpdate(long authorId, AuthorPayload a) {
        Author found = null;

        for (Author author : this.authors) {
            if (author.getId() == authorId) {
                found = author;
                found.setName(a.getName());
                found.setSurname(a.getSurname());
                found.setEmail(a.getEmail());
                found.setBirthDate(a.getBirthDate());
            }
        }

        if (found == null) throw new NotFoundEx(authorId);
        return found;
    }

    public void findByIdAndDelete(long authorId) {
        Author found = null;

        for (Author author : this.authors) {
            if (author.getId() == authorId) found = author;
        }

        if (found == null) throw new NotFoundEx(authorId);

        this.authors.remove(found);
    }
}
