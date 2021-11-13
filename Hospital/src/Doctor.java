import java.text.MessageFormat;

public class Doctor extends HospitalEmployee{

    protected String speciality;
    protected String name;
    protected int number;

    public Doctor(String name, int number, String speciality) {
        super(name, number);
        this.name = name;
        this.number = number;
        this.speciality = speciality;
    }


    @Override
    public String toString() {
        return name + " " +number+" "+speciality;
    }

    @Override
    public void work() {
        System.out.println(MessageFormat.format("{0} works for the hospital. {1} is a {2} {3}", name, name,
                speciality, this.getClass().getName()));
    }
}
