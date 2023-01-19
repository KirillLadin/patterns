package generators;
import person.models.Phone;
import utils.MyMath;

import java.util.Random;

public class PhoneGenerator implements Generator {
    @Override
    public final Phone generate(final int code) {
        final String number = "+79"
                + String.format("%02d", MyMath.getDigitsSum(code))
                + String.format("%03d", new Random().nextInt(1000))
                + String.format("%04d", code);
        return new Phone(number);
    }
}
