package basics;

public class Human {
    String name;
    int age;
    double height;

     Human(String name, int age, double height){
         this.name = name;
         this.age = age;
         this.height = height;
     }

     void eat(){
         System.out.println(this.name + " is eating");

     }

     void talk(){
         System.out.println("please " + this.name + " i'm not in the mood to talk");

     }
}
