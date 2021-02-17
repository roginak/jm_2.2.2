package web.model;

public class Car {
    private String model;
    private int series;
    private int distance;

    public Car(String model, int series, int distance) {
        this.model = model;
        this.series = series;
        this.distance = distance;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Car {" +
                "model ='" + model + '\'' +
                ", series ='" + series + '\'' +
                ", distance =" + distance +
                '}';
    }

}
