import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int liczba = 5;
//        int liczba2 = 2;
////        System.out.println("Hello word" + liczba);
////
////
////        System.out.println(liczba % liczba2);
////
////        String name = " Asia";
////        int age = 27;
////        System.out.println("My name is" + name + " and I have " + age + " years old.");
////
//
//        String account = " JoannaBaldyga ";
//        account.length();
//        System.out.println(account.length());
//
//        System.out.println(account.indexOf('a'));
//
//        System.out.println(account.substring(1,6));
//
//        System.out.println(account.trim());
//
//        System.out.println(account.length());
//
//        char a = 'a';
//        char alpha = '\u03B1';
//        System.out.println(alpha);
//
//        char[] witaj = {'w', 'i', 't', 'a', 'j'};
//        System.out.println(witaj);
//        Character.isDigit(a);
//        System.out.println(Character.isDigit(a));
//
//        if (liczba>liczba2 & liczba2==liczba){
//            System.out.println("SystemDziala");
//        }else{
//            System.out.println("SystemNieDziala");
//            if (liczba==liczba2){
//                System.out.println("SystemDziala1");
//            }
//        }
//
//        Scanner skaner = new Scanner(System.in);
//        System.out.println("Wpisz swoje imie");
//        String userInputName = skaner.nextLine();
//        System.out.println("Wpisz swoje nazwisko");
//        String userInputSurname = skaner.nextLine();
//        System.out.println("Witaj" + userInputName + " " + userInputSurname + "!");
//
//        int number = 3;
//        int number2;
//        System.out.println(number++);
//        System.out.println(++number);
//        System.out.println(number);
//        number2 = number++;
//        System.out.println(number2);
//        number2 = ++number;
//        System.out.println(number2);
//        System.out.println(++number2);
//

        String[] nameTable = new String[4];
        String[] nameTableBio = {"Kasia", "Tomasz", "Joanna", "Anna"};
        for(int i = 0; i < nameTableBio.length; i++){
            nameTable[i]=nameTableBio[i];
            System.out.println(nameTable[i]);
        }


    }
}
