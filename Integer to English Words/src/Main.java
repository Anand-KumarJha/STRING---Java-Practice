import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(solution.numberToWords(a));
    }
}
