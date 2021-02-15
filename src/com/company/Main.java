package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 2, 4, 6, 8, 9));

        System.out.println(list.get(0));

        int index = list.indexOf(10);
        list.remove(index);
        System.out.println(list);

        Stack<Integer> stack = new Stack<>();       //Last In First Out  -- LIFO

        for (int i = 0; i < list.size(); i++) {
            stack.push(list.get(i));
        }
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("-------------");
        //First in First Out - FIFO

        Queue <Integer> queue = new ArrayDeque<>();
        queue.offer(9);
        queue.offer(3);
        queue.offer(4);
        queue.offer(10);
        System.out.println(queue.poll());
        System.out.println(queue);

        String str = "1234";
        str = str.replace('4','7');
        str = "5678";
        System.out.println(str);
        System.out.println("********************");

        Rectangle r1 = new Rectangle(3,4);
        System.out.println(r1.getArea());

        System.out.println(Rectangle.getArea(4,5));
        //------------------------------------------------------equavqlent continue
        for (int i = 0; i < 10; i++) {

            if ( i !=4) System.out.println(i);  //equavqlent continue

            System.out.println();
            if (i == 4) continue;
        }
        // a вот break вобще прерывает цыкл
        for (int i = 0; i < 10; i++) {
            if (i == 4) break; //дойдет до 4 и цикл прервется
        }

        for (int i = -5; i < 5; i++) {
            if (i ==0) break;
             System.out.println((double) 5/i);
        }
    }
}
