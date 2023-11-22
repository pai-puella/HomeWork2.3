// Обновленный класс ServiceStation
public class ServiceStation {
    public void check(Vehicle vehicle) {
        vehicle.check(); // Мы вызываем метод check напрямую, без проверки типа
    }
}