import java.util.Scanner;
import java.util.ArrayList;

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
        //************************** Data ***************************
        Order anOrder = new Order(); 
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2= new Scanner(System.in);
        int op = 1;

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Weathering with you", "Animation", 15.54f);    
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Penhouse", "Drama", 56.45f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("My neighbor: Totoro", "Animation", 66.15f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Naruto", "Animation", 89.35f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Fast and Slowly", "Action", 45.06f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("My neighbor: Sasuke", "Animation", 36.85f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("My neighbor: Naruto", "Animation", 69.55f);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("My neighbor: Sakura", "Animation", 153.15f);
        
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

        Book b1 = new Book("Tren duong bang", "Selfhelp", 159.55f, authorsList1);
        Book b2 = new Book("Tren duong cao toc", "Racer", 194.54f, authorsList2);
        Book b3 = new Book("Tren đuong toan o ga", "The traffic of Vietnam", 114.54f, authorsList3);
        Book b4 = new Book("Tren duong dan sinh", "The traffic hack", 56.54f, authorsList4);

        Media arrMediaList[] = {dvd2, dvd3, dvd4, dvd5, dvd6, dvd7, dvd8, dvd9, b1, b2, b3, b4};
        //***********************************************************
        
        while (op != 0) {
            showMenu();            
            op = scanner1.nextInt();
            switch (op) {
                case 1:                                   
                    anOrder.addOrdered();
                    if (anOrder.getNbOrdered() != 0 && anOrder.getNbOrdered() <=3) {
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
                        System.out.println("Limited number of Ordered!!!");
                    }
                    break;           
                case 2:
                    int count = 0;
                    if (anOrder.getNbOrdered() == 0) {
                        System.out.println("You have no Ordered! Choose 1 on Menu to creat an Ordered!");
                    }
                    else {
                        System.out.println("Input name of media:");
                        String nameMedia = scanner2.nextLine();
                        System.out.println("\n");
                        for(Media mediaCheck : arrMediaList) {
                            if (nameMedia.equals(mediaCheck.getTitle())) {
                                anOrder.addMedia(mediaCheck);
                                count++;
                            }
                        }
                        if (count == 0) {
                            System.out.println("Not exist Media!!!");
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
