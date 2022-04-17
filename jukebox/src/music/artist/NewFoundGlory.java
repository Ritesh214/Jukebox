package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

//Class for an album
public class NewFoundGlory {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public NewFoundGlory() {
    }
    
    public ArrayList<Song> getNewFoundGlorySongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("All Downhill From Here", "New Found Glory");                   //Create a song
         Song track2 = new Song("I Don't Wanna Know", "New Found Glory");                    //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for New Found Glory
         this.albumTracks.add(track2);                                          //Add the second song to song list for New Found Glory 
         return albumTracks;                                                    //Return the songs for New Found Glory in the form of an ArrayList
    }
}
