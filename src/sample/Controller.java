package sample;
import javafx.beans.property.Property;
import javafx.fxml.FXML;
import javafx.scene.control.Labeled;
import javafx.scene.control.ListView;


public TextField tekst1;
public TextField tekst2;
public TextField tekst3;
public TextField tekst4;
public TextField tekst5;

private SimpleStringProperty ime;
private SimpleStringProperty prezime;
private SimpleStringProperty mail;
private SimpleStringProperty korisnickoime;
private SimpleStringProperty password;

public class Controller {
    private Labeled tekst1;
    private Property<String> ime;
    ime=new SimpleStringProperty ("");

    private Labeled tekst2;
    private Property<String> prezime;
    ime=new SimpleStringProperty ("");

    private Labeled tekst3;
    private Property<String> mail;
    ime=new SimpleStringProperty ("");

    private Labeled tekst1;
    private Property<String> korisnickoime;
    ime=new SimpleStringProperty ("");

    private Labeled tekst1;
    private Property<String> password;
    ime=new SimpleStringProperty ("");

    private KorisnikiModel model;

    public Controller(KorisnikiModel m){
        model=m;
    }

    public ListView<Korisnik> pogled;

}
 @FXML
public void initialize (){
    Labeled tekst1;
    tekst1.textProperty().bidirectional(ime);

     Labeled tekst2;
     tekst2.textProperty().bidirectional(prezime);

     Labeled tekst3;
     tekst3.textProperty().bidirectional(mail);

     Labeled tekst4;
     tekst4.textProperty().bidirectional(korisnickoime);

     Labeled tekst5;
     tekst5.textProperty().bidirectional(password);

     pogled.setItems(model.getKorisnik());
}
