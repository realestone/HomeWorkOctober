package homework;

public class Customer {
    private  String name;
   private double bankBalance;

    private double salary;
    private String riskClass;

    private int amount;

    private double amountToTransfer;


    public String getName() {
        return name;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public double getSalary() {
        return salary;
    }

    public String getRiskClass() {
        return riskClass;
    }

    public int getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setRiskClass(String riskClass) {
        this.riskClass = riskClass;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getAmountToTransfer() {
        return amountToTransfer;
    }

    public void setAmountToTransfer(double amountToTransfer) {
        this.amountToTransfer = amountToTransfer;
    }


    public Customer() {
    }

    public Customer(int amount) {
        this.amount = amount;
    }

    public Customer(String name, double bankBalance, double salary) {
        this.name = name;
        this.bankBalance = bankBalance;
        this.salary = salary;

    }
}

