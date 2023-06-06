package in.ineuron;

import java.util.ArrayList;
import java.util.List;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ans=new ArrayList<>();
		int[] arr1= {1, 2, 3, 4,5 };
		int[] arr2= {1, 3,4 ,5,6};
		int[] arr3= {1,2,5,6,7};
		ans=unique(arr1, arr2, arr3);
		System.out.println(ans);
	}
	
	
	public static List<Integer> unique(int[] arr1, int[] arr2, int[] arr3){
		
		List<Integer> result =new ArrayList<>();
		int i=0; int j=0; int k=0;
		
		while(i<arr1.length && j<arr2.length && k<arr3.length) {
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k]) {
				result.add(arr1[i]);
				i++;
				j++;
				k++;
			}else if(arr1[i]<arr2[j]) i++;
			else if(arr2[j]<arr3[k]) j++;
			else k++;
		}
		return result;
	}

}
