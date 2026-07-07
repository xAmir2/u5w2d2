package amirka.u5w2d2.exceptions;

public class NotFoundEx extends RuntimeException {
    public NotFoundEx(long id) {
        super("Nothing was found using this id: " + id);
    }
}
