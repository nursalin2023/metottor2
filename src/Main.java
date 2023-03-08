import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        increase();
    }
    public static void increase (){
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j+ " * " +i +" = "+ i*j+ "\t\t");
            }
            System.out.println();
        }
    }
}