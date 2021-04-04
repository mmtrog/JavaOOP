import disc.*;
import order.*;
import utils.*;

public class Aims {
    public static void main(String[] args) {
        Order anOrder = new Order();
        int option = 1;

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Avenger: Endgame");
        dvd1.setCategory("Fiction");
        dvd1.setCost(23.54f);
        dvd1.setDirector("Elizabeth Olsen");
        dvd1.setLength(95);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Weathering with you", "Animation", "Hodaka Morishima", 75, 15.54f);    
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Penhouse", "Drama", "Lee Min Hoo", 155, 56.45f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("My neighbor: Totoro", "Animation", "Ghibli", 65, 66.15f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Naruto", "Animation", "Minh Trong", 563, 89.35f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Fast and Slowly", "Action", "The Rock", 12, 45.06f);

        DigitalVideoDisc animation[] = {dvd2, dvd4, dvd5};
        DigitalVideoDisc action[] = {dvd1, dvd2, dvd3, dvd4, dvd5, dvd6};
        DigitalVideoDisc listMostSell[] = {dvd4, dvd5, dvd6};


        anOrder.addArrDigitalVideoDisc(animation);
        anOrder.addArrDigitalVideoDisc(action);
        anOrder.addArrDigitalVideoDisc(listMostSell);
        anOrder.addArrDigitalVideoDisc(animation);
    }
}
