package basicPrograms;
import java.util.ArrayList;
import java.util.Scanner;
public class arraylists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.println("how many names do you wanna enter");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.print("enter name");
            String name = sc.nextLine();
            names.add(name);
        }
        System.out.println("You entered:");
        for (String name : names) {
            System.out.print(name);
        }
        sc.close();
    }
}
