package day3.homeWork;

public class CustomerManager {
    private Customer _customer;
    private ICreditService _creditService;

    public CustomerManager(Customer customer,ICreditService creditService) {
        _customer = customer;
        _creditService=creditService;
    }

    public void Save() {
        System.out.println("Müşteri kaydedildi. ID: "+_customer.getId());
    }
    public void GiveCredict()
    {
        _creditService.Calculate();
    }
}
