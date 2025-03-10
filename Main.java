public class Main {

   public static void main(String []args) {
      Vehicle v1 = new Vehicle();
      Car c1 = new Car();
      // use the Pamaterized cosntru000o0000000ctors
      Vehicle v2 = new Vehicle(3, 12, "Sonic blue");
      Car c2 = new Car(4, 1280.0, "Like blackish gray", 9, "Ford Glorbulus Glerkus");

      System.out.println(v1);
      System.out.println(v2);
      System.out.println(c1);
      System.out.println(c2);
      v1.makeNoise();
      v2.makeNoise();
      c1.makeNoise();
      c2.makeNoise();

   }
}
