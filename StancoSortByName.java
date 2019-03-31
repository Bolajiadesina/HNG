 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stancouniv;

import java.util.Comparator;

/**
 *
 * @author ACER PC
 */
public class StancoSortByName implements Comparator <StancoUni> { 

    @Override
    public int compare(StancoUni s1, StancoUni s2) {
         return s1.getName ().compareTo(s2.getName());
    }
    
    
    
}
