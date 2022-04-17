package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class BruceSpringsteen {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public BruceSpringsteen() {
    }
    
    public ArrayList<Song> getSpringsteenSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Born to Run", "Bruce Springsteen");            //Create a song.
         Song track2 = new Song("Thunder Road", "Bruce Springsteen");           //Create another song
         Song track3 = new Song("The River", "Bruce Springsteen");              //Create a third song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Bruce Springsteen
         this.albumTracks.add(track2);                                          //Add the second song to song list for Bruce Springsteen 
         this.albumTracks.add(track3);                                          //Add the third song to song list for Bruce Springsteen
         return albumTracks;                                                    //Return the songs for Bruce Springsteen in the form of an ArrayList
    }
}
