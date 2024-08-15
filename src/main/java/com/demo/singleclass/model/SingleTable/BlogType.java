package com.demo.singleclass.model.SingleTable;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "sc_blog")
@DiscriminatorValue(value = "BLOGTYPE")
public class BlogType extends Publisher {

    private String title;
    private String description;
}
