package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Metallica {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Metallica() {
    }
    
    public ArrayList<Song> getMetallicaSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Enter Sandman", "Metallica");                  //Create a song.
         Song track2 = new Song("Seek and Destroy", "Metallica");               //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Metallica
         this.albumTracks.add(track2);                                          //Add the second song to song list for Metallica 
         return albumTracks;                                                    //Return the songs for Metallica in the form of an ArrayList
    }
}
