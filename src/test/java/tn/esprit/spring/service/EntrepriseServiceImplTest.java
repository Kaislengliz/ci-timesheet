package tn.esprit.spring.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntrepriseServiceImplTest {
	
	@Autowired
	IEntrepriseService entService;
	
	@Test
	public void testGetEntrepriseById()
	{
		Entreprise ent = entService.getEntrepriseById(1);
		assertEquals(ent.getId(), 0);
	}
	
	/*@Test
	public void testAjouterEntreprise()
	{
		Entreprise ent = new Entreprise();
		int id = entService.ajouterEntreprise(ent);
		assertEquals(ent.getId(), id);
	}
	
	@Test
	public void testAjouterDepartement()
	{
		Departement dept = new Departement();
		int id = entService.ajouterDepartement(dept);
		assertEquals(dept.getId(), id);
	}*/
	
	
}
