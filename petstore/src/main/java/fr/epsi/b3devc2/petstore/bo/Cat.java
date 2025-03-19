package fr.epsi.b3devc2.petstore.bo;

import jakarta.persistence.*;

@Entity
public class Cat extends Animal {
    private String chipId;

    public Cat() {
    }

    public String getChipId() {
        return chipId;
    }

    public void setChipId(String chipId) {
        this.chipId = chipId;
    }
}

