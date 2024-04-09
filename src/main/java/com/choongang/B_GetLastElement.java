package com.choongang;

public class B_GetLastElement {
    public int getLastElement(int[] arr) {
        // TODO:
//        int result;
//
//        if (arr.length == 0) {
//            return -1;
//        }
//        result = arr[arr.length- 1];
//        return result;

//내가 친 코드

        int result =-1;

        if (arr.length != 0) {   //arr 길이가 0이 아니라면
            result = arr[arr.length- 1];
        }
     //아닌 경우엔 모두 -1 를 반환하고 있다.
        return  result;

    }

}
