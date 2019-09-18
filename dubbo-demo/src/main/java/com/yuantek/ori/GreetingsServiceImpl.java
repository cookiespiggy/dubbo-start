package com.yuantek.ori;

public class GreetingsServiceImpl implements GreetingsService { // #1
    @Override
    public String sayHi(String name) {
        return "hi, " + name; // #2
    }
}
