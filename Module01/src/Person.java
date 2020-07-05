/**
 * @author lilibo
 * @create 2020-07-04 8:24 PM
 */
public class Person {
    public static void main(String[] args){
        printPerson("i am person");
    }

    private static void printPerson(String s) {
        System.out.println(s);
    }

    public void eat(){
        printPerson("eat");
    }
}
