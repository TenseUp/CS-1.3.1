import java.util.ArrayList;

public class Search {

    public static int linearSearch(int[] array, int value) {

        for (int i = 0; i < array.length; i++) if(array[i] == value) return i;
        return -1;

    }

    public static int linearSearch(ArrayList<String> list, String string) {

        for(int i = 0; i < list.toArray().length; i++) if(list.get(i).equals(string)) return i;
        return -1;

    }

    public static int binarySearch(int[] array, int value) {

        int l = 0;
        int r = array.length - 1;
        while(l <= r) {
            int m = (l+r)/2;
            if(array[m] == value) return m;
            else if(array[m] < value) l = m + 1;
            else r = m - 1;
        }
        return -1;

    }

    public static int binarySearch(String[] array, String string) {

        int l = 0;
        int r = array.length - 1;
        while(l <= r) {
            int m = (l+r)/2;
            int cmp = array[m].compareTo(string);
            if(cmp == 0) return m;
            else if(cmp < 0) l = m + 1;
            else r = m - 1;
        }

        return -1;

    }
}
