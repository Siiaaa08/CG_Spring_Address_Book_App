
package com.example.addressbookapp.dto;

import com.example.addressbookapp.model.AddressBookModel;
import jakarta.persistence.*;


public class AddressBookDTO {
    private Long id;
    private String name;
    private String phone;
    private String email;

    public AddressBookDTO() {}

    public AddressBookDTO(AddressBookModel contact) {
        this.id=contact.getId();
        this.name = contact.getName();
        this.phone = contact.getPhone();
        this.email = contact.getEmail();
    }
    public Long getId(){return id;}

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

}
