package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {



    @NotBlank(message="Required field")
    @Size(max=500, message="Please provide a shorter description length")
    private String description;

public Skill() {

};

    public String getDescription() {return description;}

    public void setDescription(String description) {
        this.description = description;
    }

}

