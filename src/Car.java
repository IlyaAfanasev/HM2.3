public class Car extends TransportVehicle {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {

        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
        checkEngine();


    }


}
