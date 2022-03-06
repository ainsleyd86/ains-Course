package task.Flowchart;

public class Flowchart {

    public static void main (String[] args) {

        System.out.println(methodOne(10, 2, true));

    }

    public static int methodOne(int a, int b, boolean bool) {
       //int before method one refers to what the method will return ie sum which is an INt
        // int in brackets is a parameter
        if (bool == true) {
            int sum = a + b;
            return sum;
        }else {
            int sum = a * b;
            return sum;

            }
        }




}
