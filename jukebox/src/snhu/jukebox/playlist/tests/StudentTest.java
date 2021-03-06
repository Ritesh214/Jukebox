package snhu.jukebox.playlist.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import snhu.jukebox.playlist.Student;
import snhu.jukebox.playlist.StudentList;
import snhu.student.playlists.*;

//Test class for students
public class StudentTest {

	//Test the list of student names and ensure we get back the name value we expect at the correct/specific point in the list
	@Test
	public void testGetStudentNameList1() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("TestStudent1Name", studentNames.get(0));							//test case for pass/fail. We expect the first name to be TestStudent1Name. Remember arrays start their count at 0 not 1.
	}
	
	@Test
	public void testGetStudentNameList2() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("TestStudent2Name", studentNames.get(1));							//test case to see if the second value contains the name we expect
	}
	
	//Module 5 - Add your unit test case here to check for your name after you have added it to the StudentList
	
	@Test
	public void testGetPhilipEnkema() {
		List<String> studentNames = new ArrayList<String>();		//create variable for student list of names
		StudentList studentList = new StudentList();				//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();				//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Philip Enkema", studentNames.get(2));			//test case to see if the fourth value contains the name we expect
	}

	@Test
	public void testGetCharlesClayton() {
		List<String> studentNames = new ArrayList<String>();		//create variable for student list of names
		StudentList studentList = new StudentList();				//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();				//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Charles Clayton", studentNames.get(3));			//test case to see if the fourth value contains the name we expect
	}
	
	@Test
	public void testGetRileyErickson() {
		List<String> studentNames = new ArrayList<String>();		//create variable for student list of names
		StudentList studentList = new StudentList();				//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();				//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Riley Erickson", studentNames.get(4));		//test case to see if the fifth value contains the name we expect
	}
	//Module 5 - Add Erik Wilhelm unit test case here to check for your name after you have added it to the StudentList

	@Test
	public void testGetErikWilhelm() {
		List<String> studentNames = new ArrayList<String>();		// create variable for student list of names
		StudentList studentList = new StudentList();				// instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();				// populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Erik Wilhelm", studentNames.get(5));			// test case to see if the fourth value contains the name we expect
}
	

//Module 5 - Add Vilaysith Phongsavath unit test case here to check for your name after you have added it to the StudentList

	@Test
	public void testGetVilaysithPhongsavath() {
	List<String> studentNames = new ArrayList<String>();		// create variable for student list of names
	StudentList studentList = new StudentList();				// instantiate the StudentList object so we can access it's methods and properties
	studentNames = studentList.getStudentsNames();				// populate the studentNames list with the actual values in the StudentsList object
	assertEquals("Vilaysith Phongsavath", studentNames.get(6));			// test case to see if the fourth value contains the name we expect
}
	
	//Module 5 - Add MistyPalek unit test case here to check for your name after you have added it to the StudentList

		@Test
		public void testGetMistyPalek() {
			List<String> studentNames = new ArrayList<String>();		// create variable for student list of names
			StudentList studentList = new StudentList();				// instantiate the StudentList object so we can access it's methods and properties
			studentNames = studentList.getStudentsNames();				// populate the studentNames list with the actual values in the StudentsList object
			assertEquals("Misty Palek", studentNames.get(7));			// test case to see if the seventh value contains the name we expect
	}

		//Module 5 - Add TylerPease unit test case here to check for your name after you have added it to the StudentList

		@Test
		public void testGetTylerPease() {
			List<String> studentNames = new ArrayList<String>();		// create variable for student list of names
			StudentList studentList = new StudentList();				// instantiate the StudentList object so we can access it's methods and properties
			studentNames = studentList.getStudentsNames();				// populate the studentNames list with the actual values in the StudentsList object
			assertEquals("Tyler Pease", studentNames.get(8));			// test case to see if the eighth value contains the name we expect
	}

	//Module 5 - Add Ritesh Shah unit test case here to check for your name after you have added it to the StudentList

	@Test
	public void testGetRiteshShah() {
		List<String> studentNames = new ArrayList<String>();			// create variable for student list of names
		StudentList studentList = new StudentList();					// instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();					// populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Ritesh Shah", studentNames.get(9));				// test case to see if the nineth value contains the name we expect
	}		
		
	//Module 6 Test Case Area
	//Test each student profile to ensure it can be retrieved and accessed
	@Test
	public void testGetStudent1Profile() {
		TestStudent1_Playlist testStudent1Playlist = new TestStudent1_Playlist();						//instantiating the variable for a specific student
		Student TestStudent1 = new Student("TestStudent1", testStudent1Playlist.StudentPlaylist());		//creating populated student object
		assertEquals("TestStudent1", TestStudent1.getName());											//test case pass/fail line - did the name match what you expected?
	}
	
	@Test
	public void testGetStudent2Profile() {
		TestStudent2_Playlist testStudent2Playlist = new TestStudent2_Playlist();
		Student TestStudent2 = new Student("TestStudent2", testStudent2Playlist.StudentPlaylist());
		assertEquals("TestStudent2", TestStudent2.getName());
	}
	
	//Module 6 - Add your unit test case here to check for your profile after you have added it to the StudentList
	
	@Test
	public void testGetPhilipEnkemaProfile() {     // added instructor profile test
		PhilipEnkema_Playlist PhilipEnkema_Playlist = new PhilipEnkema_Playlist();
		Student PhilipEnkema = new Student("Philip Enkema", PhilipEnkema_Playlist.StudentPlaylist());
		assertEquals("Philip Enkema", PhilipEnkema.getName());
	}
	
	//add erik wilhelm for unit test case 
	@Test
	public void testGetErikWilhelmProfile() {
		ErikWilhelm_Playlist testErikWilhelmPlaylist = new ErikWilhelm_Playlist();
		Student ErikWilhelm = new Student("Erik Wilhelm", testErikWilhelmPlaylist.StudentPlaylist());
		assertEquals("Erik Wilhelm", ErikWilhelm.getName());
	}
	
	@Test
	public void testGetCharlesClaytonProfile() {
		CharlesClayton_Playlist charlesClaytonPlaylist = new CharlesClayton_Playlist();
		Student CharlesClayton = new Student("Charles Clayton", charlesClaytonPlaylist.StudentPlaylist());
		assertEquals("Charles Clayton", CharlesClayton.getName());
	}

	@Test
	public void testGetRiteshShahProfile() {
		RiteshShah_Playlist riteshShahPlaylist = new RiteshShah_Playlist();
		Student RiteshShah = new Student("Ritesh Shah", riteshShahPlaylist.StudentPlaylist());
		assertEquals("Ritesh Shah", RiteshShah.getName());
	}
}
