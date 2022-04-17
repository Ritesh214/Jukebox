package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class CharlesClayton_Playlist {
	/* added for module 6 requirements
	 * songs from Andrew W.K., Harvey Danger and Metallica
	 */
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	ArrayList<Song> andrewWKTracks = new ArrayList<Song>();
	AndrewWK andrewWK = new AndrewWK();
	andrewWKTracks = andrewWK.getAndrewWKSongs();
	
	playlist.add(andrewWKTracks.get(0));
	playlist.add(andrewWKTracks.get(1));
	
	ArrayList<Song> harveyDangerTracks = new ArrayList<Song>();
	HarveyDanger harveyDanger = new HarveyDanger();
	harveyDangerTracks = harveyDanger.getHarveyDangerSongs();
	
	playlist.add(harveyDangerTracks.get(0));
	playlist.add(harveyDangerTracks.get(1));
	playlist.add(harveyDangerTracks.get(2));

	ArrayList<Song> metallicaTracks = new ArrayList<Song>();
	Metallica metallica = new Metallica();
    metallicaTracks = metallica.getMetallicaSongs();
	
	playlist.add(metallicaTracks.get(0));
	playlist.add(metallicaTracks.get(1));
	
    return playlist;
	}
}
