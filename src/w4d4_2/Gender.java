package w4d4_2;

public enum Gender {
    MALE("male"),
    FEMALE("female");

    private String genderName;

    Gender(String genderName) {
        this.genderName = genderName;
    }
}