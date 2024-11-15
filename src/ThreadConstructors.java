class WelcomeThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++)  {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Welcome to My Home");
        }
    }
}
class A2{
    void m1(){
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class Thread1 extends Thread{
    A2 a ;
    Thread1(A2 a){
        this.a = a;
    }
    public void run(){
        a.m1();
    }
}
class Thread2 extends Thread{
    A2 a ;
    Thread2(A2 a){
        this.a = a;
    }
    public void run(){
        a.m1();
    }
}

class Thread3 extends Thread{
    A2 a ;
    Thread3(A2 a){
        this.a = a;
    }
    public void run(){
        a.m1();
    }
}
class HelloThread implements Runnable {
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Hello Thread "+i);
        }
    }
}
public class ThreadConstructors {
    public static void main(String[] args) throws Exception{
        Thread t = new Thread();
        System.out.println(t);

        Thread t2 = new Thread("Thread-ddd");
        System.out.println(t2);

        Runnable r = new Thread();
        Thread t3 = new Thread(r);
        System.out.println(t3);

        Runnable r2 /* or HelloThread ht */ = new HelloThread();
        Thread t4 = new Thread(r2);
        t4.start();

        Runnable r3 = new Thread();
        Thread t5 = new Thread(r3,"Thread-ddd");
        t5.start();
        for(int i=0; i<10; i++){
            System.out.println("Main Thread "+i);
        }

        ThreadGroup threadgroup = new ThreadGroup("ThreadGroup-ddd");
        Thread t6 = new Thread(threadgroup,"Core-Java");
        System.out.println(t6);

        Runnable r4 = new Thread();
        Thread t7 = new Thread(threadgroup,r4);
        System.out.println(t7);


        Runnable r5 = new Thread();
        ThreadGroup threadgroup2 = new ThreadGroup("ThreadGroup-ddd");
        Thread t8 = new Thread(threadgroup2,r5,"Java");

        Runnable r6 = new HelloThread();
        ThreadGroup threadgroup3 = new ThreadGroup("ThreadGroup-ddd");
        Thread t9 = new Thread(threadgroup3,r6,"java");
        t9.start();
        for(int i=0; i<10; i++){
            System.out.println("Main Thread "+i);
        }

        System.out.println(t8.getName());
        t8.setName("Python");
        System.out.println(t8.getName());
        System.out.println(t8.getPriority());
        t8.setPriority(10);
        t8.setPriority(Thread.MIN_PRIORITY);
        t8.setPriority(Thread.MAX_PRIORITY-3);
        t8.setPriority(Thread.MIN_PRIORITY+Thread.NORM_PRIORITY);
        System.out.println(t8.getPriority());
//        t8.setPriority(11);//illegallArgumentException
//        t8.setPriority(0);//illegallArgumentException
//        t8.setPriority(-1);//illegallArgumentException
        System.out.println(Thread.activeCount());

        Thread tr = new Thread();
        System.out.println(tr.isAlive());
        tr.start();
        for(int i=0; i<2; i++){
            System.out.println(tr.isAlive());
        }

        A2 a2 = new A2();
        Thread1 thr1 = new Thread1(a2);
        Thread2 thr2 = new Thread2(a2);
        Thread3 thr3 = new Thread3(a2);

        WelcomeThread wt = new WelcomeThread();
        wt.start();
        wt.join();
        for(int i=0; i<10; i++){
            System.out.println("Main Thread "+i);
        }

    }

}
