public class multilevel {
    public static void main(String[] args){
        France b = new France();
        b.Planet1();
        b.Continent();
        b.Country();
    }
}
class Earth1{
    void Planet1() {
        System.out.println("Earth1 is a planet");
    }
}
class Europe1 extends Earth1 {
    void Continent(){
        System.out.println("Europe1 is a continent");
    }
}
    class France extends Europe1{
        void Country(){
            System.out.println("France is a country");
        }
    }
