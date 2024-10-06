package genegic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox objectBox = new ObjectBox();
        objectBox.set(10);

        Integer integer = (Integer) objectBox.get(); // control + t

        System.out.println("integer = " + integer);


    }
}
