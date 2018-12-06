package lk.ijse.dep.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("items")
public class ItemController {

    @PutMapping
    public String saveItem(){
        return "SaveItem";
    }

    @PostMapping
    public String updateItem(){
        return "updateItem";
    }

    @DeleteMapping
    public String deleteItem(){
        return "deleteItem";
    }

    @GetMapping
    public String findItem(){
        return "findItem";
    }    
    
}
