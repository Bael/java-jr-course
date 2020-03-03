package inheritance;

import animal.Feeder;
import java.util.Date;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String[] awards, String passportCode, int age, String name, double weight, String[] owners,
        Long cost, double tailLength, double length, String meow, Date birthDay) {
        super(awards, passportCode, age, name, weight, owners, cost, tailLength, length, meow, birthDay);
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
