package lk.ijse.dep.controller;

import lk.ijse.dep.dto.CustomerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.Map;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

//    @GetMapping
//    public String findCustomers(@RequestParam(value = "action", required = false) String action,
//                                @RequestParam(value = "q", required = false) String query) {
//        if (action != null) {
//            switch (action) {
//                case "search":
//                    return "Find customers with " + query;
//                case "count":
//                    return "Customers count";
//                default:
//                    return "Find All Customers";
//            }
//        }else{
//            return "Find All Customers";
//        }
////        return "";
//    }

//    @GetMapping("/{id}")
//    public String findCustomer(CustomerDTO dto){
//        System.out.println(dto);
//        return "Find Customer";
//    }

//    @GetMapping
//    public String findAllCustomers() {
//        return "Find All Customers";
//    }
//
//    @GetMapping(params = {"action=search", "q"})
//    public String findCustomersByName(@RequestParam("q") String query) {
//        return "Find Customers By Name : " + query;
//    }

    @GetMapping(params = {"action=count"})
    public int customersCount(){
        return 10;
    }


//    @GetMapping("/{id}")
//    public String findCustomerById(@PathVariable("id") String customerId) {
//        return "Find the customer : " + customerId + " ; ";
//    }

//    @GetMapping(value = "/{id}/{name}")
//    public String findCustomerByIdAndName(@PathVariable("id") String customerId,@PathVariable("name") String customerName){
//        return "Find the customer : " + customerId + " ; " + customerName;
//    }

//    @DeleteMapping(value = "/{id}")
//    public String deleteCustomerById( @RequestParam MultiValueMap<String,String> params1,
//            @RequestBody MultiValueMap<String,String> params2) {
//        System.out.println(params1);
//        System.out.println(params2);
//        return "Delete the customer : ";
//    }

    @DeleteMapping(value = "/{id}")
    public String deleteCustomerById(Reader reader){
        BufferedReader br = new BufferedReader(reader);
        br.lines().forEach(System.out::println);
        return "JSON will Work ?";
    }

//    @PutMapping(value = "/{id}")
//    public String saveCustomer(@PathVariable("id") String customerId
////                               @RequestParam("id") String id,
////                               @RequestParam("name") String name,
////                               @RequestParam("address") String address,
////                               @RequestParam Map<String, String> params) {
////                               @RequestParam MultiValueMap<String, String> params)
//    ) {
////        System.out.println(id);
////        System.out.println(name);
////        System.out.println(address);
////        System.out.println("===========================");
////        System.out.println(params);
////        List<String> address = params.get("address");
////        System.out.println(address);
//
////        System.out.println(dto);
//
//        return "Save the customer : " + customerId + " ; ";
//    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{id}")
    public void saveCustomer(@RequestBody  CustomerDTO dto){
        System.out.println(dto);
    }

//    @PostMapping(value = "/{id}")
//    public String updateCustomer(@PathVariable("id") String customerId,
////                                 @RequestParam("id") String id,
////                                 @RequestParam("name") String name,
////                                 @RequestParam("address") String address ) {
////                                 @RequestParam Map<String, String> params ) {
//                                 @ModelAttribute CustomerDTO dto) {
//        System.out.println("========== This is POST =============");
//        System.out.println(dto);
//        return "Update the customer : " + customerId + " ; ";
//    }

    @PostMapping(value = "/{id}")
    public String updateCustomer(@RequestBody CustomerDTO dto){
        System.out.println(dto);
        return "POST REQUEST";
    }

//    @GetMapping(value = "/{name}")
//    public String findCustomersByName(@PathVariable("name") String customerName){
//        return "Find the customer by name : " + customerName + " ; ";
//    }


}
