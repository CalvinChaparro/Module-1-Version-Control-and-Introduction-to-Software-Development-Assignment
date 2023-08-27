/*(Part (1) of the assignment. User runs program via (Main), and is presented 
 * with interger index, double index and string index with the values provided.
 * If a value that is not found, a -1 will be thrown. Code is not perfect,
 * but may be on the right track with the overall parameters of the assignment. 
 * 
 */
public class ArraySearch {
    public static <T> int search(T[] arr, T value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)) {
                return i;
            }
        }
        return -1; // if value not found, return user with -1
    }
}