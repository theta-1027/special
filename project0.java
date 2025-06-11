package basicPrograms;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class project0 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many players will be playing");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.print("enter player name");
            String name = sc.nextLine();
            names.add(name);
        }
        System.out.println("The players are:");
        for (String name : names) {
            System.out.println(name);
        }
        int six = 0;
        Random random = new Random();
        String currentPlayer = names.get(random.nextInt(names.size()));
        System.out.println("\n " + currentPlayer + " will start the game!");
        while (true) {
            System.out.println("\n" + currentPlayer + " is rolling 3 dice...");

            int die1 = random.nextInt(1, 7);
            int die2 = random.nextInt(1, 7);
            int die3 = random.nextInt(1, 7);

            System.out.println("Rolled: " + die1 + ", " + die2 + ", " + die3);

            int roundSixes = 0;
            if (die1 == 6) roundSixes++;
            if (die2 == 6) roundSixes++;
            if (die3 == 6) roundSixes++;

            six += roundSixes;

            System.out.println(currentPlayer + " got " + roundSixes + " six(es) this round.");
            System.out.println("Total sixes so far: " + six);

            if (six >= 3) {
                System.out.println("\n🎉 " + currentPlayer + " wins the game with 3 sixes!");
                break;
            }

            if (roundSixes == 0) {
                // no six, change player
                String newPlayer;
                do {
                    newPlayer = names.get(random.nextInt(names.size()));
                } while (newPlayer.equals(currentPlayer));
                currentPlayer = newPlayer;
                System.out.println("No sixes! Changing turn to " + currentPlayer);
            sc.close();
            }
        }
    }
}