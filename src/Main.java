import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        student std1 = new student("Aynaz" , "meymanat"  , "4023142" );
        student std2 = new student ( "sahar" , "mohamadi" , "12345678" );

        std1.setGrade("19.2");
        std2.setGrade("-1");

        std1.PrintStudentInfo();
        std2.PrintStudentInfo();


    }
}

