package com;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	//encapsulation
    private String name;
    private String artist;
    private ArrayList<Song> songs;
    

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public ArrayList<Song> getSongs() {
		return songs;
	}
	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}
	//parameterized constructor
    public Album(String name, String artist) {
        this.setName(name);
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    //default constructor
    public Album(){

    }
    //find if a song is there already
    public Song findSong(String title){

        for(Song checkedSong : songs){
            if(checkedSong.getTitle().equals(title)) return checkedSong;
        }
        return null;
    }
    //adding song
    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            songs.add(new Song(title,duration));
//            System.out.println(title + "successfully added to the list");
            return true;
        }
        else {
//            System.out.println("Song with name "+ title+ " already exist in the list");
            return false;
        }
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList){
        int index = trackNumber - 1;
        if(index > 0 && index <= this.songs.size()){
            PlayList.add(this.songs.get(index));
            return true;
        }
//        System.out.println("this album does not have song with trackNumber "+trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> PlayList){
        for(Song checkedSong : this.songs){
            if (checkedSong.getTitle().equals(title)){
                PlayList.add(checkedSong);
                return true;
            }
        }
//        System.out.println(title + "there is no such song in album");
        return false;
    }

}