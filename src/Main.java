// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(args.length);
        Abc abc = new Abc();
        System.out.println(abc.member);

        System.out.println(Abc.flag);
    }
}

/*
 OOP: class is an encapsulation of it member variables and member function that could be accessed upon class instantiation
 */
class Abc {
    int member = 100;
    static int flag = 0;

    public int sum(int x, int y){
        return x+y;
    }
}