package model;

public class Country implements Comparable<Country> {

	
	private String name;
	private int oroMasc;
	private int plataMasc;
	private int bronceMasc;
	private int oroFem;
	private int plataFem;
	private int bronceFem;
	private int oro;
	private int plata;
	private int bronce;
	
	
	public Country(String name, int oroMasc, int plataMasc, int bronceMasc, int oroFem,int plataFem, int bronceFem ){
		
		this.name=name;
		this.oroMasc=oroMasc;
		this.plataMasc=plataMasc;
		this.bronceMasc=bronceMasc;
		this.oroFem=oroFem;
		this.plataFem=plataFem;
		this.bronceFem=bronceFem;
		oro = oroMasc + oroFem;
		plata = plataMasc + plataFem;
		bronce = bronceMasc + bronceFem;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOroMasc() {
		return oroMasc;
	}

	public void setOroMasc(int oroMasc) {
		this.oroMasc = oroMasc;
	}

	public int getPlataMasc() {
		return plataMasc;
	}

	public void setPlataMasc(int plataMasc) {
		this.plataMasc = plataMasc;
	}

	public int getBronceMasc() {
		return bronceMasc;
	}

	public void setBronceMasc(int bronceMasc) {
		this.bronceMasc = bronceMasc;
	}

	public int getOroFem() {
		return oroFem;
	}

	public void setOroFem(int oroFem) {
		this.oroFem = oroFem;
	}

	public int getPlataFem() {
		return plataFem;
	}

	public void setPlataFem(int plataFem) {
		this.plataFem = plataFem;
	}

	public int getBronceFem() {
		return bronceFem;
	}

	public void setBronceFem(int bronceFem) {
		this.bronceFem = bronceFem;
	}
	
	
	public String toString1() {
		return name + " " + oroMasc + " " + plataMasc+ " " + bronceMasc ;
	}
	
	public String toString2() {
		return  name + " " + oroFem + " " + plataFem+ " " + bronceFem ;
	}
	
	public String toString3() {
		return name + " " + oro + " " + plata+ " " + bronce ;
	}
	
	@Override
	public int compareTo(Country o) {
		int result = 0;
		
		result = this.getOroFem() - o.getOroFem();
		
		if (result == 0) {
			result = this.getPlataFem() - o.getPlataFem();
		}
		
		if (result == 0) {
			result = this.getBronceFem() - o.getBronceFem();
		}
		
		if (result==0) {
			result = o.getName().compareTo(this.getName());
		}
		return result;
	}

	public int compareByOro(Country o) {
		
		return this.oro - o.oro;
	}
	
	public int compareByPlata(Country o) {
		
		return this.plata - o.plata;
	}
	
	public int compareByBronce(Country o) {
	
	return this.bronce - o.bronce;
	}

	public int compareByName(Country o) {
	
	return this.name.compareTo(o.name);
	}

	

}
