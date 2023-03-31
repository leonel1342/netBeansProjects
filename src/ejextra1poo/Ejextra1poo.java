/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejextra1poo;

import entidades.Cancion;


public class Ejextra1poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Cancion c= new Cancion();
        
        c.setAutor("cacho");
        System.out.println("el autor es "+ c.getAutor());
    }

}
