package com.diogo_rocha.ra3448693;

import java.util.Scanner;

public class UIHelper {

    public Scanner s;

    public UIHelper(Scanner _s) {
        s = _s;
    }


    public void Finalizar(){
        System.exit(0);
    }
    public void WriteLine(String line){
        System.out.println(line );
    }

    public void EraseConsole(){
        for (int i = 0;i <= 5000;i++){
            WriteLine("\n");
        }
    }

    public boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public Integer[] IntegerArrayMaker(){

        WriteLine("Digite o tamanho do array que deseja criar.");
        String input = s.nextLine();

        while (!tryParseInt(input)) {
            WriteLine("Entrada incorreta, tente novamente");
            input = s.nextLine();
        }

        int arraySize = Integer.parseInt(input);

        Integer array[] = new Integer[arraySize];

        for (int arrIndex = 0; arrIndex < arraySize ; arrIndex++){

            WriteLine("Digite o numero da posição " + arrIndex);

            input = s.nextLine();

            while (!tryParseInt(input)) {

                WriteLine("Entrada incorreta, tente novamente");

                input = s.nextLine();
            }

            array[arrIndex] = Integer.parseInt(input);
        }
        return array;
    }


    public String[] StringArrayMaker(){

        WriteLine("Digite o tamanho do array que deseja criar.");
        String input = s.nextLine();

        while (!tryParseInt(input)) {
            WriteLine("Entrada incorreta, tente novamente");
            input = s.nextLine();
        }

        int arraySize = Integer.parseInt(input);

        String array[] = new String[arraySize];


        for (int arrIndex = 0; arrIndex < arraySize ; arrIndex++){

            WriteLine("Digite o valor para a posição " + arrIndex);

            input = s.nextLine();

            array[arrIndex] = input;
        }

        return array;
    }
}
