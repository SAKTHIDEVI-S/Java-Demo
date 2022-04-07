package com;

public class Song {
	    private String title; //encapsulation - class properties are private and can be
	    					  //accessed only by public methods
	    private double duration;
	    //parameterized constructor
	    public Song(String title, double duration) {
	        this.title = title;
	        this.duration = duration;
	    }
	    //default constructor
	    public Song(){ 

	    }
	    //getter methods
	    public String getTitle() {
	        return title;
	    }

	    public double getDuration() {
	        return duration;
	    }
	    //object class method 
	    //to convert the object into human readable string
	    
	    @Override
	    public String toString() {
	        return "Song{" +
	                "title='" + title + '\'' +
	                ", duration=" + duration +
	                '}';
	    }
}

