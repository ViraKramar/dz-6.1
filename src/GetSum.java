public class GetSum {
    public int getSum(){

        int[] numbers = new int[]{10, 15, 59, 20, 2, 111, 44, 12};
        int[] even = new int[numbers.length];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even[i] = numbers[i];
            }
        }
        for (int element : even)
            sum += element;
        System.out.println(sum);
        return sum;
    }
}
