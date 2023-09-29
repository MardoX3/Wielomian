import java.util.Scanner;
import static java.lang.Math.pow;
public class Main {
    public static void main(String[] args) {
        System.out.println("Wielomian");//a
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj stopień wielomianu");
        int arraySize = scanner.nextInt();
        double x;
        double[] degree = new double[arraySize+1];
        for (int i = 0; i < arraySize+1; i++) {
            System.out.println("wpisz element");
            degree[i] = scanner.nextInt();
        }
        System.out.println("Wpisz pierwiastek");
        x = scanner.nextDouble();
        boolean check = isRoot(x,degree);
        if(check == true){
            System.out.println("pierwiastek "+x+" się zeruje");
        }
        else System.out.println("pierwiastek "+x+" sie nie zeruje");
    }

    public static boolean isRoot(double root, double[] arrayElement) {
        double result = 0;
        int sizeArray = arrayElement.length;
        for (int i = 0; i < sizeArray; i++) {
            result += arrayElement[i] * pow(root, sizeArray - i - 1);
        }
        if (result == 0) {
            return true;
        } else return false;
    }
}