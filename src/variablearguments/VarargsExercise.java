package variablearguments;

// import java.util.Arrays;

public class VarargsExercise {

    public void displayList(int... arr) {
        System.out.println("Display the Values");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public void maxOfList(int... arr) {
        System.out.println("Find the Max element");
        int maxi = -1;
        for (int val : arr) {
            maxi = Math.max(val, maxi);
        }
        System.out.println("Max Element " + maxi);
    }

    public void sortList(int... arr) {

        System.out.println("Sorted elements");
        // for(int val : arr)
        System.out.println();
    }

    public void averageList(int... arr) {
        int sum = 0;
        System.out.println("Average of Array");
        for (int val : arr) {
            sum += val;
        }
        System.out.println(sum / arr.length);
    }

    public static void main(String[] args) {
        VarargsExercise varargsExercise1 = new VarargsExercise();
        varargsExercise1.displayList(11, 7, 2, 4, 9, 8);
        varargsExercise1.maxOfList(11, 7, 2, 4, 9, 8);
        varargsExercise1.sortList(11, 7, 2, 4, 9, 8);
        varargsExercise1.averageList(11, 7, 2, 4, 9, 8);
    }
}
