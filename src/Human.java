
import java.time.LocalDate;

public class Human {


    //  public static class human {
    private String name;
    private int yearOfBirth;
    private String town;
    private String job;

    public Human(String name, int yearOfBirth, String town, String job) {
        this.name = validOrDefault(name, "Информация не указана");
        this.yearOfBirth = yearOfBirth >= 0 ? yearOfBirth : 0;
        this.town = validOrDefault(town, "Информация не указана");
        this.job = validOrDefault(job, "Информация не указана");
    }


    private String validOrDefault(String value, String valueDefault) {
        if (value == null || value.isEmpty()) {
            return valueDefault;
        } else {
            return value;
        }


    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        if (job == null || job.isEmpty()) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth == 0 || yearOfBirth<0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;}

    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

    }

    public void setTown(String town) {
        if (town == null || town.isEmpty()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", town='" + town + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public static void printEmployee1(Human humans) {

        System.out.println("Привет! Меня зовут " + humans.getName() + ". Я из города " + humans.getTown() +
                ". Я родился в " + humans.getYearOfBirth() + " году. Будем знакомы!!");

    }

    public static void printEmployee2(Human humans) {
        int age;
        if (humans.yearOfBirth == 0 || humans.yearOfBirth < 0) {
            age = 0;
        } else {
            age = LocalDate.now().getYear() - humans.yearOfBirth;
        }

        System.out.println("Привет! Меня зовут " + humans.name + ". Я из города " + humans.town +
                ". Мне " + age + " лет. Я работаю в должности " + humans.job + ". Будем знакомы!!");

    }

}





