package at.itk.gamsjaeger.rechnungkunde.repositories;

import at.itk.gamsjaeger.rechnungkunde.models.Kunde;
import at.itk.gamsjaeger.rechnungkunde.models.Rechnung;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface KundeRepository extends JpaRepository<Kunde,Long> {
    List<Rechnung> findByKunde(Kunde kunde);
}
