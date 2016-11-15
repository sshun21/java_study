package mobile;

import java.util.Scanner;
import java.lang.String;

public class binary_search {
	 public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      Scanner in = new Scanner(System.in);

	      int arr[] = new int[100];
	      for (int i = 0; i < arr.length; i++){
	         arr[i] = i;
	      }
          System.out.println("key를 입력하세요");
          int key = in.nextInt();
          System.out.println(binSearch(arr,key)+"번 만에 맞췄습니다.");
	 }
	 public static int binSearch(int arr[], int key){
	    int left = 0;
	    int right = arr.length-1;
	    int middle;
	    int cnt=0;   
	    while(right >= left){
	       middle = (left+right)/2;
	       if (arr[middle] == key) {cnt++;break;}
	       else if (key < arr[middle]) {cnt++;right = middle - 1;}
	       else {cnt++;left = middle + 1;}
	    }
	        
	    return cnt;
	 }
}
