package com.example.addressbookapp.dto;

import com.example.addressbookapp.model.AddressBookModel;
import jakarta.persistence.*;


public class AddressBookDTO {
    private String name;
    private String phone;
    private String email;

    public AddressBookDTO() {}

    public AddressBookDTO(AddressBookModel contact) {
        this.name = contact.getName();
        this.phone = contact.getPhone();
        this.email = contact.getEmail();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

}

