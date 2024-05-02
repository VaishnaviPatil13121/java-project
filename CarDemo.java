// Engine class
class Engine {
    public void start() {
        System.out.println("Engine is starting.");
    }

    public void stop() {
        System.out.println("Engine is stopping.");
    }
}

// Tyre class
class Tyre {
    private int pressure;

    public Tyre(int pressure) {
        this.pressure = pressure;
    }

    public void inflate() {
        System.out.println("Tyre pressure is inflated to " + pressure + " PSI.");
    }
}

// Door class
class Door {
    public void open() {
        System.out.println("Door is opening.");
    }

    public void close() {
        System.out.println("Door is closing.");
    }
}

// Car class using Engine, Tyre, and Door
class Car {
    private Engine engine;
    private Tyre[] tyres;
    private Door[] doors;

    public Car(Engine engine, Tyre[] tyres, Door[] doors) {
        this.engine = engine;
        this.tyres = tyres;
        this.doors = doors;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void inflateTyres() {
        for (Tyre tyre : tyres) {
            tyre.inflate();
        }
    }

    public void openDoors() {
        for (Door door : doors) {
            door.open();
        }
    }

    public void closeDoors() {
        for (Door door : doors) {
            door.close();
        }
    }
}

public class CarDemo {
    public static void main(String[] args) {
        // Create components
        Engine carEngine = new Engine();
        Tyre[] carTyres = { new Tyre(32), new Tyre(32), new Tyre(32), new Tyre(32) };
        Door[] carDoors = { new Door(), new Door(), new Door(), new Door() };

        // Create a car with the components
        Car myCar = new Car(carEngine, carTyres, carDoors);

        // Demonstrate functionality
        myCar.start();
        myCar.inflateTyres();
        myCar.openDoors();
        myCar.closeDoors();
        myCar.stop();
    }
}