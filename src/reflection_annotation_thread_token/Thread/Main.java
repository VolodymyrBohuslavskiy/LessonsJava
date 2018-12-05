package reflection_annotation_thread_token.Thread;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        System.out.println("START");
//
//        Thread thread1 = new Thread(() -> System.out.println("POINT"));
//        thread1.start();
//
//        System.out.println("FINISH");

        System.out.println("Sleep-Start");
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getId());
        Thread.sleep(5000);
        System.out.println("Sleep-End\n");



        Thread thread1 = new Thread(() -> {
            arr(1);
            System.out.println("END-1");
        });
        Thread thread2 = new Thread(() -> {
            arr(1);
            System.out.println("END-2");
        });
        Thread thread3 = new Thread(() -> {
            arr(1);
            System.out.println("END-3");
        });
        Thread thread4 = new Thread(() -> {
            arr(1);
            System.out.println("END-4");
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


    }

    private static int[] add(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
        return arr;
    }

    private static void speed() {
        long start = System.currentTimeMillis();
        arr(1);
        arr(2);
        arr(3);
        arr(4);

        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }

    private static int[] arr(int a) {
        int[] arr = new int[1000000 * a];
        add(arr);
        return arr;
    }


}
