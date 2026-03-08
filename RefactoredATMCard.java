public class ATMCard {

    private int pin;
    private boolean valid;

    public ATMCard() {
        this.pin = 0;
        this.valid = true;
    }

    public ATMCard(int pin, boolean valid) {
        this.pin = pin;
        this.valid = valid;
    }

    public int getPin() {
        return pin;
    }

    public boolean getValid() {
        return valid;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String toString() {
        return "Pin = " + pin;
    }
}
