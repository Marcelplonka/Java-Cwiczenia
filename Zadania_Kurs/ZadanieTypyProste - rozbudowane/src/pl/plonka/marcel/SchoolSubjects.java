package pl.plonka.marcel;

import java.util.Arrays;

public class SchoolSubjects {

    private final double[] mathematics;
    private final double[] physics;
    private final double[] geography;

    public SchoolSubjects(double[] mathematics, double[] physics, double[] geography) {
        this.mathematics = mathematics;
        this.physics = physics;
        this.geography = geography;
    }

    @Override
    public String toString() {
        return "Matematyka: " + Arrays.toString(getMathematics()) + "\n" +
                "Fizyka: " + Arrays.toString(getPhysics()) + "\n" +
                "Geografia: " + Arrays.toString(getGeography()) + "\n" +
                "Srednia: " + studentAverage();
    }

    public float studentAverage() {
        double average = 0.0;

        for (double[] subjects : new double[][]{mathematics, physics, geography}) {
            double sum = 0.0;

            for (double raiting : subjects) {
                sum += raiting;
            }

            average += sum / subjects.length;
        }

        return (float) Math.round((average / 3) * 100) / 100;
    }

    public double[] getMathematics() {
        return mathematics;
    }

    public double[] getPhysics() {
        return physics;
    }

    public double[] getGeography() {
        return geography;
    }
}
