package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Seller {

    @Value("${seller.name}")
    private String name;
    @Value("${seller.age}")
    private int age;
    private Shop shop;

    @Autowired
    public Seller(Shop shop) {
        this.shop = shop;
    }
}
