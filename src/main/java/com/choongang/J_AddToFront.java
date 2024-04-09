package com.choongang;

import java.util.SplittableRandom;

public class J_AddToFront {
    public int[] addToFront(int[] arr, int el) {
        // TODO:

        // arr= [1.2] , el =3 (element 요소)
        // [3,1,2]를 반환해야함
        //반환하기 위한 (결과를 담기위한 새 arr 를 만들어야함)
        int [] addArray;

//        이 배열을 arr.length 보다 1요소를 더 담아야함
//        즉 result.length +1 ++ == arr.length;
        // result 의 크기는 arr.length + 1;
        addArray = new int [arr.length+1];

        //result 에 요소를 넣어야함
//         1. el 은 맨 앞에 들어와야함
        // result[0] = el;
        addArray[0] = el;
        //남은 위치에 arr 의 요소를 담아야 함
        // arr는 index [i+1] 에 들어간다. index 0 이 새로 들어오는 el 이니까
//       arr[0] -> result [1] 로 들어와야 한다
//        arr[1] -> result[2]로 들어와야함
//        즉 arr[i] result [ i  + 1 ]  에 할당해야합니다.


//        for(int i= 0; i<arr.length; i++) {
//            addArray[i + 1] = arr[i];  }



//System.arraycopy(); 이건 검색해서 쓸 수 있는지 찾는거 오라클 보는 연습하기
        System.arraycopy(arr,0,addArray,1,arr.length);

        return addArray;
            //배열은 한번 값 들어가면 저장 데이터값이 저장돼서 메모라가 확보됨
        //추가하려면 이미 메모리가 정해져있어서 크기를 늘릴 수 없음
        // but 요소를 수정하는 것은 가능하다 .
        //문자열은 더하기가 가능함
//             String str = "java";
//        str = str + "spring";
//        System.out.println(str);   str 원래 주소값에 변환되는 것이아닌
//       "javaspring" 을 담는 아예 새로운 주소값이 생기고 저장된다.







//        System.arraycopy();

            //System.arraycopy();
        //함수 파라미터 정리
    }
}
