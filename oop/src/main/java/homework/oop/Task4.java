package homework.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Владислав on 14.10.2017.
 */
class StationaryPriceComparator implements Comparator<Stationery>{

    public int compare(Stationery o1, Stationery o2) {
        int price1 = o1.getPrice();
        int price2 = o2.getPrice();
        if(price1 < price2){
            return -1;
        }else if(price1 == price2){
            return 0;
        } else {
            return 1;
        }
    }
}

class StationaryPriceNameComparator implements Comparator<Stationery>{

    public int compare(Stationery o1, Stationery o2) {
        int price1 = o1.getPrice();
        int price2 = o2.getPrice();
        if(price1 < price2){
            return -1;
        }else if(price1 == price2){
            return o1.getName().compareTo(o2.getName());
        } else {
            return 1;
        }
    }
}

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Stationery> stationeryArrayList = new ArrayList<Stationery>();
        stationeryArrayList.add(new Pen(50, "pen"));
        stationeryArrayList.add(new Highlighter(80, "highlighter"));
        stationeryArrayList.add(new Ruler(80, "ruler"));
        stationeryArrayList.add(new Pencil(30, "pencil"));
        stationeryArrayList.add(new Scissors(80, "scissors"));
        System.out.println("---- Before sorting ----");
        printList(stationeryArrayList);

        System.out.println("---- After name sorting ----");
        Collections.sort(stationeryArrayList);
        printList(stationeryArrayList);

        Comparator<Stationery> priceComparator = new StationaryPriceComparator();
        stationeryArrayList.sort(priceComparator);
        System.out.println("---- After price sorting ----");
        printList(stationeryArrayList);

        Comparator<Stationery> comparator = new StationaryPriceNameComparator();
        stationeryArrayList.sort(comparator);
        System.out.println("---- After price & name sorting ----");
        printList(stationeryArrayList);
    }

    private static void printList(ArrayList<Stationery> list){
        for (Stationery listElem: list) {
            System.out.println(listElem);
        }
    }
}
