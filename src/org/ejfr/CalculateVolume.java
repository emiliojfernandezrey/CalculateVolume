/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ejfr;

import java.util.ArrayList;
import org.ejfr.figure.Cube;
import org.ejfr.figure.Figure;
import org.ejfr.figure.Sphere;
import org.ejfr.figure.Tetrahedron;
import org.ejfr.utils.Utils;

/**
 *
 * @author EmilioJosé
 */
public class CalculateVolume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Sphere(1));
        list.add(new Sphere(5));
        list.add(new Cube(1));
        list.add(new Cube(5));
        list.add(new Tetrahedron(1));
        list.add(new Tetrahedron(5));
        
        for(int i=0;i<list.size();i++){
            Figure figure = (Figure) list.get(i);
            System.out.println(figure.toString());
        }
    }
    
}
