
import java.time.LocalDate;

public class Human {


  //  public static class human {
        private  String name;
        private   int yearOfBirth;
        private   String town;
        private   String job;

    public Human(String name, int yearOfBirth, String town, String job) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.job = job;
    }

    public  String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public  int getYearOfBirth() {
            return yearOfBirth;
        }

        public String getName() {
            return name;
        }

        public  String getTown() {
            return town;
        }

        public void setYearOfBirth(int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTown(String town) {
            this.town = town;
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

    public  static   void printEmployee1(Human humans) {

            System.out.println("Привет! Меня зовут " + humans.getName() + ". Я из города " + humans.getTown() +
                    ". Я родился в " + humans.getYearOfBirth() + " году. Будем знакомы!!");

        }

        public  static void printEmployee2(Human humans) {
            int age = LocalDate.now().getYear() - humans.yearOfBirth;

            System.out.println("Привет! Меня зовут " + humans.name + ". Я из города " + humans.town +
                    ". Мне " + age + " лет. Я работаю в должности " + humans.job + ". Будем знакомы!!");

        }

    }





