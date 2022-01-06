public class Battle {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void startFight(Warrior w1, Warrior w2) throws InterruptedException {
        System.out.printf("%s initial health is %.2f and power is %.2f\n", w1.getName(), w1.health, w1.power);
        System.out.printf("%s initial health is %.2f and power is %.2f\n", w2.getName(), w2.health, w2.power);
        System.out.println(ANSI_BLUE + "Fight begins:" + ANSI_RESET);
        Thread.sleep(1200);
        while(w1.isAlive() && w2.isAlive()) {
            System.out.println();
            System.out.printf("%s is attacking %s\n", w1.getName(), w2.getName());
            w2.health -= w1.attack();
            w2.power -= w1.attack() * (1.0 / 8);
            w1.power += w1.attack() * (1.0 / 10);
            Thread.sleep(1000);
//            System.out.printf("%s got hit remaining health is %.2f and power left is %.2f\n", w1.getName(), w1.health, w1.power);
            if(!w1.isAlive()) {
                System.out.printf("A brutal hit!!!\n");
                break;
            };
            if(!w2.isAlive()) {
                System.out.println("A brutal hit!!!\n");
                break;
            }
            System.out.printf("%s got hit remaining health is %.2f and power left is %.2f\n", w2.getName(), w2.health, w2.power);
            Thread.sleep(500);
            System.out.println();

            System.out.printf("%s is attacking %s\n", w2.getName(), w1.getName());
            w1.health -= w2.attack();
            w1.power -= w1.attack() * (1.0 / 8);
            w2.power += w2.attack() * (1.0 / 10);
            Thread.sleep(1000);
            if(!w1.isAlive()) {
                System.out.printf("A brutal hit!!!\n");
                break;
            };
            if(!w2.isAlive()) {
                System.out.println("A brutal hit!!!\n");
                break;
            }
            System.out.printf("%s got hit remaining health is %.2f and power left is %.2f\n", w1.getName(), w1.health, w1.power);
//            System.out.printf("%s got hit remaining health is %.2f and power left is %.2f\n", w2.getName(), w2.health, w2.power);

            Thread.sleep(500);
            System.out.println();
            if(10 <= w1.health && w1.health <= 30) {
                w1.restoreHealth(100.0);
            }
//            if(10 <= w2.health && w2.health <= 30) {
//                w2.restoreHealth(100.0);
//            }
        }
        Thread.sleep(1500);

        System.out.println(ANSI_RED + "Game Over" + ANSI_RESET);
        if(w1.isAlive()) {
            System.out.printf("%s won and %s got busted !!!", w1.getName(), w2.getName());
        }
        if(w2.isAlive()) {
            System.out.printf("%s won and %s got busted !!!", w2.getName(), w1.getName());
        }
    }
}
