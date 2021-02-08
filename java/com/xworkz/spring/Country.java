package com.xworkz.spring;

public class Country {

	private String CountryName;
	private String primeMinister;
	private String president;//property
	private String capital;//property
	private long population;//property
	private int noOfStates;//property
	
	

	public Country(String primeMinister) {
		super();
		this.primeMinister = primeMinister;
	}

	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public void setPresident(String president) {
		this.president = president;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}
	
	
	@Override
	public String toString() {
		return "Country [Country_name=" + CountryName + ", primeMinister=" + primeMinister + ", president=" + president
				+ ", capital=" + capital + ", population=" + population + ", noOfStates=" + noOfStates + "]";
	}


	
}
