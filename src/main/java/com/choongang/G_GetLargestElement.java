package com.choongang;

public class G_GetLargestElement {
    public int getLargestElement(int[] arr) {
        // TODO:
        //초기값 설정 후 돌면서 옆 수랑 비교하면서 크면 바꾸는 것
        int maxNumber = Integer.MIN_VALUE;
//        int maxNumber = arr[0]; 이렇게도 가능
        //JAVA에서 표현할 수 있는 가장 작은 값
        //이 값보다 더 작은 수는 들어올 수 X
        for(int i=0; i<arr.length; i++){
            if(maxNumber<arr[i]){
                maxNumber =arr[i];
            }
        }
            return maxNumber;
    }
}

//이렇게 하면 음수값만 있을 때 초기값이 0이라 0이뜬고 음수끼리 비교가 X
//1. 초기값을 완전 작게 바꿔야한다.
//2. 초기값을 arr의 index [0] 의 수로 정한다. 그러면 돌면서 비교할테니까
// arr의 중간값을 초기값으로 잡지 못하는 이유는 3이라고 했는데 arr가 2이면 오류가 뜬다.
// 그래서 언제나 존재하는 arr 의 index 0 의 값을 넣으면 된다
//but 이거는 array가 "" 빈 array 가 오지 않는다는 전제가 필요.
//아니면 if문으로 array가 비었다면 뭐 반환할건지 요구사항 쓰기


//        int maxNumber = 0;
//        for(int i=0; i<arr.length; i++){
//            if(maxNumber<arr[i]){
//                maxNumber =arr[i];
//            }
//        }
//            return maxNumber;
//    }
//}
