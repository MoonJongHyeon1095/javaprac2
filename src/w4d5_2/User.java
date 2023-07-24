package w4d5_2;

//TODO: User 클래스 정의
class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    //String 클래스의 메서드를 이렇게 오버라이드 할 수 있다
    @Override
    public String toString(){
        return "User:" + username;
    }
}