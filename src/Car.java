class Car extends Vehicle {

    private String modelName;
    private int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        super.updateTyre();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем автомобиль " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}
