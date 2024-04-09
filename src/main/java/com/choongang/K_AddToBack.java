package com.choongang;

public class K_AddToBack {
    public int[] addToBack(int[] arr, int el) {
        // TODO:
        int [] result = new int [arr.length +1 ];

        //result 의 마지막 위치는?
        //마지막 요소의 인덱스는 length -1
        result[result.length-1] = el;
//    result[arr.length-1] =el;이렇게도 가능 arr마지막에 들어가니까
        //이렇게 넣는 걸 추천

        for(int i=0; i< arr.length; i++){
            result[i] = arr[i];

//            System.arraycopy(arr,0,result,0,arr.length);
////

    } return result;

}}
