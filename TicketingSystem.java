/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketingsystem;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author 91030946
 */
public class TicketingSystem {

    /**
     * @param args the command line arguments
     */
  
    public static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        Thread t2 = new Thread();
        t2.start();
        Timer timer = new Timer();
        timer.schedule(new SalesAssisstantTask(""), 0, 5000);
        Timer timer2 = new Timer();
        timer2.schedule(new SalesAssisstantTask1(""), 0, 3000);
        /* timer.schedule(new SalesAssisstantTask1(), 0, 3000);
        run code in the SalesAssistantTask run() method every 3 seconds*/
    }

    public static class SalesAssisstantTask extends TimerTask implements Runnable { //inner class

        private Thread t1 = new Thread();
        private String threadName;

        SalesAssisstantTask(String threadName) {
            this.threadName = threadName;
            System.out.println("" + threadName);
        }

        public void start() {
            System.out.println("" + threadName);
            if (t1 == null) {
                t1 = new Thread(this, threadName);
                t1.start();
            }
        }

        public void run() {
            System.out.println("Sales Assistant is now ready to see the next customer in the queue.");
            System.out.println("Customer number" + queue.poll() + " is ready to be seen");
        }
    }

    public static class SalesAssisstantTask1 extends TimerTask implements Runnable {

        private Thread t2 = new Thread();
        private String threadName;

        public SalesAssisstantTask1(String threadName) {
            this.threadName = threadName;
            System.out.println("" + threadName);
        }

        public void run() {
            try {
                for (int i = 0;; i++) {
                    queue.add(i);
                    System.out.println("Customer with the following ticket number(s): " + queue + " has been added to the queue");
                    Thread.sleep(3000);
                }

            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }

        public void start() {
            System.out.println("" + threadName);
            if (t2 == null) {
                t2 = new Thread(this, threadName);
                t2.start();
            }

        }

    }
}
