import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < a; i++){
            int n = in.nextInt();
            hs.add(n);
        }
        System.out.println(hs.size());
    }
}
