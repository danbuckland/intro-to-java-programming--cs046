
public class VoltageDividerAmplifier extends Amplifier
{
     // TODO: supply the implementation of VoltageDividerAmplifier as a subclass of Amplifier
     // R1 and R2 represent resistance. The gain (g) is calculated from the resistance as follows:
     // VoltageDividerAmplifier:    g = R2 / (R1 + R2)
     // TODO: the getGain method needs to return the correct gain (g)
    public  VoltageDividerAmplifier(int resistance1, int resistance2) {
        super(resistance1, resistance2);
    }

    public double getGain() {
        double r1 = getR1();
        double r2 = getR2();
        return r2 / (r1 + r2);
    }
}
