public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {7, 8, 9, 10, 11};
        int [] arr3 = new int[arr1.length+ arr2.length];
        System.out.print("Array 1: ");
        for (int i = 0; i < arr1.length ; i++) {
            arr3[i] = arr1[i];
            System.out.print("\t");
            System.out.print(arr1[i]);
        }
        System.out.print("\n");
        System.out.print("Array 2: ");
        for (int i = arr1.length; i < arr1.length + arr2.length ; i++) {
            arr3[i] = arr2[i- arr1.length];
            System.out.print("\t");
            System.out.print(arr2[i- arr1.length]);
        }
        System.out.print("\n");
        System.out.print("Array 3: ");
        for (int j : arr3) {
            System.out.print("\t");
            System.out.print(j);
        }
    }
}