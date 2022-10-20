
import java.time.LocalDate;

public class Human {


  //  public static class human {
        private static String name;
        private  static int yearOfBirth;
        private  static String town;
        private  static String job;

    public Human(String name, int yearOfBirth, String town, String job) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.job = job;
    }

    public static String getJob() {
        return job;
    }

    public static void setJob(String job) {
        Human.job = job;
    }

    public static int getYearOfBirth() {
            return yearOfBirth;
        }

        public String getName() {
            return name;
        }

        public static String getTown() {
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



    public  static void printEmployee1(Human humans) {

            System.out.println("Привет! Меня зовут " + name + ". Я из города " + getTown() +
                    ". Я родился в " + getYearOfBirth() + " году. Будем знакомы!!");

        }

        public  static void printEmployee2(Human human) {
            int age = LocalDate.now().getYear() - yearOfBirth;


            System.out.println("Привет! Меня зовут " + name + ". Я из города " +town +
                    ". Мне " + age + " лет. Я работаю в должности " + job + ". Будем знакомы!!");

        }





    }





