public class Main {
    public static void main(String[] args) {
        showItemsReverted(new int[] {3,2,1});
    }
    public static void showItemsReverted (int[] array) {
        if (array.length == 0) {
            System.out.println("array is empty");
        } else {
            for (int i = array.length -1; i >= 0; i --) {
                System.out.println(array[i]);
            }
        }
    }
}