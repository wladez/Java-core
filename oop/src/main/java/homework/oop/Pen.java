package homework.oop;

/**
 * Created by Владислав on 12.10.2017.
 */
public class Pen extends Stationery {

    public Pen(int price, String name) {
        this.price = price;
        this.name = name;
    }

/*    public String toString(){
        return getClass().getName() +
                " price - " + price +
                ", name - " + name;
    }*/

    @Override
    public boolean equals(Object obj){
        if(this == obj) {return true;}
        if(null == obj) {return false;}
        if(getClass() != obj.getClass()){return false;}

        Pen pen = (Pen) obj;
        if(!super.equals(pen)){return false;}
        return true;
    }

/*    public int hashCode() {
        return (int) (31 * price + ((null == name)
                ? 0 : name.hashCode()));
    }*/
}
