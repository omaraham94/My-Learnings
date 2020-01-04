package banking;

import javax.xml.bind.attachment.AttachmentMarshaller;
import java.util.Arrays;
import java.util.Scanner;

public class Array{
    public static int[] sort(int[] a1) {
        int[] sortedArray = a1.clone();
        for(int i=0;i<a1.length;i++) {
            for(int j=0;j<a1.length;j++) {
                if (sortedArray[i] > sortedArray[j]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }

    public static int[] insertionSort (int[] a1) {
        int[] sortedArray = a1.clone();
        if (a1 == sortedArray) {
            System.out.println("same instance");
        } else {
            System.out.println("diferent instance");
        }
        if (a1.equals(sortedArray)) {
            System.out.println("but they are equal inside");
        }
        for(int i=1;i<a1.length;i++) {
            int j=i;
            while((j >0 ) && (sortedArray[j-1] > sortedArray[j])) {
                int temp = sortedArray[j-1];
                sortedArray[j-1] = sortedArray[j];
                sortedArray[j] = temp;
                j--;
            }
        }
        return sortedArray;
    }
    public static void main(String[] args) {
        int[] a1 = {106,26,81,5,15};
        int[] sortedArray = sort(a1);
        for (int temp :sortedArray
             ) {
            System.out.println(temp);
        }
        for (int temp : a1) {
            System.out.println(temp);
        }
        sortedArray = insertionSort(a1);
        System.out.println("insertion sort output");
        for(int i =0; i<a1.length;i++) {
            System.out.println(sortedArray[i]);
        }
}
}