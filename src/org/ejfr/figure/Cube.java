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
public class Cube extends Figure{
    private int edge = -1;
    private double volume=-1;
    
    public Cube(int side){
        this.edge=side;
    }
    
    public int getEdge(){
        return this.edge;
    }
    
    public double getVolume(){
        if(this.volume==-1){
            this.volume = calculateVolume((double) this.edge);
        }
        return this.volume;
    }

    private double calculateVolume(double edge) {
        return (Math.pow(edge, 3.0));
    }
    
    @Override
    public String toString(){
        return "A cube of width "+ this.edge+ " has volume "+ Utils.getRoundWithoutDecimals(this.getVolume());
    }
}
