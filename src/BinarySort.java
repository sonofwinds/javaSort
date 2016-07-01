

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 二分插入查找
 */
public class BinarySort {
	public static void sort(int[] n) {
        for(int i=1;i<n.length;i++){
        	int min=0;int high=i-1;int mid;        	
        	int data=n[i];
        	if(i==1){
        		if(n[1]<n[0]){
        			int temp=n[0];
        			n[0]=n[1];
        			n[1]=temp;
        			continue;
        		}
        	}
        	while(true){        		
        		if(min==high){
        			break;
        		}
        		mid=(min+high)/2;
        		if(data>=n[mid]){
        			min=mid+1;
        		}else{
        			high=mid;
        		}
        	}
        	int left;
        	if(data>=n[min]){
        		left=min+1;
        	}else{
        		left=min;
        	}
        	for(int j=i-1;j>=left;j--){
        		n[j+1]=n[j];
        	}
        	n[left]=data;
        }
	}
	public static void main(String[] args) {
		int[] n={49,38,65,97,176,213,227,49,78,34,12,164};
		sort(n);
		 for(int i=0;i<n.length;i++){
	        	System.out.println(n[i]);
	      }
	}

}
