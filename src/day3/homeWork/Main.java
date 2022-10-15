package day3.homeWork;

public class Main {
    public static void main(String[] args) {
        //1 sınıf 1 den fazla interface`i implement edebilir
       /*

        //Premitif Tipler
        int number1=10;
        int number2=20;
        number1=number2;
        number2=100;

        System.out.println("Sayı 1 : "+number1); //Çıktı 20

        //Referans Tipler
        int [] Numbers1 = new int []{1,2,3,4,5,6,7,8,9,10};
        int [] Numbers2 = new int []{11,12,13,14,15,16,17,18,19};

        Numbers1=Numbers2;
        Numbers2[0]=780;

        System.out.println("Sayılar 1 Dizisinin 0. Elamanı : : "+Numbers1[0]); //Çıktı 780

        */

        CreditManager creditManager = new CreditManager();
        creditManager.Calculate(4);
        creditManager.Calculate(3);
        creditManager.Save();

        Customer customer = new Customer(); //instance creation , örnek oluşturmak
        customer.setId(1);

        CustomerManager customerManager = new CustomerManager(customer,new MilitaryCreditManager());
        customerManager.Save();

        Company company = new Company();
        company.setId(2);
        company.setCompanyName("Tosun A.Ş");
        company.setTaxNumber("12221145");

        Person person = new Person();
        person.setNationalIdentity("12345678911");
        person.setName("Umut");
        person.setLastName("Tosun");

        CustomerManager customerManager2 = new CustomerManager(company,new TeacherCreditManager());
        customerManager2.Save();


    }
}
