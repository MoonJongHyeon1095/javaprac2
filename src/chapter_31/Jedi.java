package chapter_31;

public class Jedi {
    private String side; // "Light", "Dark"
    private boolean havingApprentice;
    private String trainingStartDate;
    private String trainingEndDate;
    String rank;

    void lightSaber(String color) {
        System.out.printf("광선검색 %S\n", color);
    }

    void duel(Jedi otherJedi){
        System.out.println("다른 제다이와 결투를 벌입니다.");
    }

    void sleep(){};

    String myInfo(){
        return String.format("제다이(side=%s, havingApprentice=%s, rank=%s)\n",
                this.side, this.havingApprentice, this.rank);
    }

    void printInfo(){
        System.out.println(myInfo());
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setHavingApprentice(boolean havingApprentice) {
        this.havingApprentice = havingApprentice;
    }

    public void setTrainingStartDate(String trainingStartDate) {
        this.trainingStartDate = trainingStartDate;
    }

    public void setTrainingEndDate(String trainingEndDate) {
        this.trainingEndDate = trainingEndDate;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
