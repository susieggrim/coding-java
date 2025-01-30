package workerchallenge;

public class WorkerMain {

    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "1983-11-29", "2020-01-01");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee susie = new SalariedEmployee("Susie", "1975-12-05", "2020-02-02", 35000);
        System.out.println(susie);
        System.out.println("Age = " + susie.getAge());
        System.out.println("Pay = " + susie.collectPay());
        System.out.println("Susie's Paycheck = $" + susie.collectPay());
        susie.retired();
        System.out.println("Susie's pension check = $" + susie.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "1970-05-05", "2021-03-03", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());

    }

}
