
package sumamenorymayor;

import java.util.Scanner;

public class menorMayor {
    Scanner sc=new Scanner(System.in);
    int []num=new int[5];
    int []sum=new int[5];
    int min=100000000, max=-1000000000,ct=0;
    
    public void IngNum(){
        for (int i = 0; i < 5; i++) {         
            do {
                num[i]=sc.nextInt();
            }while(num[i]<0);
        }
        sumas();
    }
    public void sumas(){
        sum[0]=num[0]+num[1]+num[2]+num[3];
        sum[1]=num[1]+num[2]+num[3]+num[4];
        sum[2]=num[2]+num[3]+num[4]+num[0];
        sum[3]=num[3]+num[4]+num[0]+num[1];
        sum[4]=num[4]+num[0]+num[1]+num[2];
        MaxMin();
    }
    public void MaxMin(){
        for (int i = 0; i < 5; i++) {
            if (sum[i]<=min) {
                min=sum[i];
            }
            if (sum[i]>=max) {
                max=sum[i];
            }
        }
    }
    public void imprimir(){
        System.out.println("La suma minima y maxima es: "+min+" "+max);
    }
}

