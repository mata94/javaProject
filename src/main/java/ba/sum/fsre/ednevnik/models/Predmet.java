package ba.sum.fsre.ednevnik.models;

import jakarta.persistence.*;

@Entity
public class Predmet {

    @Id
    @GeneratedValue
    private Long id;

    private String naziv;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Predmet() {

    }
    public Predmet(Long id, String naziv, User user) {
        this.id = id;
        this.naziv = naziv;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
