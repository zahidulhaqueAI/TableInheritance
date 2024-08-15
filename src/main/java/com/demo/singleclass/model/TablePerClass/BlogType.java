package com.demo.singleclass.model.TablePerClass;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tpc_blog")

public class BlogType extends Publisher {

    private String title;
    private String description;
}
