//Creating Superclass
class Pokemen{
    //listing instance variables
    String type;
    int rank;

    public void setType(String type) {
        this.type = type;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getType() {
        return type;
    }

    public int getRank() {
        return rank;
    }

    //declaration of instance methods
    void attack(){
        System.out.println("Pokemon, Attacketet⚡⚡");
    }
    void Defend(){
        System.out.println("Pokemon, Defend yourself⚒️⚒️");
    }
    void sleep(){
        System.out.println("Sleeping...😴😴");
    }
    void eat(){
        System.out.println("Eating...🍴🍴");
    }
}
class Pikachu extends Pokemen{
    @Override
    void attack() {
        System.out.println("Pikachu, Thunder bolt ⚡⚡");
    }

    @Override
    void Defend() {
        System.out.println("Pikachu, Dotch and use Iron tail ⚡⚡");
    }
}
class Bulbasaur extends Pokemen{
    @Override
    void attack() {
        System.out.println("Bulbasaur, Wine wip🍃🍃");
    }

    @Override
    void Defend() {
        System.out.println("Bulbasaur, Tackle⚒️⚒️");
    }

    void getEvolve(){
        System.out.println("Bulbasaur evolved into lvyasaur🌞🌞");
    }
}
class Charizard extends Pokemen{
    boolean fly=true;
    @Override
    void attack() {
        System.out.println("Charizard, Air Slash🔥🔥");
    }

    @Override
    void Defend() {
        System.out.println("Charizard, Fire Spin💫💫");
    }
    void fly(){
        System.out.println("Charizard, Dotch and fly✈️✈️");
    }
}










public class Pokemon_Simulation {
    public static void main(String[] args) {
        Pikachu pikachu=new Pikachu();
        Charizard charizard=new Charizard();
        System.out.println("Pikachu 🆚 Charizard");

        pikachu.attack();
        charizard.fly();

        charizard.attack();
        pikachu.Defend();

        charizard.attack();
        pikachu.sleep();

        charizard.attack();
        System.out.println("Pikachu can not fight😵😵\nCharizard win the fight");


    }
}
