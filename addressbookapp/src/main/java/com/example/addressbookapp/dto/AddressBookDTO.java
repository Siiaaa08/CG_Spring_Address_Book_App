
package com.example.addressbookapp.dto;

import com.example.addressbookapp.model.AddressBookModel;
import jakarta.persistence.*;
import lombok.Data;

@Data
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




}
