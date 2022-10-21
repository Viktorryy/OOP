
public class Main {
    public static void main(String[] args) {

        // Задание 1
        Human[] humans = new Human[4];
        humans[0] = new Human("Максим",1987,"Минск", "бренд-менеджером");
        humans[1] = new Human("Аня",1993,"Москва","методистом образовательных программ");
        humans[2] = new Human("Катя", 1994, "Калининград","продакт-менеджером");
        humans[3] = new Human("Артем", 1995, "Москва","директором по развитию бизнеса");
        System.out.println("   Задание 1");
        for (int i = 0; i < humans.length; i++) {

            Human.printEmployee1(humans[i]);
        }

        // Задание 2
        System.out.println("   Задание 2");

        for (int i = 0; i < humans.length; i++) {

           Human.printEmployee2(humans[i]);

        }


    }

}