package org.xiatian.practice.multiThread;

public class abc {
    public static void main(String[] args) {
        //循环打印abc
        Thread task1 = new Thread(new Task(0));
        Thread task2 = new Thread(new Task(1));
        Thread task3 = new Thread(new Task(2));
        task1.start();
        task2.start();
        task3.start();
    }
}
class Task implements Runnable{
    public static volatile int count = 0;
    private int k = 1;
    Task(int k){
        this.k = k;
    }
    @Override
    public void run() {
        while(true){
            if(count%3==k){
                if(k==0)
                    System.out.println("Thread"+(k+1)+":a");
                if(k==1)
                    System.out.println("Thread"+(k+1)+":b");
                if(k==2)
                    System.out.println("Thread"+(k+1)+":c");
                count+=1;
            }
        }
    }
}
