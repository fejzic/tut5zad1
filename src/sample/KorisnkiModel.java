package sample;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KorisnikiModel {
    private ObservableList<Korisnik> KorisnikModela = FXCollections.observableArrayList();
    private ObjectProperty<Korisnik> trenutniKorisnik = new SimpleObjectProperty<>();

    public ObjectProperty<Korisnik> trenutniKorisnikProperty() {
        return trenutniKorisnik;
    }
    public Korisnik getTrenutniKorisnik() {
        return trenutniKorisnik.get();
    }
    public void setTrenutniKorisnik(Korisnik k) {
        trenutniKorisnik.set(k);
    }
    public ObservableList<Korisnik> getKorisnik() {
        return KorisnikModela;
    }

}
