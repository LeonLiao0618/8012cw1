import java.util.ArrayList;


    public class SortedArraylist<E> extends ArrayList<E> {

        public static <E extends Comparable<? super E>> void selectionSort(ArrayList<E> a) {

            E temp;
            int minIndex;
            for (int j = 0; j < a.size() - 1; j++) {
                minIndex = j;
                for (int k = j + 1; k < a.size(); k++) {
                    if (a.get(k).compareTo(a.get(minIndex)) < 0) {
                        minIndex = k;
                    }
                }
                temp = (E) a.get(minIndex);
                a.set(minIndex, a.get(j));
                a.set(j, (E) temp);
            }
        }

    }

