package Day2;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        //set value
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("bilmemne.jpg");

        //get value
        // System.out.println(product1.name);

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6700);
        product2.setDiscount(8);
        product2.setUnitsInStock(2);
        product2.setImageUrl("bilmemne2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitsInStock(4);
        product3.setImageUrl("bilmemne3.jpg");

        Product[] products = {product1, product2, product3};

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
            System.out.println("<li>" + product.getDiscount() + "</li>");
            System.out.println("<li>" + product.getUnitPrice() + "</li>");
            System.out.println("<li>" + product.getUnitsInStock() + "</li>");
            System.out.println("<li>" + product.getImageUrl() + "</li>");

        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("257");
        individualCustomer.setPhone("05539898071");
        individualCustomer.setFirstName("umut");
        individualCustomer.setLastName("tosun");

        CorporateCustomer corporateCustomer = new CorporateCustomer();

        corporateCustomer.setId(1);
        corporateCustomer.setCompanyName("Tosun Holding");
        corporateCustomer.setPhone("444 5 678");
        corporateCustomer.setTaxNumber("1234323223");
        corporateCustomer.setCustomerNumber("5600");

        Customer[]customers={individualCustomer,corporateCustomer};

        for (Customer customer:customers) {
            System.out.println(customer.getCustomerNumber());
        }
    }
}
