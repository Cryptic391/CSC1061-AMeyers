package edu.frcc.csc1061j.PlayListManager;

import java.util.List;

public class PlayListManager {

	public static void main(String[] args) {
		List<Song> playlist = new MyDoubleLinkedList<>();
		playlist.add(new Song());
		playlist.add(new Song());
		playlist.add(new Song());
		playlist.add(new Song());
		
		for(Song x : playlist) {
			System.out.println(x);
		}
		System.out.println();

	}

}
