package homework.oop;

/**
 * Created by Владислав on 14.10.2017.
 */
public class Highlighter extends Stationery {
    public Highlighter(int price, String name){
        this.price = price;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){ return true;}
        if(null == obj){ return false;}
        if(getClass() != obj.getClass()){ return false;}

        Highlighter highlighter = (Highlighter) obj;
        if(!super.equals(highlighter)){ return false;}
        return true;
    }
}
