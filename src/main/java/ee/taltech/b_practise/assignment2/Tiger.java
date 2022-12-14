package ee.taltech.b_practise.assignment2;

import java.util.Objects;

public class Tiger {

    //todo A add 2 instance fields to this class of different(!) Java types
    //todo B add a constructor which initializes both of the fields
    //todo C add 2 instance methods to this class (other than getters or setters)

    String name;
    int age;

    public Tiger(String name, int age){

        this.name = name;
        this.age = age;
    }

    public void talk(){

        System.out.println("Roar!");
    }

    public void action(String mood){

        if(Objects.equals(mood, "happy")){
            System.out.println("Action: " + "play");
        }
        else if(Objects.equals(mood, "angry")){
            System.out.println("Action: " + "bite");
        }
        else if(Objects.equals(mood, "sad")){
            System.out.println("Action: " + "cry");
        }
        else{
            System.out.println("Action: " + "sleep");
        }
    }

    public static void main(String[] args) {
        //todo D create a new instance of this class (Tiger)

        Tiger tiger = new Tiger("Bambi", 5);

        //todo E call 2 of your newly created methods

        tiger.talk();
        tiger.action("happy");

    }
}
