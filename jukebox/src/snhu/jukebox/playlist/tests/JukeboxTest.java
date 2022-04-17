package snhu.jukebox.playlist.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import music.artist.*;
import snhu.jukebox.playlist.Song;

// Class to handle album tests
public class JukeboxTest {

	@Test
	public void testGetBeatlesAlbumSize() throws NoSuchFieldException, SecurityException {
		 TheBeatles theBeatlesBand = new TheBeatles();
		 ArrayList<Song> beatlesTracks = new ArrayList<Song>();
		 beatlesTracks = theBeatlesBand.getBeatlesSongs();
		 assertEquals(2, beatlesTracks.size());
	}
	
	@Test
	public void testGetImagineDragonsAlbumSize() throws NoSuchFieldException, SecurityException {
		 ImagineDragons imagineDragons = new ImagineDragons();
		 ArrayList<Song> imagineDragonsTracks = new ArrayList<Song>();
		 imagineDragonsTracks = imagineDragons.getImagineDragonsSongs();
		 assertEquals(3, imagineDragonsTracks.size());
	}
	
	@Test
	public void testGetAdelesAlbumSize() throws NoSuchFieldException, SecurityException {
		 Adele adele = new Adele();
		 ArrayList<Song> adelesTracks = new ArrayList<Song>();
		 adelesTracks = adele.getAdelesSongs();
		 assertEquals(3, adelesTracks.size());
	}
	
	@Test     // added by p.enkema
	public void testGetBurtBacharachAlbumSize() throws NoSuchFieldException, SecurityException {
		 BurtBacharach burtBacharach = new BurtBacharach();
		 ArrayList<Song> burtBacharachTracks = new ArrayList<Song>();
		 burtBacharachTracks = burtBacharach.getBurtBacharachSongs();
		 assertEquals(3, burtBacharachTracks.size());
	}

	@Test     // added by p.enkema
	public void testGetHerbAlpertAlbumSize() throws NoSuchFieldException, SecurityException {
		 HerbAlpert herbAlpert = new HerbAlpert();
		 ArrayList<Song> herbAlpertTracks = new ArrayList<Song>();
		 herbAlpertTracks = herbAlpert.getHerbAlpertSongs();
		 assertEquals(2, herbAlpertTracks.size());
	}
	
	@Test
	public void testGetMartyRobbinssAlbumSize() throws NoSuchFieldException, SecurityException {
		MartyRobbins martyRobbins = new MartyRobbins();												// create Marty Robbins variable
		ArrayList<Song> martyRobbinsTracks = new ArrayList<Song>();									// create disc array
		martyRobbinsTracks = martyRobbins.getMartyRobbinsSongs();									// fill tracks numbers for actual tracks
		assertEquals(3, martyRobbinsTracks.size());													// test case for number of tracks created should equal 3
}
	
	@Test
	public void testGetChrisLedouxAlbumSize() throws NoSuchFieldException, SecurityException {
		ChrisLedoux chrisLedoux = new ChrisLedoux();											// create Chris Ledoux variable
		ArrayList<Song> chrisLedouxTracks = new ArrayList<Song>();								// create disc array
		chrisLedouxTracks = chrisLedoux.getChrisLedouxSongs();									// fill tracks numbers for actual tracks
		assertEquals(2, chrisLedouxTracks.size());												// test case for number of tracks created should equal 3
}
	
	@Test
	public void testGetHarveyDangersAlbumSize() throws NoSuchFieldException, SecurityException {
		 HarveyDanger harveyDanger = new HarveyDanger();
		 ArrayList<Song> harveyDangerTracks = new ArrayList<Song>();
		 harveyDangerTracks = harveyDanger.getHarveyDangerSongs();
		 assertEquals(3, harveyDangerTracks.size());
	}
	
	@Test
	public void testGetAndrewWKsAlbumSize() throws NoSuchFieldException, SecurityException {
		 AndrewWK andrewWK = new AndrewWK();
		 ArrayList<Song> andrewWKTracks = new ArrayList<Song>();
		 andrewWKTracks = andrewWK.getAndrewWKSongs();
		 assertEquals(2, andrewWKTracks.size());
	}

	@Test
	public void testGetTheScriptAlbumSize() throws NoSuchFieldException, SecurityException {
		 TheScript theScript = new TheScript();													// create The Script variable
		 ArrayList<Song> theScriptTracks = new ArrayList<Song>();								// create disc array
		 theScriptTracks = theScript.getTheScriptSongs();										// fill tracks numbers for actual tracks
		 assertEquals(2, theScriptTracks.size());												// test case for number of tracks created should equal 2
	}

	@Test
	public void testGetOneRepublicAlbumSize() throws NoSuchFieldException, SecurityException {
		OneRepublic oneRepublic = new OneRepublic();											// create One Republic variable
		ArrayList<Song> oneRepublicTracks = new ArrayList<Song>();								// create disc array
		oneRepublicTracks = oneRepublic.getOneRepublicSongs();									// fill tracks numbers for actual tracks
		assertEquals(3, oneRepublicTracks.size());												// test case for number of tracks created should equal 3
	}
	
	@Test
	public void testGetNewFoundGloryAlbumSize() throws NoSuchFieldException, SecurityException {
		NewFoundGlory newFoundGlory = new NewFoundGlory();										// create New Found Glory variable
		 ArrayList<Song> newFoundGloryTracks = new ArrayList<Song>();							// create disc array
		 newFoundGloryTracks = newFoundGlory.getNewFoundGlorySongs();							// fill tracks numbers for actual tracks
		 assertEquals(2, newFoundGloryTracks.size());											// test case for number of tracks created should equal 2
	}
}
