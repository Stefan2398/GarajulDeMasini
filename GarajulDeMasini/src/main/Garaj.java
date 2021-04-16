package main;

import java.util.ArrayList;
import java.util.List;

import masina.Masina;

public class Garaj {

	public static void main(String[] args) {
		// shortcut: control + space autocomplete
		Masina // tipul obiectului
		mercedes // numele variabilei
				= // instantiem variabila de tip Masina cu ajutorul constructorului cu parametrii
				new Masina("Mercedes", "C220", 60000, "2022", "Black");
		Masina bmw = new Masina("BMW", "320d", 60000, "2022", "Gray");
		Masina honda = new Masina();
		honda.setPrice(20000);
		honda.setBrand("Honda");
		honda.setModel("Civic");
		honda.setColor("Red");
		honda.setYear("2019");

		List<Masina> garaj = new ArrayList<Masina>();
		garaj.add(mercedes);
		garaj.add(bmw);
		garaj.add(honda);

		Integer pretTotalGaraj = 0;
		Integer count = 1;
		Integer pretMediu = 0;
		System.out.println("Pret garaj inainte de calcul: " + pretTotalGaraj);

		// for-ul parcurge o lista
		// parcurgem variabila din lista
		for (Masina masina : garaj) {
			System.out.println("Pretul masinii" + masina.getBrand() + " este " + masina.getPrice());

			pretTotalGaraj += masina.getPrice();
			System.out.println("Pret garaj dupa masina " + count + " este " + pretTotalGaraj);
			count++;
		}

		 for (Masina masina : garaj) {
		 if (masina.getColor().equalsIgnoreCase("red")) {
		 System.out.println("Ce masina rosie si frumoasa <3!");
		 } else {
		 System.out.println("Nu am gasit culoarea cautata!");
		 }
	 }

		 System.out.println("Pret final garaj " + pretTotalGaraj);
		pretMediu = pretTotalGaraj / garaj.size();
		 System.out.println("Pretul mediu per masina este " + pretMediu);

	}

}
