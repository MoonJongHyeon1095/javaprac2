package chapter_41;

public class Staff {
    private int salesAmout;

    public int helpPayment(Customer customer, int price){
        return customer.calculatePrice(price);
    }

    public int helpPayment(VIPCustomer customer, int price){
        return customer.calculatePrice(price);
    }

    public void addSalesAmount(int cash){
        salesAmout += cash;
    }

    public void printMySalesAmount(){
        System.out.println("오늘의 최종매상은" + this.salesAmout);
    }
}
