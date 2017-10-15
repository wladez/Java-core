package homework.oop;

import lombok.Data;

/**
 * Created by Владислав on 14.10.2017.
 */
public abstract class Stationery implements Comparable<Stationery> {
    protected int price;
    protected String name;

    public int compareTo(Stationery o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString(){
        return getClass().getName() +
                " price - " + price +
                ", name - " + name;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) {return true;}
        if(null == obj) {return false;}
        if(getClass() != obj.getClass()){return false;}

        Stationery stationery = (Stationery) obj;
        if(price != stationery.price) {return false;}
        if(null == stationery.name){
            return (name == stationery.name);
        }
        else if(!name.equals(stationery.name)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return (int) (31 * price + ((null == name)
                ? 0 : name.hashCode()));
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
