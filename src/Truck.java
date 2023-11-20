public class Truck extends Car {
    private int trailerCount;

    public Truck(String modelName, int wheelsCount, int trailerCount) {
        super(modelName, wheelsCount);
        this.trailerCount = trailerCount;
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    //public int getTrailerCount() {
    //    return trailerCount;
    //}

    //public void setTrailerCount(int trailerCount) {
    //    this.trailerCount = trailerCount;
    //}
}
