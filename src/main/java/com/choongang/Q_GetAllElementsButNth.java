//package com.choongang;
//
//import java.util.Arrays;
//
//public class Q_GetAllElementsButNth {
//    public int[] getAllElementsButNth(int[] arr, int n) {
//        // TODO:
//        //arr=[] 일 경우, 빈 배열을 반환해야 함
//        int [] result;
//        if(arr.length ==0){
//            result = new int [0];
//        }
//        // arr.length 보다 n이 크다면 arr를 그대로 반환
//        else if(arr.length< n) {
//            result = Arrays.copyOf(arr,arr.length);
//            //깊은 복사하는 법
//        }
//        //arr= [1,2,3,4,5,6]
//        //n =2 라면
//        //result = [1,2,3,4,5,6] 즉, arr [n]민 제외한 배열을 만들어야함
//
//        //result의 크기는 arr.length -1;
//        int[] result = new int [arr.length -1];
//        //arr[1,2] 를 먼저 순회하고
//        //result[0] = arr[0]
//        //result[1] = arr[1];
//        //즉 result [i] = arr[i]
//        //반복문 순회는 0부터 n까지만 순회
//        for (int i=0; i<n; i++){
//            result[i]= arr[i];
//        }
////        arr[4,5,6] 을 순회하며 값을 result에 넣음
//        //현재 result = [1.2.0.0.0]
//        //result[2] = arr[3]
//        //result[3] = arr[4]...
////        result[i-1] = arr[i];
//        //for 문은 n+1 부터 시작해서 마지막까지 순회
//        for(int i=n+1; i<arr.length; i++) {
//            result [i-1] = arr[i];
//        }  return result;
//    }
//}
