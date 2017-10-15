package homework.oop;

/**
 * Created by Владислав on 14.10.2017.
 */
public class Ruler extends Stationery {
    public Ruler(int price, String name){
        this.price = price;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){ return true;}
        if(null == obj){ return false;}
        if(getClass() != obj.getClass()){ return false;}

        Ruler ruler = (Ruler) obj;
        if(!super.equals(ruler)){ return false;}
        return true;
    }
}
