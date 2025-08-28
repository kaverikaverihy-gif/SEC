import java.util.*;
class Count{
    public static void main(String[]args){
    int count=0;    
    System.out.println("Enter the size of array:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the array elements are: ");
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    System.out.println("The array elements are:");
     for(int i=0;i<n;i++)
     System.out.println(arr[i]+"");
    for(int i=0;i<n;i++){
        if(arr[i]>50){
            count=count+1;
         }
        }
         System.out.println("the number is greater than 50 are: "+count);

}
}