import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class CollectionTest {

    @Test
    public void addTest() {
        String[] array = {"1","2","3","4","5"};
        demoCollection arrayCol = new demoCollection(5);
        arrayCol.add("1");
        arrayCol.add("2");
        arrayCol.add("3");
        arrayCol.add("4");
        arrayCol.add("5");
        String[] array2 = new String[5];
        for (int i = 0; i < arrayCol.length();i++) {
            array2[i] = arrayCol.get(i);
        }
        assertArrayEquals(array,array2);
    }

    @Test
    public void addTest1() {
        demoCollection arrayCol = new demoCollection(5);
        assertTrue(arrayCol.add("1"));
    }

    @Test
    public void addAllTest() {
        String[] array = {"1","2","3","4","5"};
        demoCollection arrayCol = new demoCollection(5);
        String[] array2 = {"1","2","3","4","5"};
        arrayCol.addAll(array2);
        String[] array3 = new String[5];
        for (int i = 0; i < arrayCol.length();i++) {
            array3[i] = arrayCol.get(i);
        }
        assertArrayEquals(array,array3);
    }

    @Test
    public void addAllTest1() {
        demoCollection arrayCol = new demoCollection(5);
        String[] array = {"1","2","3","4","5"};
        assertTrue(arrayCol.addAll(array));
    }

    @Test
    public void addAllColTest() {
        String[] array = {"1","2","3","4","5"};
        demoCollection arrayCol = new demoCollection(5);
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayCol.addAll(arrayList);
        String[] array2 = new String[5];
        for (int i = 0; i < arrayCol.length();i++) {
            array2[i] = arrayCol.get(i);
        }
        assertArrayEquals(array,array2);
    }

    @Test
    public void addAllColTest1() {
        demoCollection arrayCol = new demoCollection(5);
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        assertTrue(arrayCol.addAll(arrayList));
    }

    @Test
    public void deleteInxTest() {
        String[] array = {"2","3","4","5"};
        demoCollection arrayCol = new demoCollection(5);
        arrayCol.add("1");
        arrayCol.add("2");
        arrayCol.add("3");
        arrayCol.add("4");
        arrayCol.add("5");
        arrayCol.delete(0);
        String[] array2 = new String[4];
        for (int i = 0; i < arrayCol.length();i++) {
            array2[i] = arrayCol.get(i);
        }
        assertArrayEquals(array,array2);
    }

    @Test
    public void deleteInxTest1() {
        String[] array = {"1","2","3","4","5"};
        demoCollection arrayCol = new demoCollection(5);
        arrayCol.add("1");
        arrayCol.add("2");
        arrayCol.add("3");
        arrayCol.add("4");
        arrayCol.add("5");
        arrayCol.delete(20);
        String[] array2 = new String[5];
        for (int i = 0; i < arrayCol.length();i++) {
            array2[i] = arrayCol.get(i);
        }
        assertArrayEquals(array,array2);
    }

    @Test
    public void deleteStrTest() {
        String[] array = {"2","3","4","5"};
        demoCollection arrayCol = new demoCollection(5);
        arrayCol.add("1");
        arrayCol.add("2");
        arrayCol.add("3");
        arrayCol.add("4");
        arrayCol.add("5");
        arrayCol.delete("1");
        String[] array2 = new String[4];
        for (int i = 0; i < arrayCol.length();i++) {
            array2[i] = arrayCol.get(i);
        }
        assertArrayEquals(array,array2);
    }

    @Test
    public void deleteStrTest1() {
        demoCollection arrayCol = new demoCollection(5);
        arrayCol.add("1");
        assertTrue(arrayCol.delete("1"));
    }

    @Test
    public void getTest() {
        demoCollection arrayCol = new demoCollection(5);
        arrayCol.add("1");
        assertEquals("1",arrayCol.get(0));
    }

    @Test
    public void getTest1() {
        demoCollection arrayCol = new demoCollection(5);
        arrayCol.add("1");
        assertEquals(null,arrayCol.get(20));
    }

    @Test
    public void containsTest() {
        demoCollection arrayCol = new demoCollection(5);
        arrayCol.add("1");
        assertTrue(arrayCol.contains("1"));
    }

    @Test
    public void containsTest1() {
        demoCollection arrayCol = new demoCollection(5);
        arrayCol.add("1");
        assertFalse(arrayCol.contains("20"));
    }

    @Test
    public void equalsTest() {
        demoCollection arrayCol = new demoCollection(5);
        arrayCol.add("1");
        String[] str = {"1"};
        assertTrue(arrayCol.equals(str));
    }

    @Test
    public void equalsTest1() {
        demoCollection arrayCol = new demoCollection(5);
        arrayCol.add("1");
        String[] str = {"2"};
        assertFalse(arrayCol.equals(str));
    }

    @Test
    public void clearTest() {
        String[] array = new String[5];
        demoCollection arrayCol = new demoCollection(5);
        arrayCol.add("1");
        arrayCol.clear();
        String[] array2 = new String[5];
        for (int i = 0; i < arrayCol.length();i++) {
            array2[i] = arrayCol.get(i);
        }
        assertArrayEquals(array,array2);
    }

    @Test
    public void clearTest1() {
        demoCollection arrayCol = new demoCollection(5);
        arrayCol.add("1");
        assertTrue(arrayCol.clear());
    }

    @Test
    public void indexOfTest() {
        demoCollection arrayCol = new demoCollection(5);
        arrayCol.add("1");
        assertEquals(0,arrayCol.indexOf("1"));
    }

    @Test
    public void indexOfTest1() {
        demoCollection arrayCol = new demoCollection(5);
        arrayCol.add("1");
        assertEquals(-1,arrayCol.indexOf("20"));
    }

    @Test
    public void sizeTest() {
        demoCollection arrayCol = new demoCollection(5);
        arrayCol.add("1");
        arrayCol.add(null);
        arrayCol.add("2");
        arrayCol.add(null);
        arrayCol.add("3");
        assertEquals(3,arrayCol.size());
    }

    @Test
    public void sizeTest1() {
        demoCollection arrayCol = new demoCollection(5);
        assertEquals(0,arrayCol.size());
    }

    @Test
    public void trimTest() {
        String[] array = new String[] {"1"};
        demoCollection arrayCol = new demoCollection(5);
        arrayCol.add("1");
        arrayCol.add(null);
        arrayCol.trim();
        String[] array2 = new String[1];
        for (int i = 0; i < arrayCol.length();i++) {
            array2[i] = arrayCol.get(i);
        }
        assertArrayEquals(array,array2);
    }

    @Test
    public void trimTest1() {
        demoCollection arrayCol = new demoCollection(5);
        arrayCol.add("1");
        assertTrue(arrayCol.trim());
    }

}
