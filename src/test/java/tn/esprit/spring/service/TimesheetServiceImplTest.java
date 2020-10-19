package tn.esprit.spring.service;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Mission;

import tn.esprit.spring.services.ITimesheetService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TimesheetServiceImplTest {
	@Autowired
	ITimesheetService TspService;
	
	
	@Test
	public void testajouterMission() {
		Mission msn = new Mission();
		int id = TspService.ajouterMission(msn);
		assertEquals(msn.getId(), id);
	}
    
	
	
	@Test
	public void testaffecterMissionADepartement(int missionId, int depId) {
	
		
	}

	
	@Test
	public void testajouterTimesheet(int missionId, int employeId, Date dateDebut, Date dateFin) {
	
		
	}

	
	
	@Test
	public void testvaliderTimesheet(int missionId, int employeId, Date dateDebut, Date dateFin, int validateurId) {
	
		
	}

	
	
	@Test
	public void testfindAllMissionByEmployeJPQL() {
		  List<Mission>ListMissionByEmployeJPQL = TspService.findAllMissionByEmployeJPQL(1); 
	        // if there are 2 mission for this user  in DB : 
	        assertEquals(2, ListMissionByEmployeJPQL.size());
		
	}

	
	
	@Test
	public void testgetAllEmployeByMission() {
		
	    List<Employe> Listemployeesbymission = TspService.getAllEmployeByMission(1); 
        // if there are 5 employees affected to this mission   in DB : 
        assertEquals(5, Listemployeesbymission.size());	
	}
}
