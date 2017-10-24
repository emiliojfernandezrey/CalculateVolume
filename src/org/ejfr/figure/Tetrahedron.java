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
public class Tetrahedron extends Figure{
    private int edge;
    private double volume=-1;
    
    public Tetrahedron(int edge){
        this.edge=edge;
    }  
    
    private double calculateVolume(double edge){
        double aux = Math.sqrt(2)/12.0 * Math.pow(edge, 3.0);
        return aux;
    }
    
    public double getVolume(){
        if(this.volume==-1){
            this.volume=this.calculateVolume(this.edge);
        }
        return this.volume;
    }
    
    @Override
    public String toString(){
        return "A regular tetrahedron with edge "+this.edge +" has volume " + Utils.getRound2Decimals(this.getVolume());
    }
    
}
