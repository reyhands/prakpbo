/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BalokDanKerucut;

import java.util.Scanner;

/**
 *
 * @author Reyhan
 */
public class Main
    {
        
         public static void main(String[] args)
        {
            Scanner input1 = new Scanner(System.in);
            Scanner input2 = new Scanner(System.in);

            double temp,temp1,temp2;int exit=0;
        do{   
            System.out.println("INPUT\n");
            System.out.println("1.Balok\n2.Kerucut\n3.Exit\nPilih : ");
                switch(input1.nextInt())
                {
                    case 1:
                    {
                        System.out.println("\nPanjang : ");
                            temp = input2.nextDouble();
                        System.out.println("\nLebar   : ");
                            temp1 = input2.nextDouble();
                        System.out.println("\nTinggi  : ");
                            temp2 = input2.nextDouble();
                           
                        PersegiPanjang bidang1 = new PersegiPanjang(temp,temp1);
                        Balok ruang1           = new Balok(temp,temp1,temp2);
                        
                        System.out.println("\nLuas Persegi  : " + bidang1.hitungluas() + "\n"    );
                        System.out.println("Keliling Persegi : " + bidang1.hitungkeliling() + "\n");
                        System.out.println("Volume Balok     : " + ruang1.hitungvolume() + "\n "  );
                        System.out.println("Luas Permukaan   : " + ruang1.hitungpermukaan() + "\n ");
                  
                    }
                    break;
                    case 2:
                      {
                        System.out.println("\nJari Jari   : ");
                            temp1 = input2.nextDouble();
                        System.out.println("\nTinggi  : ");
                            temp2 = input2.nextDouble();
                           
                       Lingkaran bidang2 = new Lingkaran(temp1);
                       Kerucut   ruang2  = new Kerucut  (temp1,temp2);
                       
                       System.out.println("\nLuas Lingkaran       :  " + bidang2.hitungluas());
                       System.out.println("\nKeliling Lingkaran   :  " + bidang2.hitungkeliling());
                       System.out.println("\nVolume Kerucut       :  " + ruang2.hitungvolume());
                       System.out.println("\nLuas Permukaan Kerucut :  " + ruang2.hitungpermukaan());
                        }
                      break;
                       case 3:
                       {exit=1;}
                       break;
                   }

                }
               
        while(exit==0);
                          
                        
        }
    }
