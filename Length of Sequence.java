import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfcups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        boolean b1 = numOfcups >= 10 && numOfcups <= 20 && !weekend;
        boolean b2 = numOfcups >= 15 && numOfcups <= 25 && weekend;
        System.out.println(b1 || b2);
    }
}