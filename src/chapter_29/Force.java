package chapter_29;

public class Force {
    private String side;
    private long midichlorianQuantity;
    private boolean havingApprentice;

    void mayTheForceBeWithYou(){
        this.havingApprentice = true;
    }

    public Force(String side, long midichlorianQuantity) {
        this.side = side;
        this.midichlorianQuantity = midichlorianQuantity;
        havingApprentice = false;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public long getMidichlorianQuantity() {
        return midichlorianQuantity;
    }

    public void setMidichlorianQuantity(long midichlorianQuantity) {
        this.midichlorianQuantity = midichlorianQuantity;
    }

    public boolean isHavingApprentice() {
        return havingApprentice;
    }

    public void setHavingApprentice(boolean havingApprentice) {
        this.havingApprentice = havingApprentice;
    }
}
