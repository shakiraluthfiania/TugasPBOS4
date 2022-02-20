/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspbo;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {
    static double NilaiAwal;
    static int pilih;
    
    public static void main(String[] args) {
        konversi suhu = new konversi();
        double celcius ,Fahrenheith, Reamor, Kelvin;
        boolean kondisi = false;
        Scanner input = new Scanner(System.in);
        
        System.out.println("|-------------------------|");
        System.out.println("+Program Konversi Suhu Air+");
        System.out.println("|-------------------------|");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Masukkan suhu celcius = ");
        NilaiAwal = input.nextDouble();
        
        while(kondisi!=true){                        
            System.out.println("\nOpsi");
            System.out.println("-----");
            System.out.println("1. Lihat");
            System.out.println("2. Edit");
            System.out.println("3. Exit");
            System.out.print("Pilih = ");
            pilih = input.nextInt();
            
            switch(pilih){
                case 1://check perhitungan
                    if(NilaiAwal<=0){
                        Fahrenheith = suhu.konversi_Fahrenheith();
                        Reamor = suhu.konversi_Reamor();
                        Kelvin = suhu.konversi_Kelvin();

                        System.out.println("Celcius = "+NilaiAwal+" C");
                        System.out.println("Fahrenheit = "+Fahrenheith+" F");
                        System.out.println("Reamor = "+Reamor+" R");
                        System.out.println("Kelvin = "+Kelvin+" K");
                        System.out.println("Kondisi air membeku");
                    }
                    else if(NilaiAwal<100){
                        Fahrenheith = suhu.konversi_Fahrenheith();
                        Reamor = suhu.konversi_Reamor();
                        Kelvin = suhu.konversi_Kelvin();

                        System.out.println("Celcius = "+NilaiAwal+" C");
                        System.out.println("Fahrenheit = "+Fahrenheith+" F");
                        System.out.println("Ream0r = "+Reamor+" R");
                        System.out.println("Kelvin = "+Kelvin+" K");
                        System.out.println("Kondisi air Normal");
                    }
                    else if(NilaiAwal>=100){
                        Fahrenheith = suhu.konversi_Fahrenheith();
                        Reamor = suhu.konversi_Reamor();
                        Kelvin = suhu.konversi_Kelvin();

                        System.out.println("Celcius = "+NilaiAwal+" C");
                        System.out.println("Fahrenheit = "+Fahrenheith+" F");
                        System.out.println("Reamor = "+Reamor+" R");
                        System.out.println("Kelvin = "+Kelvin+" K");
                        System.out.println("Kondisi air mendidih");
                    }
                    break;
                case 2://edit
                    System.out.println("\nInput Data Baru");
                    System.out.println("----------");
                    System.out.print("Masukkan suhu celcius = ");
                    NilaiAwal = input.nextDouble();
                    break;
                case 3://exit
                    kondisi=true;                    
            }
        }
    }
}