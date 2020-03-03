package animal;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;
import lombok.Getter;


@Getter
public class Cat {

    private String[] awards;

    /**
     * Код родословной
     */
    private String passportCode;
    /**
     * имя
     */
    private String name;
    /**
     * Окрас
     */
    private String color;
    /**
     * вес
     */
    private double weight;
    /**
     * список владельцев
     */
    private String[] owners;
    /**
     * запрашиваемая стоимость
     */
    private Long cost;
    private LocalDate birthDay;

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
     * возраст
     */
    public int getAge() {
        if (birthDay != null) {

            return (int) ChronoUnit.YEARS.between(birthDay, LocalDate.now());

        } else {
            throw new RuntimeException("Не указана дата рождения кота!");
        }
    }

//    public Cat(Date birthDay) {
//        this.birthDay = birthDay;
//    }

    public void sleep(int duration, String site) {
        // some code ...
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

    private void lickTummy() {

    }

    String speak(String text) {
        return paint() + System.lineSeparator()
            + " Meooowwwww " + text;
    }

    public LocalDate getBirthDay() {
        return birthDay;
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
