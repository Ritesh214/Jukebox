package snhu.jukebox.playlist;

import snhu.student.playlists.RiteshShah_Playlist;
import snhu.student.playlists.*;

import java.util.ArrayList;
import java.util.List;

//Class to handle student association with album
public class StudentList {

	public StudentList(){
	}

	public List<String> getStudentsNames() {
		ArrayList<String> studentNames = new ArrayList<String>();
		
		String StudentName1 = "TestStudent1Name";
		studentNames.add(StudentName1);
		
		String StudentName2 = "TestStudent2Name";
		studentNames.add(StudentName2);
		
		//Module 5 Code Assignment
		//Add your name to create a new student profile
		//Use template below and put your name in the areas of 'StudentName'
		//String StudentName3 = "TestStudent3Name";
		//studentNames.add(StudentName3);
		
		String PhilipEnkema = "Philip Enkema";  // added instructor as student
		studentNames.add(PhilipEnkema);		
		
		String CharlesClayton = "Charles Clayton";  // added Charles Clayton as student
		studentNames.add(CharlesClayton);
		
		String RileyErickson = "Riley Erickson";  // added Riley as student
		studentNames.add(RileyErickson);
		
		String ErikWilhelm = "Erik Wilhelm";		// added Erik Wilhelm as student
		studentNames.add(ErikWilhelm);
		
		String VilaysithPhongsavath = "Vilaysith Phongsavath";		// added Vilaysith phongsavath as student
		studentNames.add(VilaysithPhongsavath);
		
		String MistyPalek = "Misty Palek";		// added Misty Palek as student
		studentNames.add(MistyPalek);
		
		String TylerPease = "Tyler Pease";		// added Tyler Pease as student
		studentNames.add(TylerPease);

		String RiteshShah = "Ritesh Shah";		// added Ritesh Shah as student
		studentNames.add(RiteshShah);
		
		return studentNames;		
	}

	public Student GetStudentProfile(String student){
		Student emptyStudent = null;
	
		switch(student) {
		   case "TestStudent1_Playlist":
			   TestStudent1_Playlist testStudent1Playlist = new TestStudent1_Playlist();
			   Student TestStudent1 = new Student("TestStudent1", testStudent1Playlist.StudentPlaylist());
			   return TestStudent1;
			   
		   case "TestStudent2_Playlist":
			   TestStudent2_Playlist testStudent2Playlist = new TestStudent2_Playlist();
			   Student TestStudent2 = new Student("TestStudent2", testStudent2Playlist.StudentPlaylist());
			   return TestStudent2;
			   
			   
		   //Module 6 Code Assignment - Add your own case statement for your profile. Use the above case statements as a template.

		   case "PhilipEnkema_Playlist":
			   PhilipEnkema_Playlist PhilipEnkema_Playlist = new PhilipEnkema_Playlist();
			   Student PhilipEnkema = new Student("Philip Enkema", PhilipEnkema_Playlist.StudentPlaylist());
			   return PhilipEnkema;			   
			   //Erik Wilhelm case statement for profile. 
		   	
		   case "ErikWilhelm_Playlist":
			   ErikWilhelm_Playlist ErikWilhelmPlaylist = new ErikWilhelm_Playlist();
			   Student ErikWilhelm = new Student("ErikWIlhelm", ErikWilhelmPlaylist.StudentPlaylist());
			   return ErikWilhelm;
			   
		   case "CharlesClayton_Playlist":
			   CharlesClayton_Playlist CharlesClaytonPlaylist = new CharlesClayton_Playlist();
			   Student CharlesClayton = new Student("Charles Clayton", CharlesClaytonPlaylist.StudentPlaylist());
			   return CharlesClayton;

		   case "RiteshShah_Playlist":
			   RiteshShah_Playlist RiteshShahPlaylist = new RiteshShah_Playlist();
			   Student RiteshShah = new Student("Ritesh Shah", RiteshShahPlaylist.StudentPlaylist());
			   return RiteshShah;
			   
		}
		return emptyStudent;
	}
}
