import java.util.ArrayList;

public class Main {

   public static void main(String []args) {
      Vehicle v1 = new Vehicle();
      Car c1 = new Car();
      // use the Pamaterized cosntru000o0000000ctors
      Vehicle v2 = new Vehicle(3, 12, "Sonic blue");
      Car c2 = new Car(4, 12811.25, "Like blackish gray", 9, "Ford Glorbulus Glerkus");

      System.out.println(v1);
      System.out.println(v2);
      System.out.println(c1);
      System.out.println(c2);
      v1.makeNoise();
      v2.makeNoise();
      c1.makeNoise();
      c2.makeNoise();

      // Polymorphism example
      // all classes in a hierarchy can be treated as
      // instances of the top (most super) type

      Vehicle v3 = new Vehicle();
      Vehicle c3 = new Car();
      // Car bad = new Vehicle(); does notr work
      Vehicle scoot = new Scooter();
      Vehicle moto = new Motorcycle();
      Vehicle convo = new Convertible();

      // Polymorphism example: 
      // can store any subclass in a superclass-type Colection :)
      ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
      vehicleList.add(c1);
      vehicleList.add(c2);
      vehicleList.add(c3);
      vehicleList.add(v1);
      vehicleList.add(v2);
      vehicleList.add(v3);
      vehicleList.add(scoot);
      vehicleList.add(moto);
      vehicleList.add(convo);
      System.out.println(vehicleList);
   }
}
