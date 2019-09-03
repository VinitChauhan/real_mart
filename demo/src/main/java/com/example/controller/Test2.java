package com.example.controller;

public class Test2<T> {

   T x;
   T y;

   public Test2(T t,T y){
       this.x=t;
       this.y=y;
   }

   public void showType(){
       System.out.print(x.getClass());
   }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}
