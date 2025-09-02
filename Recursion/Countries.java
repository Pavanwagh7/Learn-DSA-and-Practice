package Recursion;
//How Recursion works
public class Countries {
    public static void main(String[] args){
        india();//is called by main()
    }
    static void india(){
        System.out.println("india is called");
        united_states();//is called by india()
        System.out.println("now in india");
    }
    static void united_states(){
        System.out.println("united_stated is called");
        england();//is called by united_states()
        System.out.println("now in united_states");
    }
    static void england(){
        System.out.println("england is called");
        france();//is called by england()
        System.out.println("now in england");
    }
    static void france(){
        System.out.println("france is called");
        russia();//is called by france()
        System.out.println("now in france");
    }
    static void russia(){
        System.out.println("russia is called");
        japan();//is called by russia()
        System.out.println("now in russia");
    }
    static void japan(){
        System.out.println("japan is called ,currently in japan");
    }
}