package com.study.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservitionTarget {
    public List<Observer> observerList = new ArrayList<Observer>();//注册到目标上的观察者

    public void register(Observer observer){
        observerList.add(observer);
    }

    public void remove(Observer observer){
        observerList.remove(observer);
    }

    public void excute(){
        if(observerList.size()>0){
            for(Observer o : observerList){
                o.action();
            }
        }
    }

}
