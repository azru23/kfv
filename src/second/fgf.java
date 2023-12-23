package second;

import java.util.Scanner;

public class fgf {
	static int[] ar=new int[5];
    static int[] getData(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers: ");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        sc.close();
        return ar;
    }
    static int[] bbs(int ar[]){
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]>ar[j]){
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        return ar;
    }
    public static void main(String[] args){
        getData();
        System.out.println("The elements in the array are: ");
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
        bbs(ar);
        System.out.println("The elements in the array are: ");
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}
