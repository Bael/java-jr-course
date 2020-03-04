package inheritance;

import animal.Feeder;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
public class Dog extends Animal {

    public Dog(String[] awards, String passportCode, String name, String color, double weight, String[] owners,
        Long cost, LocalDate birthDay) {
        super(awards, passportCode, name, color, weight, owners, cost, birthDay);
    }

    /**
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

    @Override
    public String paint() {
        return "  __      _\n"
            + "o'')}____//\n"
            + " `_/      )\n"
            + " (_(_/-(_/";
    }

}
