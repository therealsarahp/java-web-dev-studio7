package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        CD britneySpears = new CD(512, "Hit Me Baby One More Time", 320);
        DVD titanic = new DVD(1000, "Titanic", 800);

        // TODO: Call each CD and DVD method to verify that they work as expected.

        System.out.println(britneySpears.spinDisc());
        System.out.println(britneySpears.getStorageCapacity());
        System.out.println(titanic.getStorageCapacity());
        System.out.println(titanic.spinDisc());
    }
}
