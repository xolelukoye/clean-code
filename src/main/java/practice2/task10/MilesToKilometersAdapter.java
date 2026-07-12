package practice2.task10;

public class MilesToKilometersAdapter implements Distance {

    private Miles miles;

    public MilesToKilometersAdapter(Miles miles) {
        this.miles = miles;
    }

    @Override
    public double getDistance() {
        return miles.getDistance() * 1.60934;
    }
}
