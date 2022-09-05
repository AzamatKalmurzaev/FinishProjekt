package company;

public enum Gender {
    MAN ("Man"),
    WOMAN ("Girl");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
