package com.dev.selldisk.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="client")
public class Client implements Serializable {

    @Id
    @Column(name="idclient")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long idClient;

    @Column(name="nom")
    private String nom;

    @Column(name="mail")
    private String mail;

    @Column(name="password")
    private String password;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Liste> liste;


    public long getIdClient() {
        return idClient;
    }

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Liste> getListe() {
        return liste;
    }

    public void setListe(List<Liste> liste) {
        this.liste = liste;
    }
}
