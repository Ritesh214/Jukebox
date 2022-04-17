package snhu.student.playlists;

import java.util.ArrayList;
import java.util.LinkedList;

import music.artist.NewFoundGlory;
import music.artist.OneRepublic;
import music.artist.TheScript;
import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;

//Class to handle Ritesh
public class RiteshShah_Playlist {
	/* added for module 6 requirements
	 * songs from The Script, One Republic, and New Found Glory
	 */
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	ArrayList<Song> theScriptTracks = new ArrayList<Song>();
	TheScript theScript = new TheScript();
	theScriptTracks = theScript.getTheScriptSongs();
	
	playlist.add(theScriptTracks.get(0));
	playlist.add(theScriptTracks.get(1));
	
	ArrayList<Song> oneRepublicTracks = new ArrayList<Song>();
	OneRepublic oneRepublic = new OneRepublic();
	oneRepublicTracks = oneRepublic.getOneRepublicSongs();
	
	playlist.add(oneRepublicTracks.get(0));
	playlist.add(oneRepublicTracks.get(1));
	playlist.add(oneRepublicTracks.get(2));

	ArrayList<Song> newFoundGloryTracks = new ArrayList<Song>();
	NewFoundGlory newFoundGlory = new NewFoundGlory();
	newFoundGloryTracks = newFoundGlory.getNewFoundGlorySongs();
	
	playlist.add(newFoundGloryTracks.get(0));
	playlist.add(newFoundGloryTracks.get(1));
	
    return playlist;
	}
}
