package order;

import utils.*;
import disc.DigitalVideoDisc;

import java.util.Scanner;


public class Order {
    
    Scanner scanner = new Scanner(System.in);
    int qtyOrdered;
    private static int nbOrdered = 1;
    public static final int MAX_NUMBER_ORDERED = 5;
    public static final int MAX_LIMITTED_ORDERED = 3;

    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    public MyDate dateOrdered = new MyDate(); //Today

    public boolean addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (this.qtyOrdered == MAX_NUMBER_ORDERED) {
            System.out.println("Full, insert failed! The item quantity has reached its limit!" + "\nCan not insert this DVD: " + disc.getTitle());
            return false;
        }
        else {
            this.itemsOrdered[qtyOrdered] = disc;
            this.qtyOrdered += 1;
            return true;
        }
    }
    

    public int getQtyOrdered() {
        return getQtyOrdered();
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
    
    public void resetQtyOrdered() {
        this.qtyOrdered = 0;
    }

    public static int getNbOrdered() {
        return nbOrdered;
    }

    public static void resetNbOrdered() {
        Order.nbOrdered = 1;
    }
    //Week 4

    public void addDigitalVideoDisc(DigitalVideoDisc[] discList) {
        int i = 1; 
        for(DigitalVideoDisc dc: discList) {
            if (!addDigitalVideoDisc(dc)) {
                break;
            }
            System.out.println(i + ". DVD - " + dc.getTitle() + " - " + dc.getCategory() + " - " + dc.getDirector()+ " - " + dc.getLength() + dc.getCost());
            i++;            
        }
    }

    

    public void addDigitalVideoDisc(DigitalVideoDisc d1, DigitalVideoDisc d2) {
        addDigitalVideoDisc(d1);
        addDigitalVideoDisc(d2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                qtyOrdered--;
                System.out.println("Successfully remove this DVD: " + disc.getTitle() + ", total disc: " + qtyOrdered);
            }
        }
    }

    public DigitalVideoDisc getALuckyItem(DigitalVideoDisc[] discList) {
        DigitalVideoDisc disc = new DigitalVideoDisc();
        int i = (int) Math.random()*10;
        disc = discList[i];
        return disc;
    }

    public void addArrDigitalVideoDisc(DigitalVideoDisc[] discList) {
        String dateInput;
        
        if (this.nbOrdered <= MAX_LIMITTED_ORDERED) {
            DigitalVideoDisc discLucky = new DigitalVideoDisc();
            
            System.out.println("\n" + "Nhap thoi gian mua hang: ");
            dateInput = scanner.nextLine();
            MyDate d = new MyDate(dateInput);
            System.out.println("*********** ORDERED " + nbOrdered + " ***********");
            
            System.out.println("Time order: ");
            System.out.print(d.getDayValue());
            System.out.print("/" + d.getMonthValue());
            System.out.print("/" + d.getYearValue() + "\n\n");
            
            addDigitalVideoDisc(discList);
            discLucky = getALuckyItem(discList);
            double totalCost = totalCost();
            totalCost = totalCost - discLucky.getCost();
            System.out.println("Total cost: " + totalCost);
            nbOrdered++;
            resetQtyOrdered();
        }
        else {
            System.out.println("\nLimited order per day!!! You can not order more!!");
        }
     }

    public float totalCost() {
        float totalCost = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            totalCost += itemsOrdered[i].getCost();
        }
        return totalCost;
    }
}
