import java.text.MessageFormat;

public class Nurse extends HospitalEmployee{

    protected int numOfPatients;
    protected String name;
    protected int number;

    public Nurse(String name, int number, int numOfPatients) {
        super(name, number);
        this.name = name;
        this.number = number;
        this.numOfPatients = numOfPatients;
    }

    @Override
    public void work() {
        System.out.println(MessageFormat.format("{0} works for the hospital. {1} is a {2} with {3} patients.",
                name, name, this.getClass().getName(), numOfPatients));
    }

    @Override
    public String toString() {
        return name + " " + number + " has " +  numOfPatients + " patients.";
    }
}
