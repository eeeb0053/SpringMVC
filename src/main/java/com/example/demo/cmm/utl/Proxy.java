package com.example.demo.cmm.utl;

import java.util.function.BiPredicate;
import java.util.function.Consumer;

import org.springframework.stereotype.Component;

@Component("px")
public class Proxy {
    public void print(String s){
        Consumer<String> c = System.out::println;
        c.accept(s);
    }
    public boolean equals(String t, String u){
        BiPredicate<String, String> f = String::equals;
        return f.test(t, u);
    }
}

