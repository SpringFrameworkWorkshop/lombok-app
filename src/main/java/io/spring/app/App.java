package io.spring.app;

import io.spring.lombok.*;

public class App {

    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
        example7();
    }

    private static void example1() {
        print("example1");
        LombokExample1 ex1 = new LombokExample1(10,"test",false);
        System.out.println(ex1.getSentence());
    }

    private static void example2() {
        print("example2");
        LombokExample2 ex2 = new LombokExample2(10,"test",false);
        ex2.setValue(true);
        System.out.println(ex2.getSentence());
    }

    private static void example3() {
        print("example3");
        //AllArgsConstructor
        LombokExample3 ex3a = new LombokExample3("sen",true,"as");
        //RequiredArgsConstructor
        LombokExample3 ex3b = new LombokExample3("sen");
    }

    private static void example4() {
        print("example4");
        //AllArgsConstructor
        LombokExample4 ex4a = new LombokExample4("sen",true,"as");
        System.out.println(ex4a); //LombokExample4(sentence=sen, isValue=true)
        //AllArgsConstructor
        LombokExample4 ex4b = new LombokExample4("sen",true,"as");
        System.out.println(ex4a.equals(ex4b)); //true
        //NoArgsConstructor
        LombokExample4 ex4c = new LombokExample4();
        System.out.println(ex4c);
    }

    private static void example5() {
        print("example5");
        //Builder
        LombokExample5 ex5 = LombokExample5.builder().isValue(true).sentence("asdf").val("asd").build();
        System.out.println(ex5.equals(ex5));
    }

    private static void example6() {
        print("example6");
        //Now if you run this example you will be able to see logs
        LombokExample6 ex6 = new LombokExample6();
        ex6.tryIt();
    }

    private static void example7() {
        print("example7");
        LombokExample7 ex7 = new LombokExample7();
        System.out.println(ex7.resourceAsString());
    }


    private static void print(final String example) {
        System.out.println(example+" ---------------------------------------------------- #");
    }
}
