package application;

import entities.contribuinte;
import entities.pessoaFisica;
import entities.pessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<contribuinte> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i=1; i<=n; i++){
            System.out.println("Tax payer #" + i + " data");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            double income = sc.nextDouble();
            if (ch == 'i'){
                System.out.print("Health expenditures: ");
                double heathExpenditures = sc.nextDouble();
                list.add(new pessoaFisica(name,income,heathExpenditures));
            } else {
                System.out.print("Number of employess: ");
                int employess = sc.nextInt();
                list.add(new pessoaJuridica(name,income,employess));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (contribuinte cont : list) {
            double tax = cont.imposto();
            System.out.println(cont.getNome() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
        sc.close();
    }
}
