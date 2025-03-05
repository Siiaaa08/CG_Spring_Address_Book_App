package com.example.addressbookapp.servicelayer;

import com.example.addressbookapp.dto.AddressBookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookServiceLayer {
    private List<AddressBookDTO> list=new ArrayList<>();

    public ResponseEntity<AddressBookDTO> add(AddressBookDTO addressBookDTO) {
        addressBookDTO.setId((long)(list.size()+1));
        list.add(addressBookDTO);
        return ResponseEntity.ok(addressBookDTO);  // Returns JSON response
    }

    public ResponseEntity<AddressBookDTO> check(Long id){
        for(AddressBookDTO address:list){
            if(address.getId().equals(id)){
                return ResponseEntity.ok(address);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); // Proper 404 response
    }

    public ResponseEntity<AddressBookDTO> delete(Long id){
        for(AddressBookDTO address:list){
            if(address.getId().equals(id)){
                list.remove(address);
                return ResponseEntity.ok(address);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); // Proper 404 response

    }
    public ResponseEntity<List<AddressBookDTO>> all(){
        return ResponseEntity.ok(list);
    }
    public ResponseEntity<AddressBookDTO> update(Long id,AddressBookDTO addressBookDTO){
        for (AddressBookDTO address : list) {
            if (address.getId().equals(id)) {
                address.setName(addressBookDTO.getName());
                address.setPhone(addressBookDTO.getPhone());
                address.setEmail(addressBookDTO.getEmail());
                return ResponseEntity.ok(address);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
}
