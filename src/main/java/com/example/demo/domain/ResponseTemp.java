package com.example.demo.domain;

public class ResponseTemp {
    private int code;
    private int scores;

    private Object message;

    public ResponseTemp(int i, int v, Object o) {
        code = i;
        scores = v;
        message = o;
    }
}
