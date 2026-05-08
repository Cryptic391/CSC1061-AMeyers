package edu.frcc.csc1061j.PlayListManager;

import java.util.List;
import java.util.Scanner;

public class PlayListManager {

	public static void main(String[] args) {
		List<Song> playlist = new MyDoubleLinkedList<>();
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Playlist Manager");
		System.out.println("Commands:");
		System.out.println("add");
		System.out.println("remove");
		System.out.println("count");
		System.out.println("play");
		System.out.println("shuffle");
		System.out.println("reverse");
		System.out.println("quit");
		System.out.print("\n:");
		
		
		playlist.add(new Song("Artist 1","Title 1"));
		playlist.add(new Song("Artist 2","Title 2"));
		playlist.add(new Song("Artist 3","Title 3"));
		playlist.add(new Song("Artist 4","Title 4"));
		
		
	while(!input.nextLine().equals("quit")) {
		System.out.print("\n:");
		String command = input.nextLine();
		
		
		if(command.equals("add")) {
			System.out.print("Enter Artist:");
			String artist = input.next();
			System.out.print("Enter Title: ");
			String title = input.next();
			playlist.add(new Song(artist,title));
		}
		
		if(command.equals("remove")) {
			System.out.print("Enter Artist:");
			String artist = input.next();
			System.out.print("Enter Title: ");
			String title = input.next();
			for(Song x : playlist) {
				if(x.getArtist().equals(artist) && x.getTitle().equals(title)) {
					playlist.remove(x);
				}
			}
		}
		
		if(command.equals("count")) {
				System.out.println(playlist.size());
			}
		
		
		if(command.equals("play")) {
			for(Song x : playlist) {
				System.out.println(x);
			}
			System.out.println();
		}
		
		if(command.equals("shuffle")) {
			
		}
		
		if(command.equals("reverse")) {
			
		}
	
	}
		

	}

}
