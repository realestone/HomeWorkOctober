package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankEmployeeTest {

    BankEmployee employee = new BankEmployee();
    Customer customer1 = new Customer();

    int amount = 1001;


    @Test
    public void testAddMoneyToAccountValidAmount() {
        employee.addMoneyToAccount(customer1, 1100);
        assertEquals(1000, customer1.getBankBalance());
    }
    }



