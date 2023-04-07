/**
 * sorts
 */

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class sorts {

    static int rand() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 9);
        return randomNum;
    }
    
    public static void main(String[] args) {
        int[] randArr = {rand(), rand(), rand(), rand(), rand(), rand(), rand(), rand(), rand()};
        for (int i : randArr) {
            System.out.println(i);
        }
        System.out.println("\n");
        selectionSort(randArr);
        for(int i = 0; i < randArr.length; i++){
            System.out.print(randArr[i] + "\n");
        }
        System.out.println("\n");
        int[] randArr2 = {rand(), rand(), rand(), rand(), rand(), rand(), rand(), rand(), rand()};
        int[] result = mergeSort(randArr2);
        for(int i = 0; i < result.length; i++){
            System.out.print(randArr[i] + "\n");
        }
    }

    static void selectionSort(int[] sortArr) {
        for (int i = 0; i < sortArr.length; i++) {
            int pos = i;
            int min = sortArr[i];
            for (int j = i + 1; j < sortArr.length; j++) {
                if (sortArr[j] < min) {
                    pos = j;
                    min = sortArr[j];
                }
            }
            sortArr[pos] = sortArr[i];
            sortArr[i] = min;
        }
    }

    public static int[] mergeSort(int[] sortArr) {
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}