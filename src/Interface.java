 // Интерфейс для сервисных операций транспортных средств
    interface IVehicleService {
        void check();
    }

    interface VehicleImpl extends IVehicleService {
        void updateTyre();
        String getModelName();
        int getWheelsCount();
    }

