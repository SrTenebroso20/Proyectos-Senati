package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		System.out.print("Ingrese cantidad: ");
		float cantidad = sc.nextFloat();

		System.out.print("Ingrese precio: ");
		float precio = sc.nextFloat();
		
		float importe_s = cantidad * precio;
		float importe_d = importe_s / 3.24f;
		float importe_e = importe_s / 3.75f;
		
		System.out.println("\n========= Resultados ==========");
		System.out.println("Importe en soles....: " + df.format(importe_s));
		System.out.println("Importe en d�lares..: " + df.format(importe_d));
		System.out.println("Importe en euros....: " + df.format(importe_e));
	}

}
