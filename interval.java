import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        if ( v >-15 && v < 13 ) {
                System.out.println("True");
        }
        else if( v > 14 && v < 17) {
            System.out.println("True");
        }
        else if(v >= 19) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}