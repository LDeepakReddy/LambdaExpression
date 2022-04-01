package com.blz.lambdaexpression;

import java.util.function.Consumer;

public  class MyConsumer implements Consumer {
    public void accept(Object value) {
        System.out.println(((Integer) value));
    }
}

