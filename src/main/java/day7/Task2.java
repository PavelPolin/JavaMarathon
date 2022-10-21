package day7;
import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int stamina1 = random.nextInt(Player.MAX_STAMINA - 90 + 1) + 90;
        int stamina2 = random.nextInt(Player.MAX_STAMINA - 90 + 1) + 90;
        int stamina3 = random.nextInt(Player.MAX_STAMINA - 90 + 1) + 90;
        int stamina4 = random.nextInt(Player.MAX_STAMINA - 90 + 1) + 90;
        int stamina5 = random.nextInt(Player.MAX_STAMINA - 90 + 1) + 90;
        int stamina6 = random.nextInt(Player.MAX_STAMINA - 90 + 1) + 90;
        int stamina7 = random.nextInt(Player.MAX_STAMINA - 90 + 1) + 90;
        int stamina8 = random.nextInt(Player.MAX_STAMINA - 90 + 1) + 90;


        Player p1 = new Player(stamina1);
        Player p2 = new Player(stamina2);
        Player p3 = new Player(stamina3);
        Player p4 = new Player(stamina4);
        Player p5 = new Player(stamina5);
        Player p6 = new Player(stamina6);
        while (p1.getStamina() > 0){
            p1.run(p1.getStamina());
        }
        Player.info();
        Player p7 = new Player(stamina7);
        Player.info();
        Player p8 = new Player(stamina8);
        System.out.println("Игроков на поле: " + Player.getCountPlayers());
    }
}

class Player{
    private int stamina;
    private static int countPlayers;
    static final int MAX_STAMINA = 100;
    static final int MIN_STAMINA = 0;

    Player(int stamina){
        this.stamina = stamina;
        while (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina(){
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int run(int stamina){
        this.stamina = stamina;
        this.stamina -= 1;
        if (this.stamina == MIN_STAMINA){
            countPlayers--;
        }
        return this.stamina;
    }
    public static void info(){
        if (countPlayers == 6){
            System.out.println("На поле нет свободных мест.");
        } else {
            System.out.println("Команды неполные. Свободных мест на поле: " + (6 - countPlayers));
        }
    }
}