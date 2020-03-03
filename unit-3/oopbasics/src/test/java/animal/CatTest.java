package animal;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import org.junit.Test;

public class CatTest {

    private String[] awards = new String[] {"Хвост года 2016", "Самые лучшие уши 2017г."};
    private String[] owners = new String[] {"Петр Горевой", "Иван Драго"};
    @Test
    public void testPaint() {
        Cat cat = new Cat(awards, "ID-01121", "Пушок", "grey", 3.5, owners,
            5000L, LocalDate.of(2010, 1, 1));
        System.out.println(cat.getAge());

        System.out.println(cat.speak("Привет!"));

//        Cat.builder().age(2).color("grey").tailLength(11).build();

        ;
//        Cat cat =  new Cat( new Date(2000, 1, 1));
//        cat.sleep(120, "Кухня");
////        System.out.println(cat.paint());
//        System.out.println(cat.meow());
//        String meowString = cat.meow();
    }

    @Test
    public void testBirthDayChange() {
        Cat cat = new Cat(awards, "ID-01121", "Пушок", "grey", 3.5, owners,
            5000L, LocalDate.of(2010, 1, 1));
//        Cat cat = Cat.builder().name("Пушок").owners(new String[] {"Петр", "Иона"}).build();
        System.out.println(cat.toString());

        cat.getOwners()[cat.getOwners().length - 1] = "Пушок";
        System.out.println("Теперь Пушок сам себе хозяин!");
        System.out.println(Arrays.toString(cat.getOwners()));


//        Cat cat = new Cat( new Date(2000, 1, 1));
//        cat.getBirthDay().setMonth(2);
//        assertEquals(new Date(2000, 1, 1), cat.getBirthDay());
    }
}
