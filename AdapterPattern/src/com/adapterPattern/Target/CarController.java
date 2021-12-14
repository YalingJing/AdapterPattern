package com.adapterPattern.Target;

public abstract class CarController {
    public void move(){
        System.out.println("玩具汽车开始移动！");
    }
    public abstract void makeSound();//发出声音
    public abstract void lightFlashes();//灯光闪烁
}
