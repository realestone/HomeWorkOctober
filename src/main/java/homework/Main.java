package homework;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Andrew", 17000, 2500);

        Customer customer2 = new Customer("John", 5000, 5000);

        BankEmployee employee = new BankEmployee("Valentina", "Lewinski");

        employee.transferMoney(customer1, customer2, 500);
        employee.addMoneyToAccount(customer2, 900);












    }
}
