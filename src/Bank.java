public abstract class Bank {
    private String name;
    private String address;
    private String policy;
    private double rate;

    public Bank() {

    }
    public static void main(String[] args) {

    }

    public double getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }
    public abstract void calculateRateOfInterest();
}
