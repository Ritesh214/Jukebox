package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

//Class for an album
public class TheScript {
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public TheScript() {
    }
    
    public ArrayList<Song> getTheScriptSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Fall For Anything", "The Script");                   //Create a song
         Song track2 = new Song("The Man Who Can't Be Moved", "The Script");                    //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for The Script
         this.albumTracks.add(track2);                                          //Add the second song to song list for The Script 
         return albumTracks;                                                    //Return the songs for The Script in the form of an ArrayList
    }
}
