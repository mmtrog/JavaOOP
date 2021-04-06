package disc;

import media.*;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{

    private String artist;
    ArrayList<Track> trackList = new ArrayList<>();
    
    public CompactDisc (String title, String category, String director, String artist,int length, float cost) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (trackList.contains(track)) {
            System.out.println("Track exist!");
        }
        else {         
            trackList.add(track);
            System.out.println("Add track successfully!");
            System.out.println(track.getTitle() + "###" + track.getLength());
        }
    }

    public void removeTrack(Track track) {
        if (trackList.contains(track)) {
            trackList.remove(track);
            System.out.println("Remove track successfully!");
            System.out.println(track.getTitle() + "###" + track.getLength());
        }
        else {
            System.out.println("Track not exist!");
        }
    }
    
    @Override
    public int getLength() {
        for(Track trackTest : trackList) {
            length += trackTest.getLength();
        }
        return length;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + this.title + " ### " + this.category + " ### " + this.director + " ### " + getArtist());
        System.out.println("Total CD length: " + this.getLength());
        for(Track trackTest : trackList) {
            trackTest.play();
        }
    }
}