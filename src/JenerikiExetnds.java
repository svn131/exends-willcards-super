import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class JenerikiExetnds {

    public static void main(String[] args) {

        List<? extends Cat> listCat = new  ArrayList<>();
        List<? super Dog> listDog = new  ArrayList<>();

        PesytskyiKot pesytskyiKot = new PesytskyiKot();
        Taksa taksa = new Taksa();

        Cat cat = new Cat();
        Dog dog = new Dog();

        Animal animal = new Animal();

        Object o = new Object();




//        listCat.add(new Cat()); //@todo  так записать в классе нельзя в коллекцию- можно только пометить параметры возращаемого значенмя в методе-ниже

//        List<PesytskyiKot> newListCatp = new ArrayList<>(metod(pesytskyiKot));
        List<Cat> newListCat = new ArrayList<>(metod(pesytskyiKot));
///////////////


//        listDog.add(o);
//        listDog.add(animal);
        listDog.add(dog);
        listDog.add(taksa);


//        listCat.add(cat);
//        listCat.add(animal);
//        listCat.add(o);
//        listCat.add(pesytskyiKot);





    }


    public static  List<? super Dog> getDogList(Object o) {

        if (o.getClass() == Dog.class) {
            List<Dog> list = new ArrayList<>();
            list.add(new Dog());
            return list;
        } else if((o.getClass() == Animal.class)){
            List<Animal> listAnimal = new ArrayList<>();
            listAnimal.add(new Animal());
            return listAnimal;
        }else{
            List<Object> listObj = new ArrayList<>();
            listObj.add(new Object());
            return listObj;
        }

    }


    static List<? extends Cat> metod(Object o) {

        if(o.getClass() == Cat.class){
           Cat cat = new Cat();
            List<Cat> listCat = new  ArrayList<>();
           listCat.add(cat);
           return listCat;

        }
        else {
            PesytskyiKot pesytskyiKot = new PesytskyiKot();
            List<PesytskyiKot> listPersitskyiCat = new ArrayList<>();
            listPersitskyiCat.add(pesytskyiKot);

            return listPersitskyiCat;
        }
    }

    ////
    public static void printExtendsCats(List<? extends Cat> cats) {

        for (Object obj : cats) {
            System.out.println(obj);
        }

        for (Animal animal : cats) {
            System.out.println(animal);
        }

        for (Cat cat : cats) {
            System.out.println(cat);
        }

        List<? extends Cat> listCat = cats;
//
//        cats.add(new Cat());
//        cats.add(new Animal());
//        cats.add(new PesytskyiKot());
//        cats.add(new Object());
//        List< Cat> listCat = cats;
//        List<Animal> listCat = cats;
//        List<PesytskyiKot> listCat = cats;
//
//        for (PesytskyiKot cat : cats) {
//            System.out.println(cat);
//        }

        Cat cat1 = cats.get(0);
        Animal animal1 = cats.get(0);
        Object  obj1 = cats.get(0);
//        PesytskyiKot cat2 = cats.get(0);

    }


    public static void addDog(List<? super Dog> dogs) {
        dogs.add(new Taksa());
        dogs.add(new Dog());
//        dogs.add(new Animal());
//        dogs.add(new Object());
//
//        List< Dog> listCat = dogs;
//        List<Animal> listCat = dogs;
//        List<Taksa> listCat = dogs;
        List<? super Dog> listCat = dogs;

//        Taksa  taksa1 = dogs.get(0);
//        Dog dog1 = dogs.get(0);
//        Animal animal1 = dogs.get(0);
//        Object  obj1 = dogs.get(0);

//        for (Dog dog : dogs) {
//            System.out.println(dog);
//        }
//        for (Animal animal : dogs) {
//            System.out.println(animal);
//        }
//        for (Taksa taksa : dogs) {
//            System.out.println(taksa);
//        }
        for (Object obj : dogs) {
            System.out.println(obj);
        }



    }

    ////////////




    class ClassExtendsCat<T extends Cat> {
        private List<? extends T> cats;

        public ClassExtendsCat(List<? extends T> cats) {
            this.cats = cats;
        }

        public void printCats() {
            for (T cat : cats) {
                System.out.println(cat);
            }
        }
    }

//    class ClassSuperDogt<T super Dog> {
//         List<? super T> dogs;
//
//        public ClassExtendsCat(List<? super T> dogs) {
//            this.dogs = dogs;
//        }
//
//        public void printCats() {
//            for (T dog : dogs) {
//                System.out.println(dog);
//            }
//        }
//    }


    static class Animal{ }

  static   class Dog extends Animal{ }
   static class Cat extends Animal{ }

  static   class Taksa extends Dog{}

  static class PesytskyiKot extends Cat{}
}


