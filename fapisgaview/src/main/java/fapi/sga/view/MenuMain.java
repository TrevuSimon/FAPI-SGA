package fapi.sga.view;

import fapi.sga.view.aluno.MenuAluno;
import fapi.sga.view.sala.MenuSala;
import fapi.sga.view.turma.MenuTurma;

import java.util.Scanner;

public class MenuMain implements Menu{
    public void menu(){
        int escolha = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("1 - Cadastrar aluno.");
            System.out.println("2 - Atualizar aluno.");
            System.out.println("3 - Listar aluno.");
            escolha = scanner.nextInt();
            Menu menu;
            switch (escolha) {
                case 1:
                    menu = new MenuAluno();
                    menu.menu();
                    break;
                case 2:
                    menu = new MenuSala();
                    menu.menu();
                    break;
                case 3:
                    menu = new MenuTurma();
                    menu.menu();
                    break;
                default:

            }
        }while(escolha != 0);
    }
}
