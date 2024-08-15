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
@Entity(name = "sc_book")
@DiscriminatorValue(value = "BOOK")
public class Book extends Publisher {

    private int pages;
}
