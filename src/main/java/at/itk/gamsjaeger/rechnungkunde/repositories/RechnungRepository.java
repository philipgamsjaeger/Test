package at.itk.gamsjaeger.rechnungkunde.repositories;

import at.itk.gamsjaeger.rechnungkunde.models.Rechnung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RechnungRepository extends JpaRepository<Rechnung,Long> {
}
