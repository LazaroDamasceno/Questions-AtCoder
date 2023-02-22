import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        String operation = data.nextLine();
        List<String> ops = Arrays.stream(operation.split(" ")).collect(Collectors.toList());
        int a = Integer.parseInt(ops.get(0));
        int b = Integer.parseInt(ops.get(2));
        if (ops.get(1).equals("+")) {
            System.out.println(a + b);
        } else {
            System.out.println(a - b);
        }
    }
}