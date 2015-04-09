
import ClsCliente.ClsCliente;
import cliente.cliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alumno05
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       cliente v = new  cliente();
     ClsCliente cv= new  ClsCliente();
        
         v.setApellido("Cordova Rodriguez");
        v.setNombre("Fatima");
        v.setDNI("78524952");
        
        System.out.println(v.getNombre()+" "+ v.getApellido()+" "+v.getDNI()+":"+cv.comprar());
    }
    
}
