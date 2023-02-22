import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int[] candies = new int[3];
        candies[0] = data.nextInt();
        candies[1] = data.nextInt();
        candies[2] = data.nextInt();
        Arrays.sort(candies);
        if (candies[0] + candies[1] == candies[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}