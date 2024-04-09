package com.choongang;

import java.util.Arrays;

public class M_GetElementsAfter {
    public int[] getElementsAfter(int[] arr, int n) {
        // TODO:
        //배열과 인덱스를 입력받아 주어진 인덱스 이후의 요소들을 갖는
        // 새로운 배열을 리턴해야 합니다.
        // 결과를 담을 배열 선언
//      //크기는 n부터 잘라야하므로 arr.length -n ;
        int [] result;
        //if문에서 빈배열을 써야해서 arr.length -n을 밑으로 뺀다.

        //순회하며 값을 할당
        //result 에 arr 값 할당
        //arr 의 n번 인덱스의 값이 result의 0부터 들어와여 합니다
        //arr = [1,2,3,4,5], n =2;
        //result [0]= arr[2]
        //result [1]= arr[3]
        //result [2]= arr[4]
//        여기서 유추할 수 있는건
//                result 의 인덱스는 항상 arr의 인덱스 - n;
        //result[i-n] = arr[i]; > i가 2부터 시작할테니
        //위에서의 i는 for loop 카운트 변수
//        for(int i=n; i<arr.length; i++){
//            result[i-n] =arr[i];
//        }  return  result;



        //예외 arr가 빈배열이 들어왔을 때
        //result가 빈 배열
        //arr.length <= n 일 경우
        //result 를 빈배열을 만들어라
        if(arr.length == 0 ){
            result =new int[0];

         } else if ( arr.length <=n ) {
            result = new int [0];

        } else {
            result = new int [arr.length - n];
            for(int i=n; i<arr.length; i++){
            result[i-n] =arr[i];
        }


        // el 값 만큼 뺀 arr.length 가 result 에 들어가야한다 .
        // arr index[2] 가 result index[0] 에 들어가야한다 2가 빠지니


    } return  result;
}}
