import java.util.Scanner;
import java.util.ArrayList;


import disc.*;
import media.*;
import order.*;
import utils.*;

public class Aims {
    

    //************************** Menu ***************************
    public static void showMenu() {
        System.out.println("\nOrder Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
      
    public static void main(String[] args) {
        
        //**************************************** Variables ****************************************

        
        Thread thread = new Thread(new MemoryDaemon());
        thread.setDaemon(true);
        thread.start();


        Order anOrder = new Order(); 
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2= new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        int op1 = 1;
        int op2 = 1;
        int op3;

        //**************************************** Data ****************************************

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(1, "Weathering with you", "Animation", "AAA", 15, 15.54f);    
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(2, "Penhouse", "Drama", "BBB", 56,56.45f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc(3, "My neighbor: Totoro", "Animation", "CCC", 18, 66.15f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc(4, "Naruto", "Animation", "DDD", 68, 89.35f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc(5, "Fast and Slowly", "Action", "EEE", 45, 45.06f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc(6, "My neighbor: Sasuke", "Animation", "FFF", 19, 36.85f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc(7, "My neighbor: Naruto", "Animation", "GGG", 28, 69.55f);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc(8, "My neighbor: Sakura", "Animation", "HHH", 74, 153.15f);
        
        ArrayList<String> authorsList1 = new ArrayList<String>();
        ArrayList<String> authorsList2 = new ArrayList<String>();
        ArrayList<String> authorsList3 = new ArrayList<String>();
        ArrayList<String> authorsList4 = new ArrayList<String>(); 

        authorsList1.add("Tony buoi sang");
        authorsList2.add("Tony buoi trua");
        authorsList2.add("Tony buoi chieu");
        authorsList3.add("Tony buoi toi");
        authorsList3.add("Tony buoi chang vang");
        authorsList3.add("Tony buoi hoang hon");
        authorsList4.add("Tony buổi binh minh");
        authorsList4.add("Tony buoi xe chieu");

        ArrayList<Track> trackList1 = new ArrayList<Track>();
        ArrayList<Track> trackList2 = new ArrayList<Track>();


        trackList1.add(new Track("Thu do Cypher", 15));
        trackList1.add(new Track("Rap cham thoi", 19));
        trackList1.add(new Track("Tan gai 707", 22));
        trackList2.add(new Track("Con mua ngang qua", 31));
        trackList2.add(new Track("Nang am xa dan", 17));

        Book b1 = new Book(9, "Tren duong bang", "SelfHelp", 159.55f, authorsList1);
        Book b2 = new Book(10, "Tren duong cao toc", "Racer", 194.54f, authorsList2);
        Book b3 = new Book(11, "Tren duong toan o ga", "The traffic of Vietnam", 114.54f, authorsList3);
        Book b4 = new Book(12, "Tren duong dan sinh", "The traffic hack", 56.54f, authorsList4);

        CompactDisc cd1 = new CompactDisc(13, "Hip Hop never die", "Hip Hop", "Trong dep trai", "Low G ft MCK", 0, 99.05f, trackList1);
        CompactDisc cd2 = new CompactDisc(14, "Son Tung M-TP", "Underground", "Trong dep trai", "Nguyen Son Tung", 0, 19.25f, trackList2);

        Media arrMediaList[] = {dvd2, dvd3, dvd4, dvd5, dvd6, dvd7, dvd8, dvd9, cd1, cd2, b1, b2, b3, b4};
        DigitalVideoDisc arrDvdList[] = {dvd2, dvd3, dvd4, dvd5, dvd6, dvd7, dvd8, dvd9};
        CompactDisc arrCdList[] = {cd1, cd2};
        Book arrBookList[] = {b1, b2, b3, b4};
        
        //***********************************************************
        
        

        while (op1 != 0) {
            showMenu();            
            op1 = scanner1.nextInt();
            switch (op1) {
                case 1:                                   
                    anOrder.addOrdered();
                    if (anOrder.getNbOrdered() >= 0 && anOrder.getNbOrdered() <= 3) {                       
                        if (anOrder.getNbOrdered()>1) {
                            anOrder.removeOrdered();
                            anOrder.printList();
                            anOrder.addOrdered();
                            anOrder.clearMediaList();
                            System.out.println("Your new order are ready!");
                            System.out.println("Your number of Ordered is " + anOrder.getNbOrdered());
                        }
                        else {
                            System.out.println("Your ordered are ready!");                            
                        }
                        
                    }
                    else {
                        System.out.println("You are reached limited number order, do you want to quit?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        op3 = scanner2.nextInt();
                        switch (op3) {
                            case 1:
                                anOrder.removeOrdered();
                                anOrder.printList();
                                anOrder.addOrdered();
                                System.out.println("Limited ordered!!!");
                                op1 = 0;
                                break;
                            default:                               
                                anOrder.removeOrdered();
                                break;
                        }
                        
                        
                    }
                    break;           
                case 2:
                    int count = 0;
                    if (anOrder.getNbOrdered() == 0) {
                        System.out.println("You have no Ordered! Choose 1 on Menu to creat an Ordered!");
                    }
                    else {                        
                        while (op2 != 0) {
                            System.out.println("Choose type: ");
                            System.out.println("1. Book");
                            System.out.println("2. Digital Video Disc");
                            System.out.println("3. Compact Disc");
                            System.out.println("0. Exit");
                            System.out.println("You choose: ");
                            
                            op2 = scanner3.nextInt();

                            switch (op2) {
                                case 1:
                                    System.out.println("Input name of Book:");
                                    String nameBook = scanner2.nextLine();
                                    System.out.println("\n");
                                    for(Media mediaCheck : arrMediaList) {
                                    if (nameBook.equals(mediaCheck.getTitle())) {
                                        anOrder.addMedia(mediaCheck);
                                        count++;
                                    }
                                    }
                                    if (count == 0) {
                                    System.out.println("Not exist Media!!!");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Input name of DVD:");
                                    String nameDVD = scanner2.nextLine();
                                    System.out.println("\n");
                                    for(Media mediaCheck : arrMediaList) {
                                        if (nameDVD.equals(mediaCheck.getTitle())) {
                                            anOrder.addMedia(mediaCheck);
                                            count++;
                                        }
                                    }
                                    if (count == 0) {
                                    System.out.println("Not exist Media!!!");
                                    }
                                    break;
                                
                                case 3:
                                    System.out.println("Input name of CD:");
                                    String nameCD = scanner2.nextLine();
                                    System.out.println("\n");                             
                                    for(CompactDisc cdCheck : arrCdList) {
                                        if (nameCD.equals(cdCheck.getTitle())) {
                                            anOrder.addCompact(cdCheck);                                            
                                            count++;
                                        }
                                    }                                                               
                                    if (count == 0) {
                                    System.out.println("Not exist Media!!!");
                                    }
                                    else {
                                        System.out.println("Before completed, do you want to play track?");
                                        System.out.println("1. Yes");
                                        System.out.println("2. No");
                                        op3 = scanner4.nextInt();
                                        if (op3 == 1) {
                                            for(CompactDisc cdCheck : arrCdList) {
                                                if (nameCD.equals(cdCheck.getTitle())) {
                                                    cdCheck.playTrack();
                                                }
                                            }
                                        }
                                    }
                                    break;                                    
                                default:
                                    break;
                            }

                        }
                    }
                    break;

                case 3:
                    int choose;
                    if (anOrder.getNbOrdered() == 0) {
                        System.out.println("You have no Ordered! Choose 1 on Menu to create an Ordered!");
                    }
                    else {
                        if (anOrder.countItemOrdered() == 0) {
                            System.out.println("You had no item ordered!!! Choose 2 on Menu to add an Ordered!");
                        }
                        else {
                            anOrder.printList();
                            System.out.println("Choose items want to remove!!!");
                            choose = scanner2.nextInt();
                            anOrder.removeMediaBuyNumber(choose);
                            System.out.println("Remove successfully!");
                            
                        }
                    }
                    break;
                case 4:
                    if (anOrder.getNbOrdered() == 0) {
                        System.out.println("You have no Ordered! Choose 1 on Menu to create an Ordered!");
                    }
                    else {
                    anOrder.printList();
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
