import java.util.Scanner;

class Car{
    Scanner sc = new Scanner(System.in);
    void getvehicleinfo(){
        String vehiclemodel = getvehiclemodel();
        System.out.println(" vehicle model is " +vehiclemodel);
        String vehiclecolor = getvehiclecolor();
        System.out.println(" vehicle color is " +vehiclecolor);
        int vehicleprice = getvehicleprice();
        System.out.println(" vehicle price is " +vehicleprice);
    }
    private int getvehicleprice(){
        System.out.println("Enter vehicle price");
        int price = sc.nextInt();
        return price;
    }
    private String getvehiclecolor(){
        String a;
        System.out.println(" enter vehicle color");
        a = sc.next();
        return a;
    }
    private String getvehiclemodel() {
        String b;
        System.out.println(" enter vehicle model");
        b = sc.next();
        return b;
    }
}
class Audi extends Car{
    void getvehicleinfo(){
        System.out.println("vehicle price is " + 2500000);
        System.out.println("vehicle color is  Black");
    }
}
public class Overriding {
    public static void main(String[] args){
        Car BMW = new Car();
        BMW.getvehicleinfo();
        Audi car = new Audi();
        car.getvehicleinfo();
    }
}
