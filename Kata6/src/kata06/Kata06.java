package kata06;

import java.io.File;
import java.util.Iterator;

/**
 *
 * @author Doramas Báez Bernal
 */
public class Kata06 {

    public static void main(String[] args) {
        File root = new File("/");
        File[] files = root.listFiles();
        new Histogram<>(megabytes(lenghts(iteratorOf(files))));
       
        
    }

    private static <T> Iterator<T> iteratorOf(T[] items) {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < items.length;
            }

            @Override
            public T next() {
                return items[index++];
            }
        };
    }

    private static Iterator<Long> lenghts(Iterator<File> iteratorOf) {
        return new Iterator<Long>() {
            @Override
            public boolean hasNext() {
                return iteratorOf.hasNext();
            }

            @Override
            public Long next() {
                return iteratorOf.next().length();
            }
        };
    }

    private static Iterator<Long> megabytes(Iterator<Long> lenghts) {
        return new Iterator<Long>() {
            @Override
            public boolean hasNext() {
                return lenghts.hasNext();
            }

            @Override
            public Long next() {
                return (lenghts.next() / (1024*1024));
            }
        };
    }
              
    
}
