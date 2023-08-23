package org.pahappa.systems.pahappapricifypro.models.constants;

public enum ClientGender {
    MALE("Male"),
    FEMALE("Female");

    private String name;

    private ClientGender(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
