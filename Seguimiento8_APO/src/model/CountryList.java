package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountryList {
	
	private List<Country> countries;
	
	public CountryList(){
		
		countries = new ArrayList<>();
		
	}
	
	public void addCountry(Country country) {
		countries.add(country);
	}
	
	public List<Country> getCountry(){
		return countries;
	}
	
	public void sortComparatorClass() {

		Collections.sort(countries, new CountryComparator());		
	}
	
	public void sortCollectionsNaturalOrder() {
		Collections.sort(countries);
	}
	
	public void bubbleSort() {
		int n = countries.size();
		boolean inversion = true;
		
		for (int i = 0; i < n && inversion; i++) {
			inversion = false;
	    	for (int j = 1; j < n - i; j++) {
	    		int result=countries.get(j).compareByOro(countries.get(j-1));
	    		if (result > 0) {
	    			Country temp = countries.get(j);
	    			countries.set(j, countries.get(j-1));
	    	        countries.set(j-1, temp);
	    			inversion = true;
	    		}
	    		if(result==0) {
	    			Country temp = countries.get(j);
	    			countries.set(j, countries.get(j-1));
	    	        countries.set(j-1, temp);
	    			inversion = true;
	    			result=result=countries.get(j).compareByPlata(countries.get(j-1));
	    		}
	    		
	    		if(result==0) {
	    			Country temp = countries.get(j);
	    			countries.set(j, countries.get(j-1));
	    	        countries.set(j-1, temp);
	    			inversion = true;
	    			result=result=countries.get(j).compareByBronce(countries.get(j-1));
	    		}
	    		
	    		if(result==0) {
	    			Country temp = countries.get(j);
	    			countries.set(j, countries.get(j-1));
	    	        countries.set(j-1, temp);
	    			inversion = true;
	    			result=result=countries.get(j).compareByName(countries.get(j-1));
	    		}
	    	}
	    }
	}

}
