package com.yuantek.start;

import com.yuantek.api.ApiFoo;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        ServiceLoader<ApiFoo> apiFoos = ServiceLoader.load(ApiFoo.class);
        for (ApiFoo apiFoo : apiFoos) {
            apiFoo.execute();
        }
    }
}
