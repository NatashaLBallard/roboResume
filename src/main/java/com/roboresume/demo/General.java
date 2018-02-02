package com.roboresume.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class General {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 5)
    private String general;
//
//    @NotNull
//    @Size(min = 5)
//    private String lastName;
//
//    @NotNull
//    @Size(min = 5)
//    private String email;
//
//    @NotNull
//    @Size(min = 5)
//    private String urlLinkedin;
//
//    @NotNull
//    @Size(min = 5)
//    private String urlGitHub;
//
//    @NotNull
//    @Size(min = 5)
//    private String urlTwitter;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGeneral() {
        return general;
    }

    public void setGeneral(String general) {
        this.general = general;
    }

//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getUrlLinkedin() {
//        return urlLinkedin;
//    }
//
//    public void setUrlLinkedin(String urlLinkedin) {
//        this.urlLinkedin = urlLinkedin;
//    }
//
//    public String getUrlGitHub() {
//        return urlGitHub;
//    }
//
//    public void setUrlGitHub(String urlGitHub) {
//        this.urlGitHub = urlGitHub;
//    }
//
//    public String getUrlTwitter() {
//        return urlTwitter;
//    }
//
//    public void setUrlTwitter(String urlTwitter) {
//        this.urlTwitter = urlTwitter;
//    }
}
