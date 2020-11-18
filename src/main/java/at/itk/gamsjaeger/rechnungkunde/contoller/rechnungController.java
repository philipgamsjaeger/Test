package at.itk.gamsjaeger.rechnungkunde.contoller;

import at.itk.gamsjaeger.rechnungkunde.models.Rechnung;
import at.itk.gamsjaeger.rechnungkunde.repositories.services.KundeService;
import at.itk.gamsjaeger.rechnungkunde.repositories.services.RechnungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class rechnungController {

    @Autowired
    RechnungService rechnungService;
    @Autowired
    KundeService kundeService;

    @GetMapping("/rechnungen")
        public List<Rechnung> getAllRechnungen(){
             return rechnungService.getAllRechnungen();
    }

    @GetMapping("/rechnung/{id}")
        public Rechnung getRechnungById(@PathVariable Long id) {
           return rechnungService.getRechnungById(id).get();
    }





}
