package com.adapterPattern.Client;

import com.adapterPattern.Target.CarController;

public class client_test {
    public static void main(String[] args){
        CarController car;
        car = (CarController) XMLUtil.getBean();
        car.move();
        car.makeSound();
        car.lightFlashes();
    }
}
