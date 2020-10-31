package tn.esprit.spring.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.services.IContratService;
import tn.esprit.spring.entities.Contrat;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ContractServiceImplTest {
	@Autowired
	IContratService contatService;
	
	@Test
    public void testRetrieveAllContrat() {
        List<Contrat> listContrat = contatService.getAllContrats(); 
       
        assertEquals(0, listContrat.size());
    }
}
