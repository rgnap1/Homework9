import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int value : arr){
            sum += value;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        int min = arr[0];
        for (int i = 0; i < arr.length;i++){
            if ( min>arr[i])
                min = arr[i];
        }
        System.out.println("Минимальная сумма затрат за день " + min + " рублей");

        int max = arr[0];
        for (int i = 0; i < arr.length;i++){
            if ( max < arr[i])
                max = arr[i];
        }
        System.out.println("Максимальная сумма затрат за день " + max + " рублей");


        double average = 0;
        for (int i = 0; i < arr.length;i++){
            average += arr[i]/arr.length;
        }
        System.out.println("Средняя сумма трат за месяц " + average + " рублей");


        //option2
        System.out.println();
        int sum2 = Arrays.stream(arr).sum();
        System.out.println("Сумма трат за месяц составила " + sum2 + " рублей");
        int min2 = Arrays.stream(arr).min().getAsInt();
        System.out.println("Минимальная сумма трат за день составила " + min2 + " рублей");
        int max2 = Arrays.stream(arr).max().getAsInt();
        System.out.println("Максимальная сумма трат за день составила " + max2 + " рублей");
        double average2 = Arrays.stream(arr).average().getAsDouble();
        System.out.println("Средняя сумма трат за месяц составила " + average2 + " рублей");
        System.out.println();

        char [] reverseFullName = {'n','a','v','I', ' ', 'v','o','n','a','v','I'};
        for (int i =reverseFullName.length-1; i>=0; i-- ){
            System.out.print(reverseFullName[i]);
        }

    }

    public static int[] generateRandomArray() {
        Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            System.out.println(arr[i]);

        }
        return arr;


    }

}


