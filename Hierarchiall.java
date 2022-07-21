public class Hierarchiall {
    public static void main(String[] args){
        Africa b = new Africa();
        b.Continent1();
        b.Planet();
        Asia a = new Asia();
        a.Continent();
        a.Planet();
    }
}
class Earth2{
    void Planet() {
        System.out.println("Earth1 is a planet");
    }
}
class Asia extends Earth2 {
    void Continent(){
        System.out.println("Asia is a continent");
    }
}
class Africa extends Earth2{
    void Continent1(){
        System.out.println("Africa is a continent");
    }
}


