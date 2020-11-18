package at.itk.gamsjaeger.rechnungkunde.repositories.services;

import at.itk.gamsjaeger.rechnungkunde.models.Kunde;
import at.itk.gamsjaeger.rechnungkunde.models.Rechnung;
import at.itk.gamsjaeger.rechnungkunde.repositories.KundeRepository;
import at.itk.gamsjaeger.rechnungkunde.repositories.RechnungRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Kunde> getKundeById(Long id){
        return kundeRepository.findById(id);
    }

    public Kunde addKunde (Kunde kunde){
        return kundeRepository.save(kunde);
    }

   public void deleteKundeByID (Long id){
        kundeRepository.deleteById(id);
   }




    public Rechnung addRechnungForKunde(Long id, Rechnung rechnung) throws Exception{
        Optional<Kunde> opkunde = kundeRepository.findById(id);
        if (opkunde.isPresent()){
            Kunde kunde = opkunde.get();
            rechnung.setKunde(kunde);
            return rechnung;
        }else{
            throw new Exception();
        }
    }








}
