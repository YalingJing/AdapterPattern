package com.adapterPattern.Adapter;

import com.adapterPattern.Adaptee.PoliceLamp;
import com.adapterPattern.Adaptee.PoliceSound;
import com.adapterPattern.Target.CarController;

public class PoliceCarAdapter extends CarController {
    private PoliceSound sound;
    private PoliceLamp lamp;

    public PoliceCarAdapter(){
        sound = new PoliceSound();
        lamp = new PoliceLamp();
    }
    @Override
    public void makeSound() {
        sound.alarmSound();
    }

    @Override
    public void lightFlashes() {
        lamp.alarmLamp();
    }
}
