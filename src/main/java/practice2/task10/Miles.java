package practice2.task10;

public class Miles {

    private double miles;

    public Miles(double miles) {
        this.miles = miles;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    @Override
    public String toString() {
        return miles + " миль";
    }
}
