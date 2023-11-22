// Интерфейс для сервисных операций транспортных средств
interface IVehicleService {
    void check();
}

interface VehicleImpl extends IVehicleService {
    void updateTyre();
    String getModelName();
    int getWheelsCount();
}

public abstract class Vehicle implements VehicleImpl{
    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

}
