package com.demo.singleclass.model.SingleTable;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "sc_publisher")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "PUBLISHER",
        discriminatorType = DiscriminatorType.STRING
)
public class Publisher {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    private String author;
}
