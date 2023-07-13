public class 다이아찍기 {
    public static void main(String[] args) {
        printDiamond(5);

    }


    private static void printDiamond(int size){
        int maxLength = size*2 -1;
        int 중간지점 = maxLength/2;

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < Math.abs(중간지점 - i); j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < maxLength - Math.abs(중간지점 - i) * 2; k++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
