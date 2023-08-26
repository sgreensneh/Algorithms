package deserialization;

import serialization.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example {
    public static void main(String[] args) {
      try{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\sgreen\\IdeaProjects\\javaProjects\\Dog"));
        var dog = (Dog)objectInputStream.readObject();
          System.out.println(dog);
    } catch (IOException | SecurityException | ClassNotFoundException e){
          e.printStackTrace();
      }
    }
}
