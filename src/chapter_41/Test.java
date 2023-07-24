package chapter_41;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Customer customer = new Customer("나철수");
        VIPCustomer vipCustomer = new VIPCustomer("나관중");
        Customer customer2 = new Customer("나영희");


        customer.printMyInfo();
        vipCustomer.printMyInfo();
        customer2.printMyInfo();


        //heap test
        while(true){
            Thread.sleep(100);
        }
    }

}
