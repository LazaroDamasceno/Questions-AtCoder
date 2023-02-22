import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int input = data.nextInt();
        System.out.println(input < 1200 ? "ABC" : "ARC");
    }
}
