public class ChuncheonTicket3 {
    public static void main(String[] args) {
        String aliceNationality = "미국";
        int aliceAge = 70;

        String kimNationality = "한국";
        int kimAge = 65;

        String yooNationality = "한국";
        int yooAge = 42;

        boolean aliceDiscount = 할인여부(aliceNationality, aliceAge);
        boolean kimDiscount = 할인여부(kimNationality, kimAge);
        boolean yooDiscount = 할인여부(yooNationality, yooAge);

        System.out.println("Alice의 반값 적용 여부: " + aliceDiscount);
        System.out.println("Kim의 반값 적용 여부: " + kimDiscount);
        System.out.println("Yoo의 반값 적용 여부: " + yooDiscount);
    }

    private static boolean 할인여부(String nationality, int age) {
        return (nationality.equals("한국") && age >= 65);
    }
}
