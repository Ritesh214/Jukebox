package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class HarveyDanger {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public HarveyDanger() {
    }
    
    public ArrayList<Song> getHarveyDangerSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Carlotta Valdez", "Harvey Danger");            //Create a song.
         Song track2 = new Song("Flagpole Sitta", "Harvey Danger");             //Create another song
         Song track3 = new Song("Jack the Lion", "Harvey Danger");              //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Harvey Danger
         this.albumTracks.add(track2);                                          //Add the second song to song list for Harvey Danger 
         this.albumTracks.add(track3);
         return albumTracks;                                                    //Return the songs for Harvey Danger in the form of an ArrayList
    }
}
