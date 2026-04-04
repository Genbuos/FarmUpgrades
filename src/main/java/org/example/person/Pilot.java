package org.example.person;

import org.example.animal.Horse;
import org.example.farm.Field;
import org.example.interfaces.FarmVehicle;
import org.example.interfaces.Rideable;
import org.example.interfaces.Rider;
import org.example.vehicle.CropDuster;

public class Pilot extends Person implements Rider {
    private long licenseID;
    private boolean isRiding;

    public Pilot(String name, String quip, long licenseID) {
        super(name, quip);
        this.licenseID = licenseID;
    }

    public long getLicenseID() {
        return licenseID;
    }

    public void setLicenseID(long licenseID) {
        this.licenseID = licenseID;
    }

    public boolean isRiding() {
        return isRiding;
    }

    public void setRiding(boolean riding) {
        isRiding = riding;
    }

    public void fly(CropDuster plane, Field field){
        plane.fly(field);
    }

    @Override
    public void makeNoise() {
        System.out.println("Let's take the skies... This is your pilot " + this.getName());
    }

    @Override
    public void mount(Rideable object) {
        if (object instanceof FarmVehicle){
            if(object instanceof CropDuster){
                if(!object.isInUse()){
                    object.setInUse(true);
                    System.out.println("Pilot has boarded Cropduster");
                } else {
                    System.out.println("Plane is in use and cannot be mounted!");
                }
            } else if (object instanceof Horse){
                if(!object.isInUse()){
                    object.setInUse(true);
                    System.out.println("Horse is Mounted!");
                } else {
                    System.out.println("The horse cannot be mounted!");
                }
            }
        }
    }

    @Override
    public void dismount(Rideable object) {
        if (object instanceof FarmVehicle){
            if(object instanceof CropDuster){
                if(object.isInUse() ){
                    object.setInUse(false);
                    System.out.println("Pilot has dismounted Cropduster");
                } else {
                    System.out.println("Plane is not in use and can be mounted!");
                }
            } else if (object instanceof Horse){
                if(object.isInUse()){
                    object.setInUse(false);
                    System.out.println("Horse is dismounted!");
                } else {
                    System.out.println("The horse is not in use and can be mounted!");
                }
            }
        }
    }
}
