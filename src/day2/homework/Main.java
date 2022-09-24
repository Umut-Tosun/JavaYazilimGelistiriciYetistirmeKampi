package day2.homework;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        ProductManager productManager = new ProductManager();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("HP");
        product.setPrice(9899);
        product.setStockAmount(120);
        System.out.println(product.getName());
        productManager.add(product);

        Product product1 = new Product(1,"Masa","Düz Masa",250,0);


        Customer customer = new Customer();
        customer.firstName="Umut";
        System.out.println(customer.firstName);

        Employee employee = new Employee();
        employee.email="tosun.umutt@gmail.com";
        System.out.println(employee.email);

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.add();

        CustomerManager customerManager = new CustomerManager();
        customerManager.update();

    }
}
