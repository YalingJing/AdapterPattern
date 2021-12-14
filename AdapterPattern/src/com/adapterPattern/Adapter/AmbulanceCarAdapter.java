package com.adapterPattern.Adapter;

import com.adapterPattern.Adaptee.AmbulanceLamp;
import com.adapterPattern.Adaptee.AmbulanceSound;
import com.adapterPattern.Target.CarController;

public class AmbulanceCarAdapter extends CarController {
    AmbulanceLamp ambulanceLamp;
    AmbulanceSound ambulanceSound;

    public AmbulanceCarAdapter(){
        ambulanceLamp = new AmbulanceLamp();
        ambulanceSound = new AmbulanceSound();
    }
    @Override
    public void makeSound() {
        ambulanceSound.sounding();
    }

    @Override
    public void lightFlashes() {
        ambulanceLamp.lighting();
    }
}
