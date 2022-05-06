package main;
public class TestBox2 {
   public static void main(String[] args) {
       Box2 b1 = new Box2<Integer>(15);
       System.out.println("Giá trị: "+ b1.getValue());
       Box2 b2 = new Box2<String>("Hello TITV!");
       System.out.println("Giá trị: "+ b2.getValue());
       Box2 b3 = new Box2<Double>(15.5);
       System.out.println("Giá trị: "+ b3.getValue());
   }
}