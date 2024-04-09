package com.choongang;

public class H_GetLongestWord {
    public String getLongestWord(String str) {
        // TODO:
        //스플릿 활용해서 공백 잘라 단어단위로 자르기
        String maxLengthStr = ""; //빈 문자열이 가장 작으니 초기값을 "" 로 두고 돌기

        //str 순회하기 위해서 문자열 배열로 전환
        String[]strings = str.split(" ");
        for(int i =0; i<strings.length; i++){
            if(maxLengthStr.length() < strings[i].length()){
                maxLengthStr = strings[i];
            }
        } return maxLengthStr;

    }
}

//만약 같은 길이가 있으면 가장 뒤에있는 것을 반환하자 라고 문제를 바꾸면
//            if(maxLengthStr.length() <= strings[i].length()){
//부등호만 <= 로 바꿔주면 돌아간다.