package com.choongang;

import java.util.Arrays;

import static java.util.Arrays.*;

public class I_GetEvenNumbers {
    public int[] getEvenNumbers(int[] arr) {
        // TODO:
        //array 크기는 한번 정하면 바꿀 수 없다
//      1.  일단 짝수의 갯수를 찾아 몇 개인지 파악
        int[] eventArray;
        int count = 0 ;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                count++;
            }
        }
        eventArray = new int [count];  //여기서 배열의 갯수가 확정

        count=0;
//        위에 카운트 재활용 위에는 할당되고 없어짐

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                eventArray[count] = arr[i];
                count++;
                //eventArray 는 [0.0] 이렇게 형성되어있는데
                // 처음 0의 자리에 들어가고 count++돼서
                //[첫번째 숫자, 두번째 숫자 ] 가 들어가는 것이다.
            }
        } return eventArray;




    }
}
