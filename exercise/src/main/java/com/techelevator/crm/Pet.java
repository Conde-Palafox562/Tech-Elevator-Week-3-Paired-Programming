package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {
 private String name;
 private String species;
 private List<String> vaccinations;
//Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<String> vaccinations) {
        this.vaccinations = vaccinations;
    }
// Constructor
 public  Pet(String name, String species){
        this.name=name;
        this.species=species;
      this.vaccinations=new ArrayList<>();

 }
//Method
    public String listVaccinations(){
  String petVaccineList;
        petVaccineList = new ArrayList<>();
        for ( String V:vaccinations){
           vaccinations.add("Rabies");
           vaccinations.add("Distemper");
           vaccinations.add("Parvo");
          System.out.print(vaccinations+",");
       }
    }

return


}
