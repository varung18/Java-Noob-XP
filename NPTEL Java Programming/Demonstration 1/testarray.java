public class testarray {
    public static void main (String[] args) {
        System.out.println("The Program begins as follows: ");
        
        int arr[] = {12, 7, 3, 9, 18, 22, 59};
        for (int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + "   ");
        }
        System.out.println();

        float sum = 0, avg;
        for (int i = 0; i<arr.length; i++) {
            sum += arr[i];
        }
        avg = sum/arr.length;
        System.out.println("The average value of this array is: " + avg);
    }
}
