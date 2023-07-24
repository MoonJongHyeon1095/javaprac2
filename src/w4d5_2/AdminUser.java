package w4d5_2;

//TODO: AdminUser 클래스 정의
class AdminUser extends User {
    public AdminUser(String username) {
        super(username);
    }

    @Override
    public String toString() {
        return "AdminUser: " + getUsername();
    }
}