package com.yuantek.api.impl;

import com.yuantek.api.ApiFoo;

public class ApiFooImpl02 implements ApiFoo {

    public void execute() {
        System.out.println(this.getClass().getSimpleName() + " is called !");
    }
}
