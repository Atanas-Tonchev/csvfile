package model;

public class EngineStatistics {
    private int Horsepower;
    private int Torque;

    public EngineStatistics(int horsepower, int torque) {
        Horsepower = horsepower;
        Torque = torque;
    }

    public int getHorsepower() {
        return Horsepower;
    }


    public int getTorque() {
        return Torque;
    }


    @Override
    public String toString() {
        return "EngineStatistics{" +
                "Horsepower=" + Horsepower +
                ", Torque=" + Torque +
                '}';
    }
}
