package inheritance;

import java.time.LocalDate;
import lombok.Getter;


@Getter
public class Cat extends Animal {

    public Cat(String[] awards, String passportCode, String name, String color, double weight, String[] owners,
        Long cost, LocalDate birthDay) {
        super(awards, passportCode, name, color, weight, owners, cost, birthDay);
    }

    public Cat() {
    }

    @Override
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
