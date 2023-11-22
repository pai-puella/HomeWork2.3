public class Bicycle extends Vehicle {

    private String modelName;
    private int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void changeTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем велосипед " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            changeTyre();
        }
    }
}
