package com.diogo_rocha.ra3448693;

import java.util.Scanner;

public class AppHandler {


    private Scanner s;

    private UIHelper helper;

    public AppHandler() {
        s = new Scanner(System.in);
        helper = new UIHelper(s);
    }

    public void WriteMenu(){

        helper.WriteLine("Bem vindo!");
        helper.WriteLine("Selecione uma opção para prosseguir.");
        helper.WriteLine("");
        helper.WriteLine("1 - Insert Sort");
        helper.WriteLine("2 - Swap Position");
        helper.WriteLine("0 - Sair");

        DecisionHandler();
    }

    private void DecisionHandler(){

        String decision = s.nextLine();

        while (!helper.tryParseInt(decision)){
            helper.WriteLine("Seleção incorreta, tente novamente");
            decision = s.nextLine();
        }

        switch (Integer.parseInt(decision)){
            case 1:
                FluxoInsertSort fluxoInsert = new FluxoInsertSort(helper);
                fluxoInsert.InsertSortHandler();
                break;

            case 2:
                FluxoSwapPosition fluxoSwap = new FluxoSwapPosition(helper);
                fluxoSwap.SwapPositionHandler();
                break;

            case 0:
                helper.Finalizar();
                break;

            default:
                helper.WriteLine("Seleção incorreta, tente novamente");
                WriteMenu();
                break;
        }

        helper.EraseConsole();
        WriteMenu();
    }





}
