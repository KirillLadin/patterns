package generators;

import person.models.Fio;

import static utils.FileReader.getLinesFromFile;
import static utils.MyMath.getDigitsSum;

public class FioGenerator implements Generator {
    @Override
    public final Fio generate(final int code) {
        final int i = getDigitsSum(code);
        final String sex = (i % 2 == 0) ? "f" : "m";
        String lastName = getLinesFromFile("lastNames_" + sex).get(i);
        String firstName = getLinesFromFile("names_" + sex).get(getDigitsSum(code / 100));
        String middleName = getLinesFromFile("middleNames_" + sex).get(getDigitsSum(code % 100));
        return new Fio(lastName, firstName, middleName);
    }
}
