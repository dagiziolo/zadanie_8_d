public class ArrayTest {
    public static void main(String[] args) {
        int[][] array1 = new int[2][1];
        int[][] array2 = new int[2][2];

        array1[0] = new int[]{1};
        array1[1] = new int[]{3,4};
        array2[0] = new int[]{1,2};
        array2[1] = new int[]{3,4};

        System.out.println(ArrayComparator.compare(array1, array2));
    }
}
