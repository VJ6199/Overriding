class Earth{
    void planet(){
        System.out.println("earth is a planet");
    }
}
class Europe extends Earth{
    void Continent(){
        System.out.println("Europe is a continet");
    }
}
public class Inheritance {
    public static void main(String[] args){
        Europe b = new Europe();
        b.planet();
        b.Continent();
    }
}
