package interfaces;

import animal.Feeder;
import java.util.Date;
import java.util.Objects;
import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class Animal {

    /**
    возраст
     */
    private int age;
    /**
     * имя
     */
    private String name;
    /**
     * Цвет глаз
     */
    private String eyeColor;
    /**
     * Цвет шерсти
     */
    private String color;
    /**
     * вес
     */
    private double weight;

    /**
     * запрашиваемая стоимость
     */
    private Long cost;
    /**
     * длина хвоста
     */
    private double tailLength;
    /**
     * длина
     */
    private double length;
    /**
     * длина ушей
     */
    private double earLength;

    private String meow = "meooowwwww";
    private Date birthDay;

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
