import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;
import java.util.Iterator;

import disc.*;
import media.*;
import order.*;
import utils.*;

public class Test
{
    
    public static void main(String[] args) {
        ArrayList<Track> trackList1 = new ArrayList<Track>();
        ArrayList<Track> trackList2 = new ArrayList<Track>();

        Disc disc1 = new Disc(1, "Son Tung M-TP", "Underground", "Trong dep trai", 12 ,19.25f);

        DigitalVideoDisc dvd = new DigitalVideoDisc(2, "Hip Hop never die", "Hip Hop", "Trong dep trai", 36, 25.20f);

        trackList1.add(new Track("Thu do Cypher", 15));
        trackList1.add(new Track("Rap cham thoi", 19));
        trackList1.add(new Track("Tan gai 707", 22));
        trackList2.add(new Track("Con mua ngang qua", 31));
        trackList2.add(new Track("Nang am xa dan", 17));
        
        CompactDisc cd1 = new CompactDisc(3, "Hip Hop never die", "Hip Hop", "Trong dep trai", "Low G ft MCK", 15, 99.05f, trackList1);
        CompactDisc cd2 = new CompactDisc(4, "Son Tung M-TP", "Underground", "Trong dep trai", "Nguyen Son Tung", 13, 19.25f, trackList2);

        Collection collection = new ArrayList<>();
        collection.add(disc1);
        collection.add(dvd);
        collection.add(cd1);
        collection.add(cd2);

        Iterator iterator = collection.iterator();

        System.out.println("Cha hieu cai cc gi!!!");

        System.out.println(cd1.compareTo(disc1));
        
        while (iterator.hasNext()) {
            System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
        }

        //Collections.sort((List)collection);
    }    
}