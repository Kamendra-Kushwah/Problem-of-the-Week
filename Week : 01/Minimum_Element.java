package Problems_of_the_week;
import java.util.*;
public class Minimum_Element {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of array : ");
        int n=sc.nextInt();
        System.out.print("Element Of Array : ");
        int [] num= new int [n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int min=Minimum(num,0,n-1);
        System.out.println("Minimum Element is :"+min);
    }
    public static int Minimum(int [] num , int low , int high){
        while(low<=high){
            int mid=(low+high)/2;
            if(num[mid]>num[high]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return num[low];
    }
}
