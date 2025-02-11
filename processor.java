package OOP;
import java.util.Scanner;
import java.util.ArrayList;
public class processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter model for car: ");
        String model1 = sc.nextLine();
        System.out.print("Enter year for car: ");
        int year1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter model for car: ");
        String model2 = sc.nextLine();
        System.out.print("Enter year for car: ");
        int year2 = sc.nextInt();
        car myCar1 = new car(model1, year1);
        car myCar2 = new car(model2, year2);
        ArrayList <car> Cars = new ArrayList<>();
        Cars.add(myCar1);
        Cars.add(myCar2);
        
        myCar1.displayDetail();
        myCar2.displayDetail();
    }

}
