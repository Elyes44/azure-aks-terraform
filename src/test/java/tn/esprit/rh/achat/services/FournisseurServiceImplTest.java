package tn.esprit.rh.achat.services;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.times;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;
import tn.esprit.rh.achat.entities.Fournisseur;
import tn.esprit.rh.achat.repositories.FournisseurRepository;

@SpringBootTest
public class FournisseurServiceImplTest {
/*
    @InjectMocks
    private FournisseurServiceImpl fournisseurService;

    @Mock
    private FournisseurRepository fournisseurRepository;

    @Test
    public void retrieveAllFournisseurs() {
        List<Fournisseur> fournisseursFictifs = new ArrayList<>();

        Mockito.when(fournisseurRepository.findAll()).thenReturn(fournisseursFictifs);

        List<Fournisseur> result = fournisseurService.retrieveAllFournisseurs();

        assertEquals(fournisseursFictifs, result);
    }
    @Test
    public void deleteFournisseur() {
        fournisseurService.deleteFournisseur(1L);

        Mockito.verify(fournisseurRepository, times(1)).deleteById(1L);
    }

    @Test
    public void retrieveFournisseur() {
        Fournisseur fournisseurFictif = new Fournisseur();
        Mockito.when(fournisseurRepository.findById(1L)).thenReturn(java.util.Optional.ofNullable(fournisseurFictif));

        Fournisseur result = fournisseurService.retrieveFournisseur(1L);

        assertEquals(fournisseurFictif, result);
    }

 */
}
