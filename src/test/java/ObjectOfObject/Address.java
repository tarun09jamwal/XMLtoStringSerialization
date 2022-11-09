package ObjectOfObject;

public class Address {
    private String state;
    private DistAndPin distAndPin;
    private String country;

    public DistAndPin getDistAndPin() {
        return distAndPin;
    }

    public void setDistAndPin(DistAndPin distAndPin) {
        this.distAndPin = distAndPin;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
