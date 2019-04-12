package jp.co.navitime.j04.p03;

public class Name {

    private String firstName;
    private String familyName;

    public Name(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() { return familyName; }
}
