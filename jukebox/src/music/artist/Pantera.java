package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class Pantera {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Pantera() {
    }
    
	public ArrayList<Song> getPanteraSongs(){
		
		albumTracks = new ArrayList<Song>();					//Instantiate the album so we can populate it below						
		Song track1 = new Song("Walk", "Pantera");				//Create a song.
		Song track2 = new Song("Cowboys from Hell", "Pantera");
		Song track3 = new Song("Cemetery Gates", "Pantera");
		Song track4 = new Song("I'm Broken", "Pantera");
		Song track5 = new Song("Domination", "Pantera");
		this.albumTracks.add(track1);							//Add the first song to song list for Pantera
		this.albumTracks.add(track2);							//Add the second song to song list for Pantera
		this.albumTracks.add(track3);
		this.albumTracks.add(track4);
		this.albumTracks.add(track5);
		return albumTracks;										//Return the songs for Pantera in the form of an ArrayList
	}
}
