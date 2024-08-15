package com.demo.singleclass.model.TablePerClass;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tpc_publisher")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Publisher {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    private String author;
}
