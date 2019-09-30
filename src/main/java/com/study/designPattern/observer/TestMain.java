package com.study.designPattern.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestMain {
    public static void main(String[] args) throws IOException {
        ObservitionTarget start = new ObservitionTarget();

        while(true){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String buf = br.readLine();
            if(buf.length()>5){
               Observer observerA = new ObserverA();
               start.register(observerA);

            }else{
                Observer observerB = new ObserverB();
                start.register(observerB);
            }
            start.excute();
        }

    }
}
