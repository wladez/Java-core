package homework.oop;

/**
 * Created by Владислав on 14.10.2017.
 */
@BoatAnnotation
public class AtomicBoat {
    private String name;
    private AtomicBoatEngine boatEngine;

    public AtomicBoat(String name){
        this.name = name;
        boatEngine = new AtomicBoatEngine();
    }

    public void startBoat(){
        boatEngine.startEngine();
        System.out.println("Boat is ready to sail!");
    }

    class AtomicBoatEngine{
        public void startEngine(){
            System.out.println("Engine has started!");
        }
    }

}
