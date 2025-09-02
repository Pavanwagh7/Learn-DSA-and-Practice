package Recursion;

//How Recursion Works
public class Main1 {
    public static void main(String[] args) {
        india();
        System.out.println("leaving main,execution ended");
    }
    static void india(){
        System.out.println("india is called");
        australia();//calling aus
        System.out.println("leaving india,execution ended");
    }
    static void australia(){
        System.out.println("australia is called");
        england();//calling england
        System.out.println("leaving australia,execution ended");
    }
    static void england(){
        System.out.println("england is called");
        germany();//calling germany
        System.out.println("leaving england,execution ended");
    }
    static void germany(){
        System.out.println("germany is called");
        america();//calling america
        System.out.println("leaving germany,execution ended");
    }
    static void america(){
        System.out.println("america is called");
        System.out.println("leaving america,execution ended");
    }
}