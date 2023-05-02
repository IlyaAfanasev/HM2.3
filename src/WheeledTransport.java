public abstract class WheeledTransport implements Transport  {
    private String modelName;
    private int wheelsCount;

    public WheeledTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {

        for (int i = 0; i < getWheelsCount(); i++) {

            System.out.println("Меняем покрышку");
        }

    }








}


