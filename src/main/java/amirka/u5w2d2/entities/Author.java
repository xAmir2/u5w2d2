package amirka.u5w2d2.entities;

import java.time.LocalDate;
import java.util.Random;

public class Author {
    private long id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthDate;
    private String avatar;

    public Author(String name, String surname, String email, LocalDate birthDate) {
        Random rnd = new Random();
        this.id = rnd.nextInt(1, 10000);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthDate = birthDate;
        this.avatar = "https://ui-avatars.com/api/?name=" + name + "+" + surname;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAvatar() {
        return avatar;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
