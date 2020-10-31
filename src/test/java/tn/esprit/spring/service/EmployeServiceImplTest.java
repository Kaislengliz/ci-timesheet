package tn.esprit.spring.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.services.IDepartementService;
import tn.esprit.spring.services.IEmployeService;

@RunWith(SpringRunner.class)
@SpringBootTest

public class EmployeServiceImplTest {
	
	@Autowired
	IEmployeService empService;
	
	
	@Test
	public void testGetNombreEmployeJPQL(){
		
		int count = empService.getNombreEmployeJPQL();
		assertEquals(0, count);
		
	}

	
	@Test
	public void testGetAllEmployes()
	{
        List<Employe> listEmploye = empService.getAllEmployes(); 
        assertEquals(0, listEmploye.size());
    }
	
	
	/*@Test
	public void testMettreAjourEmailByEmployeId()
	{
		Employe employe = empService.authenticate("taha.chaouch@esprit.tn", "test");
		
		empService.mettreAjourEmailByEmployeId("taha@esprit.tn", employe.getId());
		
		assertEquals("taha@esprit.tn", employe.getEmail());
	
	}
	
	
	
	@Test
	public void testAddOrUpdateEmploye()
	{
		Employe emp = new Employe();
		int id = empService.addOrUpdateEmploye(emp);
		assertEquals(emp.getId(), id);
	}*/
	
	
}
