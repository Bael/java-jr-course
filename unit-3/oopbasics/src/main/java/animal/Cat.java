package animal;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;
import lombok.Getter;


@Getter
public class Cat {
     String[] awards;
    /**
     * Код родословной
     */
     String passportCode;

    /**
     * имя
     */
     String name;

    /**
     * Окрас
     */
     String color;

    /**
     * вес
     */
     double weight;
    /**
     * список владельцев
     */

     private String[] owners;
     public String[] getOwners() {
         return owners;
     }

    /**
     * запрашиваемая стоимость
     */
     Long cost;

     LocalDate birthDay;

    public Cat(String[] awards, String passportCode, String name, String color, double weight, String[] owners,
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

    public Cat() {
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

    /**
     * Позвать кота пообедать
     * Предусловие:
     *
     * @param feeder Кормушка, должна быть указана, и не пуста.
     * Кот не должен быть сыт.
     * Постусловие:
     * Здоровье кота повышается на 30%
     */
    private void takeLunch(Feeder feeder) {
        Objects.requireNonNull(feeder, "Где кормушка?");
        if (feeder.isEmpty()) {
            throw new RuntimeException("Рммяяяууу!!! (Хозяин, ты издеваешься?)");
        }
        eat(feeder.getFood());
    }

    private void eat(Object food) {
    }

    String speak(String text) {
        String name = this.name != null ? this.name : "Безымянный";
        return paint() + System.lineSeparator()
            + name +  " speaks: Meooowwwww " + text;
    }

    public String paint() {
        return " ,_     _\n"
            + " |\\\\_,-~/\n"
            + " / _  _ |    ,--.\n"
            + "(  @  @ )   / ,-'\n"
            + " \\  _T_/-._( (\n"
            + " /         `. \\\n"
            + "|         _  \\ |\n"
            + " \\ \\ ,  /      |\n"
            + "  || |-_\\__   /\n"
            + " ((_/`(____,-'";
    }

}
