package chapter_41;

public class Customer {
    static int serialNums = 1;

    protected String customerID;
    protected String name;
    protected String customerGrade;

    protected int bonusPoint;
    protected double bonusPointRatio;

    public int calculatePrice(int price){
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }

    Customer(){}

    Customer(String name) {
        this.name = name;
        this.customerID = "Customer" + serialNums++;
        this.customerGrade = "SILVER";
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    void printMyInfo(){
        System.out.printf("Customer(customerId=%s, name=%s, customerGrade=%s)\n",
                this.customerID, this.name, this.customerGrade);
    }
}
