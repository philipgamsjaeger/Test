package at.itk.gamsjaeger.rechnungkunde.repositories.services;

import at.itk.gamsjaeger.rechnungkunde.repositories.KundeRepository;
import at.itk.gamsjaeger.rechnungkunde.repositories.RechnungRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class RechnungService {
    @Autowired
    RechnungRepository rechnungRepository;
    @Autowired
    KundeRepository kundeRepository;

}
