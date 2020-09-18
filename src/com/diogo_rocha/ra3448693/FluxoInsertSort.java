package com.diogo_rocha.ra3448693;

import java.util.Scanner;

public class FluxoInsertSort {

    private UIHelper helper;

    public FluxoInsertSort(UIHelper _helper){
        helper = _helper;
    }

    public void InsertSortHandler(){

        Integer arr[] =  helper.IntegerArrayMaker();

        helper.WriteLine("Array original:");

        for(int i = 0; i < arr.length; i++){
            helper.WriteLine(arr[i].toString());
        }


        InsertSort(arr);
        helper.WriteLine("");
        helper.WriteLine("Array ordenado:");

        for(int j = 0; j < arr.length; j++){
            helper.WriteLine(arr[j].toString());
        }

        helper.WriteLine("");
        helper.WriteLine("Precione enter para continuar...");
        helper.s.nextLine();
    }

    private void InsertSort(Integer array[]){

        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }
}
