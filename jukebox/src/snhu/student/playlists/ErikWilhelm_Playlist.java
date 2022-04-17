package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class ErikWilhelm_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	//create erik wilhelm playlist for testing	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> chrisLedeouxTracks = new ArrayList<Song>();
	
    //create entry in playlist for chris ledoux
	ChrisLedoux ChrisLedoux = new ChrisLedoux();
	
    chrisLedeouxTracks = ChrisLedoux.getChrisLedouxSongs();
	//add chris ledoux songs 1 and 2, indexed at 0 and 1
	playlist.add(chrisLedeouxTracks.get(0));
	playlist.add(chrisLedeouxTracks.get(1));
	
	//get marty robins songs from music list 
    MartyRobbins martyRobbins = new MartyRobbins();
	ArrayList<Song> martyRobbinsTracks = new ArrayList<Song>();
    martyRobbinsTracks = martyRobbins.getMartyRobbinsSongs();
	//add tracks from marty robbins 1,2,3, indexed at 0 1 2
	playlist.add(martyRobbinsTracks.get(0));
	playlist.add(martyRobbinsTracks.get(1));
	playlist.add(martyRobbinsTracks.get(2));
	
	//get songs from metallica music list 
	Metallica metallica = new Metallica();
	ArrayList<Song> metallicaTracks = new ArrayList<Song>();
	metallicaTracks = metallica.getMetallicaSongs();
	//add tracks from metallica
	playlist.add(metallicaTracks.get(0));
	playlist.add(metallicaTracks.get(1));

	//get songs from bruce springsteen music list 
	BruceSpringsteen bruceSpringsteen = new BruceSpringsteen();
	ArrayList<Song> bruceSpringsteenTracks = new ArrayList<Song>();
	bruceSpringsteenTracks = bruceSpringsteen.getSpringsteenSongs();
	//add tracks from bruce springsteen
	//experimented with selecting specific songs so i added 1st and 3rd songs, indexed at 0 and 2
	playlist.add(bruceSpringsteenTracks.get(0));
	playlist.add(bruceSpringsteenTracks.get(2));
	
    return playlist;
	}
}
