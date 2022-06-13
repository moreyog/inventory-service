package com.mycompany.inventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    @GetMapping("/item")
    public String getItem(){
        System.out.println("Item found");
        return "Item 1000";
    }

}
