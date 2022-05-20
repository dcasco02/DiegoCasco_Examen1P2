/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocasco_examen1p2;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dcasc
 */
public class DiegoCasco_Examen1P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <PCs> pc=new ArrayList();
        Scanner lea=new Scanner (System.in);
        int opcion=300;
        while(opcion!=0){
            JOptionPane.showInputDialog("0-Salida\n"
                    + "1-CRUD PC\n"
                    + "2-Ingresar a pc");
            if(opcion==1){
                int opcion2=6;
                while(opcion!=0){
                    JOptionPane.showInputDialog("0-Salida\n"
                            + "1-Agregar Desktop\n"
                            + "2-Agregar Laptop\n"
                            + "3-Listar PCs\n"
                            + "4-Eliminar PCs");
                    if(opcion2==1){
                        System.out.println("Ingrese la capacidad ram de la desktop: ");
                        int ram=lea.nextInt();
                        System.out.println("Ingrese la candidad de almacenamiento de la desktop: ");
                        int capalma=lea.nextInt();
                        /*System.out.println("Ingrese el tipo del almacenamiento (SSD o HDD): ");
                        String 
                        System.out.println("Ingrese si tiene targeta Grafica: (True o False)");
                        */System.out.println("Ingrese la dirreccion ip: ");
                        String ip=lea.next();
                        lea.nextLine();
                        System.out.println("Ingrese la mascara red: ");
                        String mascara=lea.next();
                        lea.nextLine();
                        System.out.println("Ingrese el hostname: ");
                        String hostname=lea.next();
                        lea.nextLine();
                        pc.add(new PC_Escritorio(ram, capalma, true, true, ip, mascara, hostname));
                    }if(opcion2==2){
                        System.out.println("Ingrese la marca de la laptop: ");
                        String marca=lea.next();
                        lea.nextLine();
                        System.out.println("Ingrese la definicion de la pantalla: ");
                        String def=lea.next();
                        lea.nextLine();
                        System.out.println("Ingrese la direccion ip: ");
                        String dirip=lea.next();
                        lea.nextLine();
                        System.out.println("Ingrese la mascara red: ");
                        String mascared=lea.next();
                        lea.nextLine();
                        System.out.println("Ingrese el Hostname: ");
                        String host=lea.next();
                        lea.nextLine();
                        pc.add(new Laptop(marca, def, true, dirip, mascared, host));
                    }if(opcion2==3){
                        for (PCs pCs : pc) {
                            System.out.println(pc);   
                    }
                    }if(opcion==4){
                        System.out.println("Ingrese la posicion a eliminar: ");
                        int pos=lea.nextInt();
                        pc.remove(pos);
                    }       
                }
            }if(opcion==2){
                System.out.println("Ingrese la posicion de la pc: ");
                int pos=lea.nextInt();
                System.out.print(pc.get(pos).getHostname()+"# ");
                String comand=lea.next();
                if(comand!="exit"){
                    
                }
                if(comand=="show"){
                    System.out.println(pc.get(pos).getDireccionip());
                    System.out.println(pc.get(pos).getMascarared());
                }if(comand=="ping"){
                    
                }
            }
        }
    }
    
}
