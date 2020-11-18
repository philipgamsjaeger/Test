package at.itk.gamsjaeger.rechnungkunde.models;

import com.sun.istack.NotNull;

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



}
