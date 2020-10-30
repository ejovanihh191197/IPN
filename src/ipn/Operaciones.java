/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipn;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Operaciones {
    private ArrayList<Participante> participantes = new ArrayList();
    
    public int menu(){
        int opElejida;
        Scanner opcion = new Scanner(System.in);
        
        System.out.println("******** Bienvenido ********");
        System.out.println("¿Que desea realizar?");
        System.out.println("1.- Ingresar participante");
        System.out.println("2.- Ver participantes");
        System.out.println("3.- Total de cuotas");
        System.out.println("4.- Salir");
        opElejida = opcion.nextInt();
        return opElejida;
    }
    
    public void main(){
        int opcion;
        do{
            opcion = menu();
            switch(opcion){
                case 1:
                    Participante p = new Participante();
                    p = crearParticipante();
                    if ( p != null){
                        System.out.println("Datos registrados...");
                        System.out.println(p);
                        participantes.add(p);
                    }
                break;
                case 2:
                    verParticipantes();
                break;
                case 3:
                    totalRecaudado();
                break;
                case 4:
                    System.out.println("Hasta luego!!");
                break;
                default:
                    System.out.println("Opcion no valida, intente de nuevo");
                break;
            }
        }while(opcion != 4);
    }
    
    public Participante crearParticipante(){
        Participante participante = new Participante();
        String curp;
        String nombre;
        char procedencia;
        double desProcedencia;
        double total;
        Scanner opcion = new Scanner(System.in);
        System.out.println("Ingrese el Nombre del participante");
        nombre = opcion.nextLine();
        System.out.println("Ingrese el CURP del participante");
        curp = opcion.nextLine().toUpperCase();
        if( curp.equals("0")){
            return null;
        }
        do{
            System.out.println("Ingrese la procedencia del participante");
            procedencia = opcion.next().charAt(0);
            desProcedencia = descuento(procedencia);
        }while(desProcedencia == 0);
        total = 15000 - desProcedencia;
        participante.setNombre(nombre);
        participante.setCURP(curp);
        participante.setProcedencia(procedencia);
        participante.setDescuento(desProcedencia);
        participante.setCuotaFinal(total);
        return participante;
    }
    
    public double descuento( char procedencia){
        double descuento = 0;
        switch(procedencia){
            case 'A':
                descuento = 15000 * 0.50;
            break;
            case 'D':
                descuento = 15000 * 0.20;
            break;
            case 'P':
                descuento = 15000 * 0.10;
            break;
            default:
                System.out.println("La procedencia no es correcta");
            break;
        }
        return descuento;
    }
    
    public void totalRecaudado(){
        double total = 0;
        for (int i = 0; i < participantes.size(); i++) {
            total = total + participantes.get(i).getCuotaFinal();
        }
        System.out.println("No. de articipantes: " + participantes.size() + " Total recaudado: " + total);
    }
    
    public void verParticipantes(){
        if(participantes.size() == 0){
            System.out.println("No hay participantes registrados");
        }else{
            for (int i = 0; i < participantes.size() ;i++) {
                System.out.println(participantes.get(i));
            }
        }
    }
}
