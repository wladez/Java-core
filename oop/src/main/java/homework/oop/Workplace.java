package homework.oop;

import lombok.AllArgsConstructor;

import java.util.ArrayList;

/**
 * Created by Владислав on 14.10.2017.
 */
public class Workplace {
    public ArrayList<Stationery> stationeryList;

    public Workplace(){
        stationeryList = new ArrayList<Stationery>();
    }

    public void addStationery(Stationery stationery){
        stationeryList.add(stationery);
    }

    public int getSummaryPrice(){
        int result = 0;
        for (Stationery a: stationeryList) {
            result += a.getPrice();
        }
        return result;
    }
}
