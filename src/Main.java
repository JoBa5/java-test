public class Main {
    public static void main(String[] args) {
//        int liczba = 5;
//        int liczba2 = 2;
//        System.out.println("Hello word" + liczba);
//
//
//        System.out.println(liczba % liczba2);
//
//        String name = " Asia";
//        int age = 27;
//        System.out.println("My name is" + name + " and I have " + age + " years old.");
//

        String account = " JoannaBaldyga ";
        account.length();
        System.out.println(account.length());

        System.out.println(account.indexOf('a'));

        System.out.println(account.substring(1,6));

        System.out.println(account.trim());

        System.out.println(account.length());

        char a = 'a';
        char alpha = '\u03B1';
        System.out.println(alpha);

        char[] witaj = {'w', 'i', 't', 'a', 'j'};
        System.out.println(witaj);
        Character.isDigit(a);
        System.out.println(Character.isDigit(a));


    }
}
