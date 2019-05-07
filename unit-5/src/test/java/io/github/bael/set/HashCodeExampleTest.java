package io.github.bael.set;

import java.io.FileNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class HashCodeExampleTest {

    @Test
    public void testHashCodeLosesList() {
        List<String> list = new ArrayList<>();
        list.add("a");

        Set<List<String>> set = new HashSet<List<String>>();
        set.add(list);

        //Collections.synchronizedCollection()
        //CopyOnWriteArrayList

        System.out.println("hash before " + list.hashCode());

        assertTrue(set.contains(list)); //

        // But now we mutate the list:

        list.add("goodbye");

        System.out.println("hash after " + list.hashCode());

        // And it no longer appears in the set!

        assertFalse(set.contains(list)); //  → false!
    }

    @Test
    public void testError() {
        try {
            throw new OutOfMemoryError("");
        }catch (Error error) {
            System.out.println("Error handled!");
            System.out.println(error);
            throw new RuntimeException();
        } finally {
            System.out.println("catched!");
        }
    }

    @Test
    public void testHashMap() {
        Map<String, String> colorTable = new HashMap<>(4, 0.75f);
        colorTable.put("green", "#00FF00");
        colorTable.put("red", "#FF0000");
        colorTable.put("blue", "#0000FF");

        assertEquals("#0000FF", colorTable.get("blue"));
        System.out.println(colorTable);


//        Collections.checkedSet(new HashSet<>(), String.class);
//        Collections.emptyList();
//        Collections.reverse(new ArrayList<>());
//        Collections.shuffle(new ArrayList<>());
//        Collections.unmodifiableList(new ArrayList<>());

//
//        try {
//            throw new FileNotFoundException();
//        } catch (RuntimeException | FileNotFoundException exception) {
//            // handle error
//            exception.addSuppressed();
//        } finally {
//            // always called
//            // clean all resources
//        }
//
//        try(  FileInputStream     input         = new FileInputStream("file.txt");
//            BufferedInputStream bufferedInput = new BufferedInputStream(input)
//        ) {
//
//            int data = bufferedInput.read();
//            while(data != -1){
//                System.out.print((char) data);
//                data = bufferedInput.read();
//            }
//        }



    }
}