package at.itk.gamsjaeger.rechnungkunde.repositories.services;

import at.itk.gamsjaeger.rechnungkunde.models.Kunde;
import at.itk.gamsjaeger.rechnungkunde.models.Rechnung;
import at.itk.gamsjaeger.rechnungkunde.repositories.KundeRepository;
import at.itk.gamsjaeger.rechnungkunde.repositories.RechnungRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class RechnungService {
    @Autowired
    RechnungRepository rechnungRepository;
    @Autowired
    KundeRepository kundeRepository;

    public List<Rechnung> getAllRechnungen(){
        return rechnungRepository.findAll();
    }

    public Optional<Rechnung> getKundeById(Long id){
        return rechnungRepository.findById(id);
    }

    public Rechnung addRechnung (Rechnung rechnung){
        return rechnungRepository.save(rechnung);
    }

    public void deleteRechnungByID (Long id){
        rechnungRepository.deleteById(id);
    }
}
