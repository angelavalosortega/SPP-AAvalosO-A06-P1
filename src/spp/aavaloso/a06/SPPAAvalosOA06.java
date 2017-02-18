/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.aavaloso.a06;
import java.util.Scanner;
/**
 *
 * @author Angel Avalos
 */
public class SPPAAvalosOA06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       suma(); 
    }
    static int nuM(){
        int num;
        Scanner kb= new Scanner(System.in);
        System.out.println("Ingrese un numero entero"); 
        num=kb.nextInt();
        return num;
}
    static void suma(){
        int sum=0;               
        while(nuM()>-1)
        {
            sum=sum+nuM();           
        }
        System.out.println("La suma de sus numeros es "+sum);
}
}
