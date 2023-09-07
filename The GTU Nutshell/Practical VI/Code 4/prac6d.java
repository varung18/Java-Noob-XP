/*
Define MYPriorityQueue class that extends Priority Queue
to implement the Cloneable interface and implement the
clone() method to clone a priority queue.
 */

import java.util.PriorityQueue;

public class prac6d {
    public static void main(String[] args) {
        System.out.println("Varun Gaur, 210410107077, 21BECEG102, SY CE 2B, 2022-23");
        MyPriorityQueue<Integer> myq = new MyPriorityQueue<Integer>();
        myq.add(5);
        myq.add(0);
        myq.add(4);
        try {
            MyPriorityQueue<Integer> myq2 = myq.clone();
            for (Integer num : myq2) {
                System.out.println(num);
            }
        } catch (CloneNotSupportedException e) {
            System.out.println("Couln't clone succesfully");
        }
    }
}

class MyPriorityQueue<T> extends PriorityQueue<T> implements Cloneable {
    @Override
    public MyPriorityQueue<T> clone() throws CloneNotSupportedException {
        MyPriorityQueue<T> mq = new MyPriorityQueue<T>();
        for (T iterable_element : this) {
            mq.add(iterable_element);
        }
        return mq;
    }
}