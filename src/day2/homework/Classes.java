package day2.homework;

public class Classes {
    public static void main(String[] args) {
        //Reference type
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager=customerManager2;

        customerManager.add();
        customerManager.remove();
        customerManager.update();


        //Value type
        int number=10;
        int number2=20;
        number2=number;
        number=30;
        System.out.println(number2);

        //diziler referans tiptir!
        int []numbers=new int []{1,2,3};
        int []numbers2=new int []{12,23,36};
        numbers2=numbers;
        numbers[0]=10;
        System.out.println(numbers2[0]);
    }
}
