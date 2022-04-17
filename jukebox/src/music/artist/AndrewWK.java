package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class AndrewWK {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public AndrewWK() {
    }
    
    public ArrayList<Song> getAndrewWKSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Party Hard", "Andrew W.K.");                   //Create a song.
         Song track2 = new Song("I Get Wet", "Andrew W.K.");                    //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Andrew W.K.
         this.albumTracks.add(track2);                                          //Add the second song to song list for Andrew W.K. 
         return albumTracks;                                                    //Return the songs for Andrew W.K. in the form of an ArrayList
    }
}
