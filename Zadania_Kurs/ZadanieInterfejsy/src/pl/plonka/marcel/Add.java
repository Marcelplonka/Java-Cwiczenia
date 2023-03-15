package pl.plonka.marcel;

public class Add implements Computation {
    @Override
    public double compute(double argument1, double argument2) {
        return argument1 + argument2;
    }
}
