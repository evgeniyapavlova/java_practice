package seminar4;

public class MyStackUsage {
    public static void main(String[] args) {
        MyStack mystack = new MyStack();
        System.out.println(mystack);
        mystack.push(10);
        mystack.push(3);
        mystack.push(510);
        mystack.push(4);
        System.out.println(mystack);
        mystack.pop();
        mystack.pop();

        System.out.println(mystack);
        System.out.println(mystack.peek());
        System.out.println(mystack.empty());
    }
}
