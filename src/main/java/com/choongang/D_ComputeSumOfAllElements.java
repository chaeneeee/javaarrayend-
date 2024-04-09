package com.choongang;

public class D_ComputeSumOfAllElements {
    public int computeSumOfAllElements(int[] arr) {
        // TODO:
        //빈 배열일 경우 0 을 리턴
        //배열의 모든 요소의 합을 리턴

        int sum=0;
        if(arr.length==0){
            sum = 0;
        }
        for (int i =0; i<arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }
}

// int result 를 초기값 0으로 설정해주고 해야한다 .
//위에서도 sum = 0 이라고 초기값 설정해줌
//    int result= 0;
// for (int i =0; i<arr.length; i++){
//     result = result +arr [i];  (같은 말 sum += arr[i];)
// }
// return result;