package at.itk.gamsjaeger.rechnungkunde.models;

import com.sun.istack.NotNull;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
public class Kunde {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String Vorname;

    @NotNull
    private String Nachname;

    @NotNull
    @OneToMany(mappedBy = "kunde", cascade = CascadeType.ALL)
    private List<Rechnung> rechnung;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public List<Rechnung> getRechnung() {
        return rechnung;
    }

    public void setRechnung(List<Rechnung> rechnung) {
        this.rechnung = rechnung;
    }
}


