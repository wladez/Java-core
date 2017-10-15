package homework.oop;

/**
 * Created by Владислав on 14.10.2017.
 */
public class Pencil extends Stationery {
    public Pencil(int price, String name){
        this.price = price;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){ return true;}
        if(null == obj){ return false;}
        if(getClass() != obj.getClass()){return false;}

        Pencil pencil = (Pencil) obj;
        if(!super.equals(pencil)){return false;}
        return true;
    }
}
