package homework.oop;

/**
 * Created by Владислав on 14.10.2017.
 */
public class Scissors extends Stationery {
    public Scissors(int price, String name){
        this.price = price;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){ return true;}
        if(null == obj){ return false;}
        if(getClass() != obj.getClass()){ return false;}

        Scissors scissors = (Scissors) obj;
        if(!super.equals(scissors)){ return false;}
        return true;
    }
}
