import java.text.MessageFormat;

public class Surgeon extends Doctor{
    protected boolean operating;
    protected String speciality;
    protected String name;
    protected int number;

    public Surgeon(String name, int number, String speciality, boolean operating) {
        super(name, number, speciality);
        this.name = name;
        this.operating = operating;
        this.number = number;
        this.speciality = speciality;
    }


    @Override
    public String toString() {
        return name + " " + number + " " + speciality + " " + operating;
    }

        @Override
    public void work() {
        String print = name + " works for the hospital.";
        if (operating){
            System.out.println(MessageFormat.format("{0}{1} is operating now.", print, name));
        }else {
            System.out.println((MessageFormat.format("{0}{1} is not operating.", print, name)));
        }
    }

}
