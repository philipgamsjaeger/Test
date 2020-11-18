package at.itk.gamsjaeger.rechnungkunde.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Rechnung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotNull
    @Column(unique = true)
    private Long rechnungsnummer;

    @NotNull
    private Date rechnungsdatum;

    @NotNull
    private double rechnungsbetrag;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Kunde kunde;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRechnungsnummer() {
        return rechnungsnummer;
    }

    public void setRechnungsnummer(Long rechnungsnummer) {
        this.rechnungsnummer = rechnungsnummer;
    }

    public Date getRechnungsdatum() {
        return rechnungsdatum;
    }

    public void setRechnungsdatum(Date rechnungsdatum) {
        this.rechnungsdatum = rechnungsdatum;
    }

    public double getRechnungsbetrag() {
        return rechnungsbetrag;
    }

    public void setRechnungsbetrag(double rechnungsbetrag) {
        this.rechnungsbetrag = rechnungsbetrag;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }
}
