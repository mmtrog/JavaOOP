import java.util.Scanner;

import media.*;

public class DiskTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        DigitalVideoDisc unknown = new DigitalVideoDisc();


        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Avenger: Endgame");
        dvd1.setCategory("Fiction");
        dvd1.setCost(23.54f);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Weathering with you", "Animation", 15.54f);    
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Penhouse", "Drama", 56.45f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("My neighbor: Totoro", "Animation", 66.15f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Naruto", "Animation", 89.35f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Fast and Slowly", "Action", 45.06f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("My neighbor: Sasuke", "Animation", 36.85f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("My neighbor: Naruto", "Animation", 69.55f);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("My neighbor: Sakura", "Animation", 153.15f);

        DigitalVideoDisc[] all = {dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, dvd7, dvd8, dvd9};
        
        System.out.print("Type the word you want to search: ");
        String input = sc.nextLine();
        
        System.out.println("Search result: ");
        
        if (count == 0) {
            System.out.println("Does not exist!");
        }
    }
}
