package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{

    public DVD(double storageCapacity, String content, double spinSpeed) {
        super(storageCapacity, content, spinSpeed);
    }

    @Override
    public String spinDisc() {
        return "A DVD spins at a rate of 570 - 1600 rpm.\n";
    }

    @Override
    public void playDisc() {
        System.out.println("DVD's will only play in DVD players. Can't put in a cd player. ");
    }


    @Override
    public void readDisc() {
        System.out.println("Dvd's play audio and visuals that sync to tell stories created by directors, actors, producers, etc");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
