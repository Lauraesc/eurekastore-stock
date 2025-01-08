package com.traininglaura.stock.adapters.driven.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "brand") //nombre que se le va a dar en MySQL
public class BrandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    @Column(name = "name", nullable = false, unique = true, length = 50)
    private String name;
    @Column(name = "description", nullable = false, length = 90)
    private String description;
}
