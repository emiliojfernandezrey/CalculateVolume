/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ejfr.utils;

/**
 *
 * @author EmilioJosé
 */
public class Utils {
    
    public static final double PI_KEY = 3.14159265358979323846;
    
    public static double getRound2Decimals(double number){
        return Math.round(number*100.0)/100.0;
    }
    
    public static int getRoundWithoutDecimals(Double number){
        return number.intValue();
    }
    
}
