import java.util.Arrays;

public class w3d4 {

    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] result1 = 영을채워봐(arr1);; //TODO: 함수로 계산되어야합니다.
        // System.out.println 으로 result1 출력해주세요.

        int[] arr2 = {58, 172, 746, 89};
        int[] result2 = 영을채워봐(arr2);; //TODO: 함수로 계산되어야합니다.
        // System.out.println 으로 result2 출력해주세요.

        int[] arr3 = {9, 8, 7};
        int[] result3 = 영을채워봐(arr3);; //TODO: 함수로 계산되어야합니다.
        // System.out.println 으로 result3 출력해주세요.

        int[] arr4 = {11, 22, 33, 44, 55, 66, 77, 88,99, 1111,2222,333, 4444, 2222,333, 4444 ,2222,333, 4444, 2222,333, 4444, 2222,333, 4444};
        int[] result4 = 영을채워봐(arr4);; //TODO: 함수로 계산되어야합니다.
        // System.out.println 으로 result4 출력해주세요.
    }

    /**
     * arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
     * 정수 배열 arr이 매개변수로 받고 arr에 최소한의 개수로 0을 추가한 배열을 return 하는 함수를 만들어주세요.
     * ( 단, 이때 함수는 static으로 정의해야합니다. )
     */
    public static int[] 영을채워봐(int[] arr) {
        int arrLength = arr.length;
        int 이의제곱수 = (int) Math.pow(2, Math.ceil(baseLog(arrLength, 2)));
        int 차이 = 이의제곱수 - arrLength;
        //int[] result = new int[이의제곱수];

        // 기존 배열 요소 복사
        //System.arraycopy(원본배열, 원본 배열의 복사 시작 지점, 복사할 배열, 복사할 배열의 복사 시작 지점, 복사할 요소의 개수)
        //System.arraycopy(arr, 0, result, 0, arrLength);

        int[] result = Arrays.copyOf(arr, 이의제곱수);
        System.out.println(Arrays.toString(result));
        return result;
    }

        /**
         * 밑이 base인 로그 값을 계산하는 함수
         * @param x 로그의 밑으로 사용될 숫자
         * @param base 로그의 밑
         * @return 로그 값
         */
        public static double baseLog(double x, double base) {
            return Math.log10(x) / Math.log10(base);
        }

}
