/*Задача 2. Реализация стека
Реализуйте MyStack с использованием LinkedList с методами:
● push(String element) - добавляет элемент на вершину стека
● pop() - возвращает элемент с вершины и удаляет его
● peek() - возвращает элемент с вершины, не удаляя
● getElements() - возвращает все элементы стека
*/

import java.util.LinkedList;

public class DZ4_2 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("apple");
        myStack.push("banana");
        myStack.push("pear");
        myStack.push("grape");
        myStack.push("1");

        System.out.println(myStack.getElements());
        System.out.println(myStack.pop());
        System.out.println(myStack.getElements());
        System.out.println(myStack.peek());
        System.out.println(myStack.getElements());
    }


    public static class MyStack {
        private LinkedList<String> stack = new LinkedList<>();
        public void push(String a) {
            stack.addFirst(a);
            }
        public String pop() {
            return stack.removeFirst();
            }
        public String peek() {
            return stack.peekFirst();
            }
        public String getElements() {
            return stack.toString();
            }
    }
}
