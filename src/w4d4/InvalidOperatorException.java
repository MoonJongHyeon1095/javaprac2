package w4d4;

class InvalidOperatorException extends Exception {
    public InvalidOperatorException() {
        super("유효하지 않은 연산자입니다.");
    }
}