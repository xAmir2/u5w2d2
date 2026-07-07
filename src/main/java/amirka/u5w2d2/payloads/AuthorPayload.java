package amirka.u5w2d2.payloads;

import java.time.LocalDate;

public class AuthorPayload {
    private String name;
    private String surname;
    private String email;
    private LocalDate birthDate;

    public AuthorPayload() {
    }

    public AuthorPayload(String name, String surname, String email, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "AuthorPayload{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
