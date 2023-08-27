/*(Part (1) of the assignment. User runs program via (Main), and is presented 
 * with interger index, double index and string index with the values provided.
 * If a value that is not found, a -1 will be thrown. Code is not perfect,
 * but may be on the right track with the overall parameters of the assignment. 
 * 
 */
public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {2, 4, 6, 8};
        int intIndex = ArraySearch.search(intArray, 6);
        System.out.println("Integer index: " + intIndex); 
        
        Double[] doubleArray = {1.1, 2.2, 3.3};
        int doubleIndex = ArraySearch.search(doubleArray, 2.2);
        System.out.println("Double index: " + doubleIndex); 
        
        String[] stringArray = {"test1", "test2", "test3"};
        int stringIndex = ArraySearch.search(stringArray, "test3");
        System.out.println("String index: " + stringIndex); 
    }
}