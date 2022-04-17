package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

//Class for an album
public class OneRepublic {
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public OneRepublic() {
    }
    
    public ArrayList<Song> getOneRepublicSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Stop And Stare", "One Republic");            //Create a song
         Song track2 = new Song("Goodbye Apathy", "One Republic");             //Create another song
         Song track3 = new Song("Someone To Save You", "One Republic");              //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for One Republic
         this.albumTracks.add(track2);                                          //Add the second song to song list for One Republic 
         this.albumTracks.add(track3);											//Add the third song to song list for One Republic
         return albumTracks;                                                    //Return the songs for One Republic in the form of an ArrayList
    }
}
