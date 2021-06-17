/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 *
 * @author Alin
 */
public class POOP5 {
    
    public static void main(String[] args){
        Circulo circulo1 = new Circulo(0);
        System.out.println("radio circulo= "+circulo1.getRadio());
        
        Circulo circulo2 = new Circulo();
        System.out.println(circulo2);
        circulo2.setRadio(2);
        System.out.println(circulo2);
        circulo2.setRadio(-10);
        System.out.println(circulo2);
    
    // Ejercicio 2
        System.out.println("################ E2 ################");
        
        Persona per1 = new Persona();
        Fecha fnac = new Fecha();
        
        per1.setNombre("Raul");
        per1.setApellido("Hernandez");
        fnac.setDia(10);
        fnac.setMes(6);
        fnac.setAnio(2000);
        per1.setfNacimiento(fnac);
        
        System.out.println(per1);
        
        System.out.println("Fceha de nacimiento: "+per1.getfNacimiento().getDia()+"/"+per1.getfNacimiento().getMes()+
                "/"+per1.getfNacimiento().getAnio());
        
        System.out.println("Fceha de nacimiento: "+per1.getfNacimiento());
          
    /*
        Implementar clase coche que tenga 4 personas y cada una diga en que lugar está
        *chafer
        *copiloto
        *Pasajero1
        *Pasajero 2
        *Un coche tiene una persona que tiene una fecha de nacimiento 
    */
    
        System.out.println("################ E3 ################");  
        Coche c1 = new Coche();
        Persona po1 = new Persona();
        Fecha fnac1 = new Fecha();
       
        po1.setNombre("Raul");
        po1.setApellido("Hernandez");
        c1.setLugp(1);
        fnac1.setDia(10);
        fnac1.setMes(6);
        fnac1.setAnio(2000);
        po1.setfNacimiento(fnac1);
        c1.setPer(po1);
        System.out.println(" "+po1+"\nSe ubica en el puesto: "+c1.getLugp()+": "+c1.miLugp()+"\n");
        
        Coche c2 = new Coche();
        Persona po2 = new Persona();
        Fecha fnac2 = new Fecha();
       
        po2.setNombre("Karen");
        po2.setApellido("Garduño");
        c2.setLugp(2);
        fnac2.setDia(23);
        fnac2.setMes(3);
        fnac2.setAnio(1985);
        po2.setfNacimiento(fnac2);
        c2.setPer(po2);
        System.out.println(" "+po2+"\nSe ubica en el puesto: "+c2.getLugp()+": "+c2.miLugp()+"\n");
        
        Coche c3 = new Coche();
        Persona po3 = new Persona();
        Fecha fnac3 = new Fecha();
        
        po3.setNombre("Ruby");
        po3.setApellido("Sanchez");
        c3.setLugp(3);
        fnac3.setDia(10);
        fnac3.setMes(2);
        fnac3.setAnio(2003);
        po3.setfNacimiento(fnac3);
        c3.setPer(po3);
        System.out.println(" "+po3+"\nSe ubica en el puesto: "+c3.getLugp()+": "+c3.miLugp()+"\n");
        
        Coche c4 = new Coche();
        Persona po4 = new Persona();
        Fecha fnac4 = new Fecha();
        
        po4.setNombre("Melany");
        po4.setApellido("Mondragon");
        c4.setLugp(4);
        fnac4.setDia(24);
        fnac4.setMes(2);
        fnac4.setAnio(2005);
        po4.setfNacimiento(fnac3);
        c4.setPer(po3);
        System.out.println(" "+po4+"\n Se ubica en el puesto: "+c4.getLugp()+": "+c4.miLugp()+"\n");
    
    } 
}
    
    
    

