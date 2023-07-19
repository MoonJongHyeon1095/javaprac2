package chapter_29;

public class Jedi {

    public void noticeForce(String side){
        System.out.println("포스를 감지합니다 : " + side);
    }

    public Force becomeJedi(String side, long midichlorianQuantity){
        Force force = new Force(side, midichlorianQuantity);
        return force;
    }

    public void sayReady(Force force){
        String side = force.getSide();
        System.out.println("자신의 정체를 밝힙니다 :" + side);
    }
}
