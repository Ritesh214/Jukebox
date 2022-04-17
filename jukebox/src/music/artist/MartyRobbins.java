package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class MartyRobbins {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public MartyRobbins() {
    }
    
    public ArrayList<Song> getMartyRobbinsSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   			// Instantiate the album so we can populate it below
    	 Song track1 = new Song("Mr. Shorty", "Marty Robbins");             				// Create a song.
         Song track2 = new Song("Cowboy in the Continental Suit", "Marty Robbins");         // Create another song
         Song track3 = new Song("Ballad of the Alamo", "Marty Robbins");         			// Create another song
         this.albumTracks.add(track1);                                          			// Add the first song to song list for the Marty Robbins
         this.albumTracks.add(track2);                                          			// Add the second song to song list for the Marty Robbins 
         this.albumTracks.add(track3);                                          			// Add the third song to song list for the Marty Robbins
         return albumTracks;                                                    			// Return the songs for Marty Robbins in the form of an ArrayList
    }
}
