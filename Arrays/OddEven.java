import java.util.Scanner;
class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            System.out.print(arr[i]+" ");
            if(arr[i]%2==0){
                System.out.println("Even");
            }
            else{
                System.out.println("odd");
            }
        }
        sc.close();
    }
}
