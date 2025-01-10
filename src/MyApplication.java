import models.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyApplication {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Lennon", "Musician", 27045.78);
        Employee emp2 = new Employee("George", "Harrison", "Guitarist", 50000.00);

        Student stud1 = new Student("Ringo", "Starr", 2.5);
        Student stud2 = new Student("Paul", "McCartney", 3.8);

        List<Person> payables = new ArrayList<>();
        payables.add(emp1);
        payables.add(emp2);
        payables.add(stud1);
        payables.add(stud2);

        Collections.sort(payables);
        printData(payables);
    }

    public static void printData(Iterable<Person> payables) {
        for (Payable payable : payables) {
            System.out.printf("%s earns %.2f tenge%n", payable.toString(), payable.getPaymentAmount());
        }
    }
}
