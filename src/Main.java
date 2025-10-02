import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CarrotSalesman salesman1 = new CarrotSalesman(), salesman2 = new CarrotSalesman();
        salesman1.setName("Jan Novák");
        salesman1.setBirthDate(LocalDate.of(1999,4,2));
        salesman2.setName("Karel Dvořák");
        salesman2.setBirthDate(LocalDate.of(1985,5,4));
        System.out.println("Prodavač 1: " + salesman1.getName());
        System.out.println("Prodavač 2: " + salesman2.getName());
    }
}