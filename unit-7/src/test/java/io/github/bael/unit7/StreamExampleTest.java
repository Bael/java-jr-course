package io.github.bael.unit7;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StreamExampleTest {

    @Test
    public void makeOddList() {
    }

    @Test
    public void makeNamesList() {
        List<String> list = new StreamExample("Stream").makeNamesList(Collections.singletonList(1));

        System.out.println(list);
        Assert.assertEquals(Collections.singletonList("Stream: 1"),
                list);
    }

    @Test
    public void changeNamesList() {
        List<String> list = new StreamExample("кул хацкер").changeNamesList(Collections.singletonList(1));

        System.out.println(list);
        Assert.assertEquals(Collections.singletonList("кул хацкер: 1"),
                list);
    }
}