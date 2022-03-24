package ui;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Country;
import model.CountryList;

public class Main {
	
	private static CountryList countryList;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		File file = new File(".\\files\\prueba.txt");
		
		FileReader input= new FileReader(file);
		
		BufferedReader inp= new BufferedReader(input);
		
		String a = inp.readLine();
		
		int n = Integer.parseInt(a);
		
		countryList= new CountryList();
		
		for (int  i = 0; i<n;i++) {
			
			String[] country= inp.readLine().split(";");
			String name= country[0];
			int oroMasc= Integer.parseInt(country[1]);
			int plataMasc= Integer.parseInt(country[2]);
			int bronceMasc= Integer.parseInt(country[3]);
			int oroFem= Integer.parseInt(country[4]);
			int plataFem= Integer.parseInt(country[5]);
			int bronceFem= Integer.parseInt(country[6]);
			
			Country country1= new Country(name,oroMasc,plataMasc,bronceMasc, oroFem, plataFem, bronceFem);
			
			countryList.addCountry(country1);
			
			
		}
		
		countryList.sortComparatorClass();
		printList();
		
		countryList.sortCollectionsNaturalOrder();
		printList2();
		
		countryList.bubbleSort();
		printList3();
	}
	
	public static void printList() {
		
		System.out.println("Masculino");
		for (int i = 0; i < countryList.getCountry().size(); i++) {
			System.out.println(countryList.getCountry().get(i).toString1());
		}
		System.out.println("----------");
		
	}
	
	public static void printList2() {
		
		System.out.println("Femenino");
		for (int i = 0; i < countryList.getCountry().size(); i++) {
			System.out.println(countryList.getCountry().get(i).toString2());
		}
		System.out.println("----------");
		
	}
	
	public static void printList3() {
		
		System.out.println("Combinado");
		for (int i = 0; i < countryList.getCountry().size(); i++) {
			System.out.println(countryList.getCountry().get(i).toString3());
		}
		
	}
	
	
}
