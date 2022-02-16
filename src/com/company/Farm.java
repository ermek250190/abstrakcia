package com.company;

import java.util.Arrays;

public class Farm {
  private String address;
  private String Onername;
  private Cow [] cows;
  private Horse[] horses;
  private Sheep[] sheeps;

  public Farm(String address, String onername, Cow[] cows, Horse[] horses, Sheep[] sheeps) {
    this.address = address;
    Onername = onername;
    this.cows = cows;
    this.horses = horses;
    this.sheeps = sheeps;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getOnername() {
    return Onername;
  }

  public void setOnername(String onername) {
    Onername = onername;
  }

  public Cow[] getCows() {
    return cows;
  }

  public void setCows(Cow[] cows) {
    this.cows = cows;
  }

  public Horse[] getHorses() {
    return horses;
  }

  public void setHorses(Horse[] horses) {
    this.horses = horses;
  }

  public Sheep[] getSheeps() {
    return sheeps;
  }

  public void setSheeps(Sheep[] sheeps) {
    this.sheeps = sheeps;
  }

  public void getmethod(){
    System.out.println("getOnername  "+getOnername()+" getAddress  "+getAddress());

    for (Animals animal:getCows()){
          animal.getanimals();
    }

    for (Animals animal:getSheeps()) {
        animal.getanimals();

    }
    for (Animals animal:getHorses()) {
         animal.getanimals();

    }
  }


}
