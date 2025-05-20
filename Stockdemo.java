interface  StackInterface{
    void push(int element);
    int pop();
    void display();
}
class Fixedstack implements StackInterface{
    public int[] satck;
    public int top;
    public  int capacity;

    public Fixedstack(int size){
        capacity = size;
        satck = new int[capacity];
        top = -1;
    }
    public void push(int element){
        if (top == capacity -1 ){
            System.out.println("Stack is full");
        }else{
            satck[++top] = element;
            System.out.println("Push element is : "+element);
        }
    }
    public int pop(){
        if (top == -1){
            System.out.println("Stack is empty");
            return -1;
        }else {
            return  satck[top--];
        }
    }
    public void display(){
        if(top == -1){
            System.out.println("Stack is empty");
        }else{
            for(int i = 0;i<= top;i++){
                System.out.println("Stack elments : "+satck[i]);
            }
        }
    }
}
class DaynamicScack implements StackInterface{
    int capacity;
    int[] stack;
    int top;

    public DaynamicScack(){
        capacity = 4;
        stack = new int[capacity];
        top = -1;
    }
    public void resize(){
        capacity *= 2;
        int[] newstack = new int[capacity];
        System.arraycopy(stack,0,newstack,0,stack.length);
        stack = newstack;
        System.out.println("Resized stack to capacity: " + capacity);
    }
    public void push(int element){
        if (top == capacity -1){
            resize();
        }else{
            stack[++top] = element;
            System.out.println("Element is Added : "+element);
        }
    }
    public int pop(){
        if (top == -1){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return stack[top--];
        }
    }
    public void display(){
        if (top == -1){
            System.out.println("Stack is empty");
        }else{
            for(int i=0;i<=top;i++){
                System.out.println("Elements : "+stack[i]);
            }
        }
    }
}
public class Stockdemo {
    public static void main(String args[]){
        StackInterface stack = new Fixedstack(2);
        StackInterface d = new DaynamicScack();

        stack.push(200);
        stack.push(300);
        stack.display();
        stack.pop();
        System.out.println("----------------");
        stack.display();

        System.out.println("Daynamic Stack");
        d.push(10);
        d.push(20);
        d.push(30);
        d.push(40);
        d.push(50);
        d.push(60);
        d.display();
        d.pop();
        System.out.println("----------------");
        d.display();
    }
}
