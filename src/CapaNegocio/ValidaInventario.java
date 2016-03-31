/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;
import CapaDatos.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author NAYO
 */
public class ValidaInventario {
    
    public void valida_insertar(Inventario a){
       Pattern pat = Pattern.compile("[a-zA-Z]{3,10}");
     Matcher mat = pat.matcher("sdsdsdd");
     if (mat.matches()) {
         System.out.println("SI");
     } else {
         System.out.println("NO");
     }
      Crud_Inventario inventario= new Crud_Inventario();
      inventario.Insertar_inventario(a);
    }
    public void valida_actualizar(){}
    public void valida_consultar(){}
    
    
}
