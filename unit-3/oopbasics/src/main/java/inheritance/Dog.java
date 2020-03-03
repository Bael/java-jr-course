package inheritance;

import animal.Feeder;
import java.util.Date;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
public class Dog extends Animal {


    public Dog(String[] awards, String passportCode, int age, String name, double weight, String[] owners,
        Long cost, double tailLength, double length, String meow, Date birthDay) {
        super(awards, passportCode, age, name, weight, owners, cost, tailLength, length, meow, birthDay);
    }
//    /**
//     * Позвать кота пообедать
//     * Предусловие:
//     *
//     * @param feeder Кормушка, должна быть указана, и не пуста.
//     * Кот не должен быть сыт.
//     * Постусловие:
//     * Здоровье кота повышается на 30%
//     */
//    private void takeLunch(Feeder feeder) {
//        Objects.requireNonNull(feeder, "Где кормушка?");
//        if (feeder.isEmpty()) {
//            throw new RuntimeException("Рммяяяууу!!! (Хозяин, ты издеваешься?)");
//        }
//        eat(feeder.getFood());
//    }


    String woof() {
        return paint() + System.lineSeparator()
            + meow;
    }


    public String paint() {
        return "  __      _\n"
            + "o'')}____//\n"
            + " `_/      )\n"
            + " (_(_/-(_/";
    }

}
