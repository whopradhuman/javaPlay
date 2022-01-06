public class Fight {
    public static void main(String[] args) throws InterruptedException {
        // class
//        Warrior pikachu = new Warrior("Pikachu", 100.0, 150.0);
//        Warrior bulbasaur = new Warrior("Bulbasaur", 150.0, 90.0);

        // inheritance

        Warrior pikachu;
        Warrior bulbasaur;
        double rand = Math.random();

        if(rand < 0.5) {
            pikachu = new Evolution("Pikachu", 100.0, 100.0, true);
            System.out.printf("%s got evolved\n", pikachu.getName());
            bulbasaur = new Warrior("Bulbasaur", 100.0, 100.0);
        } else {
            pikachu = new Warrior("Pikachu", 100.0, 100.0);
            bulbasaur = new Evolution("Bulbasaur", 100.0, 100.0, true);
            System.out.printf("%s got evolved\n", bulbasaur.getName());
        }

        Battle.startFight(pikachu, bulbasaur);
//        System.out.println(pikachu.getName());
//        System.out.println(bulbasaur.getName());
    }
}