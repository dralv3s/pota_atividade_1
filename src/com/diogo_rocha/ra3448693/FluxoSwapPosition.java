package com.diogo_rocha.ra3448693;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FluxoSwapPosition {

    private UIHelper helper;

    public FluxoSwapPosition(UIHelper _helper){
        helper = _helper;
    }



    /*

      ArrayList<String>  mylist =
                        new ArrayList<String>();


        System.out.println("Original List : \n" + mylist);

        // Swap items at indexes 1 and 2
        Collections.swap(mylist, 1, 2);

        System.out.println("\nAfter swap(mylist, 1, 2) : \n"
                           + mylist);

        // Swap items at indexes 1 and 3
        Collections.swap(mylist, 3, 1);

        System.out.println("\nAfter swap(mylist, 3, 1) : \n"
                           + mylist);


                           */

    public void SwapPositionHandler(){
        SwapPosition(helper.StringArrayMaker());
    }

    private void PrintArray(String arr[]){

        for(int j = 0; j < arr.length; j++){
            helper.WriteLine(j + " - Posição numero " + j + " = " + arr[j].toString());
        }
    }

    public void SwapPosition(String arr[]){

        helper.WriteLine("Digite os numeros que deseja trocar");

        helper.EraseConsole();
        PrintArray(arr);

        helper.WriteLine("Digite a posição do primero valor");

        Integer pos[] = new Integer[2];

        String input = helper.s.nextLine();

        while (!helper.tryParseInt(input) || (Integer.parseInt(input) < 0 || Integer.parseInt(input) > arr.length)){
            helper.WriteLine("Entrada incorreta, tente novamente");
            PrintArray(arr);
            input = helper.s.nextLine();
        }

        pos[0] = Integer.parseInt(input);

        helper.EraseConsole();
        helper.WriteLine("Digite a posição do segundo valor");

        input = helper.s.nextLine();

        while (!helper.tryParseInt(input) || (Integer.parseInt(input) < 0 || Integer.parseInt(input) > arr.length)){
            helper.WriteLine("Entrada incorreta, tente novamente");
            PrintArray(arr);
            input = helper.s.nextLine();
        }

        pos[1] = Integer.parseInt(input);

        helper.EraseConsole();

        helper.WriteLine("Array original:");

        for(int i = 0; i < arr.length; i++){
            helper.WriteLine(arr[i].toString());
        }

        Collections.swap(Arrays.asList(arr), pos[0], pos[1]);

        helper.WriteLine("");
        helper.WriteLine("Array com posições trocadas :");

        for(int j = 0; j < arr.length; j++){
            helper.WriteLine(arr[j].toString());
        }

        helper.WriteLine("Digite 1 para trocar outra posição, ou aperte enter para sair.");

        input = helper.s.nextLine();

        if (input.matches("1")){
            SwapPosition(arr);
        }else{

            helper.s.nextLine();
        }
    }
}
