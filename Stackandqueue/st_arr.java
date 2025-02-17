package Stackandqueue;
import java.util.Scanner;
public class st_arr {


static int arr[]=new int[100];
static int top=-1;

public static void push(int data){
    arr[++top]=data;
}

public static void pop()
{
    --top;
}

public static int peek(){
    return arr[top];
}

public static void display(){
    for(int i=top;i>=0;i++){
        System.out.print(arr[i]);
    }
}

public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        int data=sc.nextInt();
        push(data);

    }
}
    
}
