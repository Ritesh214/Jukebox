package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class VilaysithPhongsavath_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
//Created Vilaysith Phongsavath playlist for testing	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	ArrayList<Song>  TupacTracks = new ArrayList<Song>();
    Tupac  Tupac = new  Tupac();
	
    TupacTracks =  Tupac.getTupacsSongs();
	
	playlist.add( TupacTracks.get(1));
	playlist.add( TupacTracks.get(2));
	
	
	//get songs from music list 
   
	ArrayList<Song>  TheNotoriousBIGTracks = new ArrayList<Song>();
	TheNotoriousBIG  TheNotoriousBIG = new TheNotoriousBIG();
	
	TheNotoriousBIGTracks = TheNotoriousBIG.getTheNotoriousBIGsSongs();
	
	playlist.add( TheNotoriousBIGTracks.get(1));
	playlist.add( TheNotoriousBIGTracks.get(2));
	
	
    return playlist;
	}
}