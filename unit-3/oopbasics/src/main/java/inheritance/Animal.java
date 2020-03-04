package inheritance;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import lombok.Getter;


@Getter
public abstract class Animal {
    protected String[] awards;
    /**
     * Код родословной
     */
    protected String passportCode;
    /**
     * имя
     */
    protected String name;
    /**
     * Окрас
     */
    protected String color;
    /**
     * вес
     */
    protected double weight;
    /**
     * список владельцев
     */

    protected String[] owners;
    /**
     * запрашиваемая стоимость
     */
    protected Long cost;
    protected LocalDate birthDay;

    public Animal() {
    }

    public Animal(String[] awards, String passportCode, String name, String color, double weight, String[] owners,
        Long cost, LocalDate birthDay) {
        this.awards = awards;
        this.passportCode = passportCode;
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.owners = owners;
        this.cost = cost;
        this.birthDay = birthDay;
    }

    public String[] getOwners() {
        return owners;
    }

    /**
     * Метод рассчитывающий возраст кота в годах.
     * Пред условие - наличие дня рождения,
     * если его нет - бросаем исключение.
     * Пост условие - возращается возраст в годах.
     */
    public int getAge() {
        if (birthDay != null) {
            return (int) ChronoUnit.YEARS.between(birthDay, LocalDate.now());
        } else {
            throw new RuntimeException("Не указана дата рождения кота!");
        }
    }

    //?????
//    public String paint() {
//        return " ,_     _\n"
//            + " |\\\\_,-~/\n"
//            + " / _  _ |    ,--.\n"
//            + "(  @  @ )   / ,-'\n"
//            + " \\  _T_/-._( (\n"
//            + " /         `. \\\n"
//            + "|         _  \\ |\n"
//            + " \\ \\ ,  /      |\n"
//            + "  || |-_\\__   /\n"
//            + " ((_/`(____,-'";
//    }

    public abstract String paint();

}
