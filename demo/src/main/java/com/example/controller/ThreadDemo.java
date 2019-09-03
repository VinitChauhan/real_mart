package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ThreadDemo extends Thread {

    List list = new ArrayList();

    public void test() {

        ArrayList lst = (ArrayList) list.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
    }

}

