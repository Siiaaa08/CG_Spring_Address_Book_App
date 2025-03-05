
package com.example.addressbookapp.servicelayer;

import com.example.addressbookapp.dto.AddressBookDTO;
import com.example.addressbookapp.model.AddressBookModel;
import com.example.addressbookapp.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AddressBookServiceLayer {
    private List<AddressBookDTO> list=new ArrayList<>();
    @Autowired
    private AddressRepository addressRepository;
    public ResponseEntity<AddressBookDTO> add(AddressBookDTO addressBookDTO) {
        addressBookDTO.setId((long)(list.size()+1));
        list.add(addressBookDTO);
        AddressBookModel model = new AddressBookModel(addressBookDTO.getName(), addressBookDTO.getPhone(), addressBookDTO.getEmail());
        AddressBookModel savedModel = addressRepository.save(model);
        AddressBookDTO responseDTO = new AddressBookDTO( savedModel);
        return ResponseEntity.ok(responseDTO);
    }

    public Optional<AddressBookModel> check(Long id){
        Optional<AddressBookModel> answer=addressRepository.findById(id);
        return answer;
    }

    public ResponseEntity<String> delete(Long id){
        if (addressRepository.existsById(id)) {
            addressRepository.deleteById(id);
            return ResponseEntity.ok("Contact deleted successfully");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Contact not found");

    }
    public ResponseEntity<List<AddressBookModel>> all(){
        return ResponseEntity.ok(addressRepository.findAll());
    }
    public ResponseEntity<AddressBookDTO> update(Long id,AddressBookDTO addressBookDTO){
        if(addressRepository.existsById(id)){
            AddressBookModel model = new AddressBookModel(addressBookDTO.getName(), addressBookDTO.getPhone(), addressBookDTO.getEmail());
            model.setId(id);
            AddressBookModel updated=addressRepository.save(model);
            AddressBookDTO addressBookDTO1=new AddressBookDTO(updated);
            return ResponseEntity.ok(addressBookDTO1);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
}
