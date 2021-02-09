package org.launchcode.studio7;

public abstract class BaseDisc {

    private double storageCapacity;
    private String content;
    private double spinSpeed;

    public BaseDisc(double storageCapacity, String content, double spinSpeed) {
        this.storageCapacity = storageCapacity;
        this.content = content;
        this.spinSpeed = spinSpeed;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getSpinSpeed() {
        return spinSpeed;
    }

    public String writeDisc(){
            return "Dvd's complex audio and visual files can only be written when the disc is 'printed'";

    }
}
