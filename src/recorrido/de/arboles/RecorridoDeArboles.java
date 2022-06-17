/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recorrido.de.arboles;

import java.util.Scanner;

/**
 *
 * @author Torrev_101
 */
public class RecorridoDeArboles {
    static Nodo p=new Nodo();
    static Nodo q=new Nodo();
    static Nodo raiz=new Nodo();
    static Scanner sc=new Scanner(System.in);    
    public static void main(String[] args){
        crearArbol();
    }
    
    public static void crearArbol(){
        System.out.println("DIGITE LA RAIZ");
        p.dato=sc.nextInt();
        raiz=p;
        q=p;
        q=ramaIzquierda(q);        
        q=raiz;
        q=ramaDerecha(q);
        p=raiz;
        recorrido(p);
    }
    
    private static Nodo ramaIzquierda(Nodo n){
        System.out.println("digite valores de la izquierda");
        for(int i=0;i<2;i++){
            p=new Nodo();
            p.dato=sc.nextInt();
            n.ei=p;
            n=p;
        }
        return n;
    }
    private static Nodo ramaDerecha(Nodo n){
        System.out.println("digite valores de la derecha");
        for(int i=0;i<2;i++){
            p=new Nodo();
            p.dato=sc.nextInt();
            n.ed=p;
            n=p;
        }
        return n;
    }    
    private static void recorrido(Nodo n){
        boolean v1=true;
        Nodo anterior=new Nodo();
        while(v1==true){
            System.out.println("Cabezera: "+n.dato);            
            
            
            
        }
    }
    
    
}
class Nodo{
    Nodo ed=null;
    int dato;
    Nodo ei=null;
}