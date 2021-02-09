package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(double storageCapacity, String content, double spinSpeed) {
        super(storageCapacity, content, spinSpeed);
    }


    @Override
    public String spinDisc() {
        return "This disc spins at " + this.getSpinSpeed() + " rpm.";
    }

    @Override
    public void playDisc() {
        System.out.println("A CD plays in multiple machines: Cd players, computer disc drives, and Dvd players.");
    }

    @Override
    public void readDisc() {
        System.out.println("CD's only play audio tracks. Other kinds of data can't be stored on CD's.");
    }

    // TODO: Implement your custom interface.


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
