
//插入排序
public class InsertSort {

	public static void sort(int[] n){
		for(int i=1;i<n.length;i++){
			int temp=n[i];
			int j;
			for(j=i-1;j>=0;j--){//遍历之前的序列
				if(temp<n[j]){
					n[j+1]=n[j];
				//	n[j]=temp;
				}else{
					break;
				}
			}
			n[j+1] = temp;
		}
	}
	public static void main(String[] args) {
		int[] n={49,38,65,97,76,13,27,49,78,34,12,64,1};
        sort(n);
        for(int i=0;i<n.length;i++){
        	System.out.println(n[i]);
        }
	}

}
