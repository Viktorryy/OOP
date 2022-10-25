
public class Main {
    public static void main(String[] args) {

        // Задание 1
        Human[] humans = new Human[5];
        humans[0] = new Human("Максим",1995,"Минск", "бренд-менеджером");
        humans[1] = new Human("Аня",1993,"Москва","методистом образовательных программ");
        humans[2] = new Human("Катя", 1994, "Калининград","продакт-менеджером");
        humans[3] = new Human("Артем", 1995, "Москва","директором по развитию бизнеса");
        humans[4] = new Human("Владимир", 2001, "Казань","");
        System.out.println("   Задание 1");


        //  Блок для проверки работы сеттеров
        humans[0].setJob("");
        humans[2].setName("");
        humans[3].setTown("");
        humans[3].setYearOfBirth(-5);

        for (int i = 0; i < humans.length; i++) {
           Human.printEmployee2(humans[i]);
        }

    }

}