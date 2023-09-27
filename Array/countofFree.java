public class countofFree {
    public static void main(String[] args) {
        
        int[] arr = { 1, 3, 2, 1, 4, 1, 4,4};
        int count = 0;
        int value = 0;
        int fre = 0;

        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }

            if (count > fre) {
                fre = count;
                value = arr[i];
            }

        }

        System.out.println(fre + "   " + value);

    }
    
}
