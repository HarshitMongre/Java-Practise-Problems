import java.util.Queue;
import java.util.Stack;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
// stack have 5 methods - push(), pop(), peek(), search(),empt()
// queue operations - offer() {for adding an element}, poll() {to remove first element}, isEmpty() , peek(), size()
class dsa {
    public static void main(String[] args){
       // STACK --> lifo (last in - first out)
    //    Stack<String> stack = new Stack<String>();
    //    System.out.println(stack.empty());
    //    stack.push("harshit");
    //    stack.push("priyanka");
    //    stack.push("ankiit");
    //    stack.push("asha");
    //    stack.push("anil");
    //    System.out.println(stack.empty());
    //    System.out.println(stack);
    //    System.out.println(stack.search("anil"));
    //    stack.pop();
    //    System.out.println(stack);
    //    stack.pop();
    //    stack.pop();
    //    System.out.println();
    //    System.out.println(stack.peek());
    //    System.out.println();
    //    System.out.println(stack);
       

    //    //search method :
    //    System.out.println(stack.search("harshit"));





    // 2) --> QUEUE :
    // QUEUE --> FIFO (first in first out) 
    // add -> enqueue
    // remove -> dequeue
    // Queue<String> queue = new LinkedList<String>();
    // queue.offer("harshit");
    // queue.offer("harry");
    // queue.offer("harsh");
    // queue.offer("harish");
    // System.out.println(queue); 
    // System.out.println(queue.size());  //4
    // System.out.println(queue.peek());
    // queue.poll();
    // System.out.println(queue);
    // queue.poll();
    // queue.poll();
    // System.out.println(queue);
    // queue.poll();
    // System.out.println(queue);
    // System.out.println(queue.isEmpty());  //true
    // System.out.println(queue.size());     //0



    // 3)) Priority queue :
    // Queue<String> queue = new PriorityQueue<>();
    // // queue.offer(3.0);
    // // queue.offer(2.5);
    // // queue.offer(4.0);
    // // queue.offer(1.5);
    // // queue.offer(2.0);
    // queue.offer("B");
    // queue.offer("A");
    // queue.offer("E");
    // queue.offer("D");
    // queue.offer("C");
    // while(!queue.isEmpty()){
    //     System.out.println(queue.poll());
    // }

    // Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
    // // queue.offer(3.0);
    // // queue.offer(2.5);
    // // queue.offer(4.0);
    // // queue.offer(1.5);
    // // queue.offer(2.0);
    // queue.offer("B");
    // queue.offer("A");
    // queue.offer("E");
    // queue.offer("D");
    // queue.offer("C");
    // while(!queue.isEmpty()){
    //     System.out.println(queue.poll());
    // }



    // (4). LinkedList :
    LinkedList<String> linkedlist = new LinkedList<String>();
    // linkedlist.push("A");
    // linkedlist.push("B");
    // linkedlist.push("C");
    // linkedlist.push("D");
    // linkedlist.push("E");


    linkedlist.offer("A");
    linkedlist.offer("B");
    linkedlist.offer("C");
    linkedlist.offer("D");
    linkedlist.offer("E");

    linkedlist.add(3,"Q");
    linkedlist.remove("E");
    System.out.println(linkedlist);

    
    // linkedlist.pop();
    // linkedlist.poll();
    // System.out.println(linkedlist);





    }
}
