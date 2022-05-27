/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cortedehaste;

import java.util.Arrays;

/**
 *
 * @author Jhonny
 */
public class CorteDeHaste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int barraDeFerro[] = {500, 99, 1000, 1000, 19, 10};

        System.out.println("Corte de Barras: " + Cortes.corteDeBarras(barraDeFerro, barraDeFerro.length));
        System.out.println("Corte de Barras Bottom-UP: " + Cortes.corteDeBarrasBottomUp(barraDeFerro, barraDeFerro.length));

    }
}
