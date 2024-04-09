package com.choongang;

public class L_MergeArrays {
    public int[] mergeArrays(int[] arr1, int[] arr2) {
        // TODO:
        // 결과담을 새 배열 만들기
        // 그 새 배열의 크기는 arr1 length arr2 의 length 를 더한것
        //arr1 [1,2] , index 는 0 ,1 이니
        //arr2 의 index는 arr1.length가 된다
        //arr2 의 첫번째 index는 3이고 arr1 의 length는 2니까

        int [] result = new int[arr1.length +arr2.length];
        //arr1의 값을 result 할당

        for(int i=0; i<arr1.length; i++){
            result[i] = arr1[i];
        }

//        arr2 의 값을 result 에 할당
        //시작점이 다르므로 이 경우 result 의 시작점은 (할당 될 위치) arr.length
        for(int i=0; i <arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return  result;
    }
}
