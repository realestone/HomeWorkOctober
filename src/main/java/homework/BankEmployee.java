package homework;

public class BankEmployee {
   private String name;
   private String lastname;

    public BankEmployee(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public BankEmployee() {
    }

    void addMoneyToAccount(Customer customer, int amount) {
        if (amount <= 1000 && amount > 0) {
            double sum = customer.getBankBalance() + amount;
            customer.setBankBalance(sum);
            System.out.println(amount + " Was added to your bank balance");
            System.out.println("Your current bank balance is: " + sum);
        } else if (amount >= 1000){
            customer.setBankBalance(customer.getBankBalance());
            System.out.println("Your entered amount was over the limit");
            System.out.println("Your current bank balance is: " + customer.getBankBalance());
        } else {
            System.out.println("You cant add less than zero");
            System.out.println("Your current bank balance is: " + customer.getBankBalance());
        }

    }

        double withdrawMoneyFromTheAccount (Customer customer, int amount) {
        if(amount >= customer.getBankBalance()){
            System.out.println("You dont have that amount of money in your bank balance");
            System.out.println("Your current bank balance is: " + customer.getBankBalance());
        } else {
            double sum = customer.getBankBalance() - amount;
            System.out.println("You have withdrawed: "+ amount +", your current balance is: "+sum);
        } return customer.getBankBalance();
    }

    void transferMoney(Customer customer1, Customer customer2, int amount) {
        if (amount < customer1.getBankBalance()) {
            double payeer = customer1.getBankBalance() - amount;
            double receiver = customer2.getBankBalance() + amount;
            customer2.setBankBalance(receiver);
            customer1.setBankBalance(payeer);
            System.out.println("Andrew sent you " + amount);
            System.out.println("Your bank balance now is: " + receiver);
        } else if (amount <= 0) {
            System.out.println("You cant sent less than zero, try again");
        }else if (customer1.getAmount() > customer1.getBankBalance()){
        System.out.println("You cant sent more than you have");
    }
}

}
