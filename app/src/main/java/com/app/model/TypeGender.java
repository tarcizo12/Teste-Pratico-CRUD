package com.app.model;

import java.util.Arrays;
import java.util.List;

public enum TypeGender {
    MALE("M"),
    FEMALE("F");

    private String gender;

    TypeGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

  
    public static TypeGender fromString(String gender) {
        for (TypeGender type : TypeGender.values()) {
            if (type.gender.equalsIgnoreCase(gender)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid gender: " + gender);
    }


    public static List<TypeGender> getAllGenders() {
        return Arrays.asList(TypeGender.values());
    }
}
