package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Seller seller = (Seller) applicationContext.getBean("seller");
        Shop shop = (Shop) applicationContext.getBean("shop");

        System.out.println(seller);
    }
}
