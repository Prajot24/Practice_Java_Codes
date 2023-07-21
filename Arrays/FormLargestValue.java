package Arrays;

public class FormLargestValue {
    public static void main(String[] args) {
        int[] arr = {54, 546, 548, 60};
        int t = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                String ij = String.valueOf(arr[i]) + String.valueOf(arr[j]);
                String ji = String.valueOf(arr[j]) + String.valueOf(arr[i]);

                // System.out.println("ij: " + ij);
                // System.out.println("ji: " + ji);
                if (Integer.parseInt(ji) > Integer.parseInt(ij)) {

                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }

            }

        }
        String res = "";

        for (int i = 0; i < arr.length; i++) {

         res =res+ String.valueOf(arr[i]);
        }

        System.out.print(res);
    }

}
