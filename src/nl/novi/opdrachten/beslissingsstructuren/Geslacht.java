package nl.novi.opdrachten.beslissingsstructuren;

import java.util.Locale;
import java.util.Scanner;

public class Geslacht {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("Wat is uw geslacht?");
        String geslacht = userInputScanner.nextLine();
String a = "Dag meneer";
String b = "Dag mevrouw";
String c = "Dag persoon";
        if (geslacht.equals("man")) {
            System.out.println(a.toUpperCase());
        } else if (geslacht.equalsIgnoreCase("vrouw")) {
            System.out.println(b.toUpperCase());
        } else {
            System.out.println(c.toUpperCase());
        }
    }
}

/*
        Hier boven heeft de gebruiker zijn geslacht ingevoerd. Print met behulp van een beslissingsstructuur (if/else)
        de volgende berichten:
        Wanneer de gebruiker een 'man' is: "Dag meneer."
        Wanneer de gebruiker een 'vrouw' is": "Dag mevrouw."
        In alle andere gevallen: "Dag persoon."

        Bonus: Lukt het je om de code zo te maken dat hoofdletters genegeerd worden?
         */