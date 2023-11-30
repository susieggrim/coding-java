import java.time.LocalDate;

public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    public Worker() {

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        int age = 0;

        if (LocalDate.now().getMonthValue() > LocalDate.parse(birthDate).getMonthValue()) {
            age = LocalDate.now().getYear() - LocalDate.parse(birthDate).getYear();
        } else if (LocalDate.now().getMonthValue() < LocalDate.parse(birthDate).getMonthValue()) {
            age =  LocalDate.now().getYear() - LocalDate.parse(birthDate).getYear() - 1;
        } else if (LocalDate.now().getMonthValue() == LocalDate.parse(birthDate).getMonthValue()) {
            if (LocalDate.now().getDayOfMonth() >= LocalDate.parse(birthDate).getDayOfMonth()) {
                age = LocalDate.now().getYear() - LocalDate.parse(birthDate).getYear();
            } else {
                age =  LocalDate.now().getYear() - LocalDate.parse(birthDate).getYear() - 1;
            }
        }
        return age;
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
