package at.itk.gamsjaeger.rechnungkunde.repositories.services;

import at.itk.gamsjaeger.rechnungkunde.models.Kunde;
import at.itk.gamsjaeger.rechnungkunde.repositories.KundeRepository;
import at.itk.gamsjaeger.rechnungkunde.repositories.RechnungRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KundeService {

    @Autowired
    KundeRepository kundeRepository;
    @Autowired
    RechnungRepository rechnungRepository;



    public List<Kunde> getAllKunden(){
        return kundeRepository.findAll();
    }




}