/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ejfr.figure;

import org.ejfr.utils.Utils;

/**
 *
 * @author EmilioJosé
 */
public class Sphere extends Figure{
    
    private int radius;
    private double volume=-1;
    
    public Sphere(int radio){
        this.radius = radio;
    }
    
    public int getRadio(){
        return this.radius;
    }
    
    public double getVolume(){
        if(this.volume==-1){
            this.volume= this.calculateVolume((double) this.radius);
        }
        return volume;
    }
    
    private double calculateVolume(double radius){
        double aux = 4.0/3.0;
        double power = Math.pow(radius, 3.0);
        return aux * Utils.PI_KEY * power;
    }
    
    @Override
    public String toString(){
        return "A sphere of radius "+this.radius+" has volume "+Utils.getRound2Decimals(this.getVolume());
    }
}
