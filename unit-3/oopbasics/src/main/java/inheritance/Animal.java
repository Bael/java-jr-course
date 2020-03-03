package inheritance;

import animal.Feeder;
import java.util.Date;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
public class Animal {

    public Animal() {
    }

    public Animal(String[] awards, String passportCode, int age, String name, double weight, String[] owners,
        Long cost, double tailLength, double length, String meow, Date birthDay) {
        this.awards = awards;
        this.passportCode = passportCode;
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.owners = owners;
        this.cost = cost;
        this.tailLength = tailLength;
        this.length = length;
        this.meow = meow;
        this.birthDay = birthDay;
    }

    protected String[] awards;
    /**
     * Код родословной
     */
    protected String passportCode;
    /**
    возраст
     */
    protected int age;
    /**
     * имя
     */
    protected String name;
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
    /**
     * длина хвоста
     */
    protected double tailLength;
    /**
     * длина
     */
    protected double length;
    protected String meow = "meooowwwww";
    protected Date birthDay;

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

    String meow() {
        return paint() + System.lineSeparator()
            + meow;
    }

    public Date getBirthDay() {
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
