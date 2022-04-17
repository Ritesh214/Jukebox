package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class Periphery {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Periphery() {
    }
    
	public ArrayList<Song> getPeripherySongs(){
		
		albumTracks = new ArrayList<Song>();					//Instantiate the album so we can populate it below						
		Song track1 = new Song("Buttersnips", "Periphery");		//Create a song.
		Song track2 = new Song("Icarus Lives", "Periphery");
		Song track3 = new Song("Zyglrox", "Periphery");
		Song track4 = new Song("Catch Fire", "Periphery");
		Song track5 = new Song("Crush", "Periphery");
		this.albumTracks.add(track1);							//Add the first song to song list for Periphery
		this.albumTracks.add(track2);							//Add the second song to song list for Periphery
		this.albumTracks.add(track3);
		this.albumTracks.add(track4);
		this.albumTracks.add(track5);
		return albumTracks;										//Return the songs for Periphery in the form of an ArrayList
	}
}
