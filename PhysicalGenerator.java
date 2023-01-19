package generators;

import person.models.Physical;

public class PhysicalGenerator implements Generator {
    private static final int MIN_AGE = 10;
    private static final int MIN_HEIGHT = 100;
    private static final int MOD = 10;
    private static final int MIN_WEIGHT = 30;
    private static final double METER = 100.00;
    @Override
    public final Physical generate(final int code) {
        final int x = code % 1000 / 100;
        int age = (x + 1) * MIN_AGE;
        int weight = MIN_WEIGHT + x * MOD;
        double height = (MIN_HEIGHT + x * MOD) / METER;
        return new Physical(age, weight, height);
    }
}
