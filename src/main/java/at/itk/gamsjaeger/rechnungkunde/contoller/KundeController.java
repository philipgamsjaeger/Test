package at.itk.gamsjaeger.rechnungkunde.contoller;

import at.itk.gamsjaeger.rechnungkunde.models.Kunde;
import at.itk.gamsjaeger.rechnungkunde.repositories.KundeRepository;
import at.itk.gamsjaeger.rechnungkunde.repositories.RechnungRepository;
import at.itk.gamsjaeger.rechnungkunde.repositories.services.KundeService;
import at.itk.gamsjaeger.rechnungkunde.repositories.services.RechnungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KundeController {
    @Autowired
    KundeRepository kundeRepository;

    @Autowired
    RechnungRepository rechnungRepository;

    @Autowired
    KundeService kundeService;

    @Autowired
    RechnungService rechnungService;


    @GetMapping("/kunden")
    public List<Kunde> getAllKunden(){
        return kundeService.getAllKunden();
    }

}
