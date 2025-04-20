package app;

import java.util.Comparator;
import java.util.Queue;

import ds.LQueue;
import ds.PriorityLQueue;


public class Main {

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Queue<Integer> q1=new LQueue<>();
        for(int i=1;i<=5;i++)
            q1.offer(i*i);
        Queue<Integer> q2=new LQueue<>(q1);
        System.out.println("q1="+q1);
        System.out.println("q2="+q2);
        q2.poll();
        q2.remove();
        q2.offer(77);
        q2.add(66);
        System.out.println("q2="+q2);

        Queue<Integer> pq=new PriorityLQueue<>(q2);
        System.out.println("pq="+pq);
        pq.add(1);
        pq.add(20);
        pq.add(88);
        System.out.println("pq="+pq);

        Comparator<Integer> compa = (c1,c2)->c2.compareTo(c1);
        Queue<Integer> pq2=new PriorityLQueue<>(pq);
        System.out.println("pq2="+pq2);
        System.out.println("pq==pq2: "+pq.equals(pq2));//false if equals is not implemented
        Queue<Integer> pq3=new PriorityLQueue<>(pq,compa);
        System.out.println("pq3="+pq3);
        System.out.println("pq==pq3: "+pq.equals(pq3));
    }

}
