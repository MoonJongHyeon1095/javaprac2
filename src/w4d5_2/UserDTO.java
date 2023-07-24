package w4d5_2;

import java.io.Serializable;

// TODO: UserDTO 클래스 정의
class UserDTO implements Serializable {
    private String username;
    private String role;

    public UserDTO(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }
}