import java.util.ArrayList;
import java.util.Scanner;


import disc.*;
import media.*;
import order.*;
import utils.*;

public class Test 
{
    
    public static void main(String[] args) {
        ArrayList<Track> trackList1 = new ArrayList<Track>();
        ArrayList<Track> trackList2 = new ArrayList<Track>();


        trackList1.add(new Track("Thu do Cypher", 15));
        trackList1.add(new Track("Rap cham thoi", 19));
        trackList1.add(new Track("Tan gai 707", 22));
        trackList2.add(new Track("Con mua ngang qua", 31));
        trackList2.add(new Track("Nang am xa dan", 17));
        
        CompactDisc cd1 = new CompactDisc(1, "Hip Hop never die", "Hip Hop", "Trong dep trai", "Low G ft MCK", 0, 99.05f, trackList1);
        CompactDisc cd2 = new CompactDisc(2, "Son Tung M-TP", "Underground", "Trong dep trai", "Nguyen Son Tung", 0, 19.25f, trackList2);


    }    
}