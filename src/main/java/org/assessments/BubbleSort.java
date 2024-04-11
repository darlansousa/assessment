package org.assessments;

public class BubbleSort {

    public static void sort(int[] v) {
        for(int i = 0; i < v.length - 1; i++) {
            boolean isFinished = true;
            for(int j = 0; j < v.length - 1 - i; j++) {
                if(v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                    isFinished = false;
                }
            }
            if(isFinished)
                break;
        }
    }

}
