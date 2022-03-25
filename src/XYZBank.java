public class XYZBank extends Bank {

    private double primeRate=300;
    private double finalRate;


    public XYZBank(String name, String address, String policy,double rate) {
        super();
    }

    @Override
    public void calculateRateOfInterest() {
         finalRate = getRate() + primeRate;
    }
}


