package person.models;

public class Fio extends Param {
    private final String lastName;
    private final String firstName;
    private final String middleName;

    public Fio(final String lastName, final String firstName, final String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    @Override
    public final String toString() {
        return this.lastName + " " + this.firstName + " " + this.middleName;
    }
}
