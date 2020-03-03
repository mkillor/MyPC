package com.killoran;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        PowerSupply mySupply = new PowerSupply("EVGA - SuperNOVA 750",110.00,750,true,"Gold");
        mySupply.display();
        //hint after other objects are created they can be placed within a case object this demonstrates composition
    }
}
