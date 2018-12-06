package lk.ijse.dep.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    @PutMapping
    public String saveCustomer(){
        return "SaveCustomer";
    }

    @PostMapping
    public String updateCustomer(){
        return "updateCustomer";
    }

    @DeleteMapping
    public String deleteCustomer(){
        return "deleteCustomer";
    }

    @GetMapping
    public String findCustomer(){
        return "findCustomer";
    }

}
