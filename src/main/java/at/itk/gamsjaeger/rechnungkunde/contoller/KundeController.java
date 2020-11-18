package at.itk.gamsjaeger.rechnungkunde.contoller;

import at.itk.gamsjaeger.rechnungkunde.models.Kunde;
import at.itk.gamsjaeger.rechnungkunde.repositories.KundeRepository;
import at.itk.gamsjaeger.rechnungkunde.repositories.RechnungRepository;
import at.itk.gamsjaeger.rechnungkunde.repositories.services.KundeService;
import at.itk.gamsjaeger.rechnungkunde.repositories.services.RechnungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/kunde/{id}")
    public Kunde getKundeById (@PathVariable Long id){
        return kundeService.getKundeById(id).get();
    }

    @PostMapping("/kunde")
    public Kunde createKunde (@RequestBody Kunde kunde) {
        return kundeService.addKunde(kunde);
    }

    @DeleteMapping("kunde/{id}")
    public ResponseEntity<?> deleteKundeById(@PathVariable Long id){
        kundeService.deleteKundeByID(id);
        return ResponseEntity.ok("Kunde wurde gelöscht");
    }


    //@PostMapping("kunde/{id}/addrechnung"){}


}
