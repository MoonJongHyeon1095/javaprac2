package chapter_34;

public class VIPCustomer extends Customer{

    static int serialNums = 1; //주의! static 변수는 상속X
    private String agentID;
    private double discountRatio;

    @Override
    public int calculatePrice(int price){
        this.bonusPoint += price * bonusPointRatio;
        price -= price*discountRatio;
        return price;
    }

    public void callAgent(){
        System.out.println("담당직원: " + this.agentID);
    }

    public VIPCustomer(String name){
        //super(); 얘가 생략되어 있기 때문에, default 생성자가 부모 클래스에 있어야 한다.
        this.customerID = "VIP" + serialNums++;
        this.name = name;
        this.customerGrade = "VIP";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.05;
        this.discountRatio = 0.1;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    @Override
    void printMyInfo(){
        System.out.print("VIP"); //ln 없이 바로 붙이기
      super.printMyInfo();
    }
}
