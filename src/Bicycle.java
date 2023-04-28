public class Bicycle extends WheeledTransport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {

        System.out.println("Обслуживаем " + getModelName());
        updateTyre();


    }
}
