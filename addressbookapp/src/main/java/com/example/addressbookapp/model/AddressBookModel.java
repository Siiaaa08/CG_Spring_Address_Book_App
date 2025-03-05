
package com.example.addressbookapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "addressdata")
public class AddressBookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String phone;
    private String email;

    public AddressBookModel(){

    }
    public AddressBookModel(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }


}
