package sample;

import javafx.beans.property.SimpleStringProperty;

public class Korisnik {
    private SimpleStringProperty ime=new SimpleStringProperty("");
    private SimpleStringProperty prezime=new SimpleStringProperty("");
    private SimpleStringProperty mail=new SimpleStringProperty("");
    private SimpleStringProperty korisnickoime=new SimpleStringProperty("");
    private SimpleStringProperty password=new SimpleStringProperty("");

    public String getIme() {
        return ime.get();
    }

    public SimpleStringProperty imeProperty() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime.set(ime);
    }

    public String getPrezime() {
        return prezime.get();
    }

    public SimpleStringProperty prezimeProperty() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime.set(prezime);
    }

    public String getMail() {
        return mail.get();
    }

    public SimpleStringProperty mailProperty() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail.set(mail);
    }

    public String getKorisnickoime() {
        return korisnickoime.get();
    }

    public SimpleStringProperty korisnickoimeProperty() {
        return korisnickoime;
    }

    public void setKorisnickoime(String korisnickoime) {
        this.korisnickoime.set(korisnickoime);
    }

    public String getPassword() {
        return password.get();
    }

    public SimpleStringProperty passwordProperty() {
        return password;
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public Korisnik(String a, String n, String i, String b, String c) {
        ime = new SimpleStringProperty(a);
        prezime = new SimpleStringProperty(n);
        mail = new SimpleStringProperty(i);
        korisnickoime= new SimpleStringProperty(b);
        password= SimpleStringProperty(c);


    }




}
