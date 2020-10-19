package tn.esprit.spring.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.services.IDepartementService;
import tn.esprit.spring.entities.Departement;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest

public class DepartementServiceImplTest {
	@Autowired
	IDepartementService depService;
	
	@Test
    public void testRetrieveAllDepartments() {
        List<Departement> listDepartement = depService.getAllDepartements(); 
        // if there are 5 users in DB : 
        assertEquals(5, listDepartement.size());
    }
}
