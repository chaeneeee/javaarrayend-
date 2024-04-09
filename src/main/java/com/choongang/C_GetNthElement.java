package com.choongang;

public class C_GetNthElement {
    public int getNthElement(int[] arr, int index) {
        // TODO:
        //배열의 수를 입력받는다
        //배열의 숫자중 인덱스가 가르키고 있는 수를 반환 arr[index]
        //빈 배열일 경우 -1 반환
        //index 가 배열의 크기 벗어 날 경우 -2
        int result;


        if (arr.length==0){
            result = -1;
        } else if (arr.length -1 < index ) {
            //마지막 length 와 index 의 범위가 일치하는 지 확인하기
            return -2;}
        else {
            result = arr[index];
        } return result;

//        else {result = arr[arr.length.];}


    }

    }

