package com.company.les1;

/*Реализуйте класс GenericStack, имплементирующий Stack,
а также реализуйте класс StackException extends Exception*/

public class Main {
    public static void main(String[] args) throws StackException{
        Stack<String> strStack = new GenericStack<>(10);
        for (int i = 0; i < 10 ; i++){
            strStack.push("elem " + i);
        }
        while (strStack.getSize()>0){
            System.out.println(strStack.peek());
        }
    }
}
