import java.util.*;
public class Gqueue<T>{
    T[] que;
    int size;

    public Gqueue(){
        que = (T[]) new Object[2];
        size = 0;
    }
    public void enqueu(T element){
        if (size == que.length){
            int newcapacity = que.length*2;
            que = Arrays.copyOf(que,newcapacity);
        }
        que[size++] = element;
        System.out.println("Queuqu elements : "+element);
    }
    public void Dequeue(){
        if (size == que.length){
            System.out.println("Queue is Empty");

        }
        T del_element = que[0];
        System.arraycopy(que,1,que,0,size-1);
        que[--size] = null;
        System.out.println("Dequeue element : "+del_element);
    }

    public void Display(){
        for(int i = 0;i< size;i++){
            System.out.println("Elements : "+que[i]);
        }
    }
    public static void main(String args[]){
        Gqueue<Integer> integer = new Gqueue<>();

        integer.enqueu(50);
        integer.enqueu(60);
        integer.enqueu(70);
        integer.Display();
        integer.Dequeue();
        Gqueue<String> text = new Gqueue<>();
        text.enqueu("A");
        text.enqueu("B");


    }
}