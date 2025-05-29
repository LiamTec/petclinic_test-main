package com.tecsup.petclinic.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity(name = "owners")
@NoArgsConstructor
@Data
public class Owners {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String first_name;
    private String last_name;
    private String address;
    private String city;
    private String telephone;

    public Owners(Integer id, String first_name, String last_name, String address, String city, String  telephone) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.telephone=telephone;

    }

    public Owners(String first_name, String last_name, String address, String city, String  telephone) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.telephone=telephone;

    }
}
