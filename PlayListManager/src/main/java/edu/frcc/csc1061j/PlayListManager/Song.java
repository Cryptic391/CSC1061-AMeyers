package edu.frcc.csc1061j.PlayListManager;

public class Song {
	String artist;
	String title;
	
	
	
	
	public Song(String artist, String title) {
		super();
		this.artist = artist;
		this.title = title;
	}
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Song [artist=" + artist + ", title=" + title + "]";
	}
	
	

}
