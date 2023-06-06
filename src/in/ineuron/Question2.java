package in.ineuron;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// can be done using HashSet Also
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> result= new ArrayList<>();
		for(int i=0; i<2; i++) result.add(new ArrayList<>());
		int[] arr1= {1,2,4};
		int[] arr2= {1,4,6};
		result= removeDuplicates(arr1,arr2);
		System.out.println(result);
	}

	private static List<List<Integer>> removeDuplicates(int[] arr1, int[] arr2) {
		
		List<List<Integer>> result= new ArrayList<>();
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		for(int i=0; i< arr1.length; i++) {
			if(Arrays.binarySearch(arr2, arr1[i])<0) list1.add(arr1[i]);
		}
		for(int i=0; i< arr2.length; i++) {
			if(Arrays.binarySearch(arr1, arr2[i])<0) list2.add(arr2[i]);
		}
		result.add(list1);
		result.add(list2);
		return result;
	}

}
