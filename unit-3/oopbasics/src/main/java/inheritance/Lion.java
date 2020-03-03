package inheritance;

import animal.Feeder;
import java.util.Date;
import java.util.Objects;
import lombok.Builder;
import lombok.Getter;


@Getter
public class Lion extends Cat {

    private String meow = "ARRRRGGGHHH";
    private Date birthDay;

    public Lion(String[] awards, String passportCode, int age, String name, double weight, String[] owners,
        Long cost, double tailLength, double length, String meow, Date birthDay) {
        super(awards, passportCode, age, name, weight, owners, cost, tailLength, length, meow, birthDay);
    }

    public Lion() {

    }


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
            throw new RuntimeException("(Съем!)");
        }
        eat(feeder.getFood());
    }

    private void eat(Object food) {

    }


    String meow() {
        return paint() + System.lineSeparator()
            + meow;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public String paint() {
        return "                       \\\\\\\\\\\\\\////\n"
            + "                             \\\\//\\/\\\\\\\\\\\\\\///\n"
            + "                           \\\\\\`      \\\\\\\\\\\\///\n"
            + "                          \\\\       ||\\      \\\n"
            + "                          \\  \\\\   //     _\\  `\\\n"
            + "                         /  /. \\  \\\\    /O.    `\\,\n"
            + "                        //  |__\\\\ //\\         . __\\\n"
            + "                      /`           //\\\\      , .\\ /\n"
            + "                     \\\\\\\\          //\\        ___|\n"
            + "                    ////\\\\            \\\\     `   \\\n"
            + "                  //////////\\\\\\\\       //__       |\n"
            + "                 |`  \\\\\\//////\\\\        \\_ \\______|\n"
            + "                 |     \\\\\\\\//\\\\/////\\\\\\   \\\n"
            + "                ./      \\\\\\\\////////\\\\     |\\\n"
            + "                |        \\\\\\\\////\\\\//\\\\\\\\\\\\\\\\\n"
            + "                |          \\\\\\///      \\\\\\\\\\\\\n"
            + "                |          \\\\\\//         \\//\n"
            + "                |            \\/        \\ |\n"
            + "                |             `         \\|\n"
            + "                | |                      \\                       /\n"
            + "                | |           \\           \\                     //\n"
            + "                | |                        \\                   ////\n"
            + "                | |             .          `|                 /////\n"
            + "                | |                         `\\                \\\\////\n"
            + "                 \\`|                          `|              \\\\||/\n"
            + "                  | |             \\            `|  ,--.         \\ \\,\n"
            + "                  |  \\                          |./    `\\        | |\n"
            + "                   |  |                                 |        | |\n"
            + "                   |___|            .                   |        | |\n"
            + "                   /   |                                |        | |\n"
            + "                   |    |                               ;        | |\n"
            + "                   |                                    |        | |\n"
            + "                 __|                                   /`       /` ;\n"
            + "                /   \\                          ,      ; \\     ,` ,/\n"
            + "                \\____\\              \\       \\,/__________|__.' ,`\n"
            + "                  nmf \\______________\\_______________________.'\n ";
    }

}
