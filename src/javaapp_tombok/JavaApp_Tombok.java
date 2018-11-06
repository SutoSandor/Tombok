/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp_tombok;

import java.util.Scanner;

public class JavaApp_Tombok
{
    static double[] valosTomb1;
    static double[] valosTomb2;
    static double[] valosTomb3;
    
    public static void main(String[] args)
    {
        valosTomb1 = Valos_tomb_feltolt(20, -100, 100);
        Valos_tomb_Kiir(valosTomb1);
        valosTomb2 = Valos_tomb_feltolt(20, -100, 100);
        Valos_tomb_Kiir(valosTomb2);
        valosTomb3 = Valos_tomb_osszead(valosTomb1, valosTomb2);
        Valos_tomb_Kiir(valosTomb3);
    }
    public static void Valos_tomb_Kiir(double[] t)
    {
        for (int i = 0; i < t.length; i++)
        {
            // double kerekitett_Valos = Math.round(t[i]*100) / 100.0;
            // System.out.println(kerekitett_Valos + ", ");
            System.out.print(kerekit(t[i], 2) + ", ");
        }
        System.out.println("");
    }
    public static double kerekit(double d, int tj)
    {
        return Math.round(d*Math.pow(10,tj)) / Math.pow(10, tj);
    }
    public static double[] Valos_tomb_feltolt(int db, int min, int max)
    {
        double [] t = new double[db];
        for (int i = 0; i < db; i++)
        {
            t[i] = Math.random() * (max-min) + min;
        }
        return t;
    }
    public static double[] Valos_tomb_osszead(double[] t1, double[] t2)
    {
        double [] t = new double[t1.length];
        for (int i = 0; i < t1.length; i++)
        {
            t[i] = t1[i] + t2[i];
        }
        return t;  
    }
    public static void Feladat2()
    {
        Scanner scann = new Scanner(System.in);
        
        int[] Tomb = new int[5];
        for (int i = 0; i < 5; i++)
        {
            // %s string "hello"
            // %d
            // %f 4.56 (float - valós szám)
            System.out.println(String.format("Kérem adja meg a %d számot: ", (i+1)));
            Tomb[i] = scann.nextInt();
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.print(Tomb[i] + ", ");
        }
        for (int i = 4; i >= 0; i--)
        {
            System.out.print(Tomb[i] + ", ");
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.print(Tomb[4-i] + ", ");
        }
        for (int i = 0; i < 5; i+=2)
        {
            System.out.print(Tomb[i] + ", ");
        }
        int index;
        do
        {
            System.out.println("\nKérem adjon meg egy 1-5 közötti számot: ");
            index = scann.nextInt();
            if (index < 1 || index > 5)
            {
                System.out.println("Hiba! Nem megfelelő szám");
            }
        }
        while (index < 1 || index > 5);
        System.out.println(String.format("A tömb %d. eleme: %d", index,Tomb[index-1]));
    }
}