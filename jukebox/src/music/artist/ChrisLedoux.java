package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class ChrisLedoux {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public ChrisLedoux() {
    }
    
    public ArrayList<Song> getChrisLedouxSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   // Instantiate the album so we can populate it below
    	 Song track1 = new Song("Strawberry Roan", "Chris Ledoux");             // Create a song.
         Song track2 = new Song("Silence on The Line", "Chris Ledoux");         // Create another song
         this.albumTracks.add(track1);                                          // Add the first song to song list for the Chris Ledoux
         this.albumTracks.add(track2);                                          // Add the second song to song list for the Chris Ledoux 
         return albumTracks;                                                    // Return the songs for the Chris Ledoux in the form of an ArrayList
    }
}
