package exercise.generics;

import java.util.ArrayList;

public class MyStackDemo {
    public static void main(String[] args) {
        MyStack<String> stackStr = new MyStack<>();

        System.out.println(stackStr.isEmpty());
        stackStr.push("a");
        stackStr.push("b");
        stackStr.push("c");


        System.out.println(stackStr.pop()); // remove도 포함
        System.out.println(stackStr.peek()); // 제일 끝 요소 무엇인지

        System.out.println(stackStr.isEmpty());

        stackStr.printElements();
    }
}

class MyStack<T> {

    ArrayList<T> arrayList = new ArrayList<>();
    void push(T data) {
        arrayList.add(data);
    }

    boolean isEmpty() {
        return arrayList.isEmpty();
    }

    T peek() {
        return arrayList.get(arrayList.size()-1);
    }

    T pop() {
        return arrayList.remove(arrayList.size()-1);
    }

    void printElements() {
        for (int i=0; i<arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}