package com.choongang;

import java.util.Arrays;

public class E_GetAllWords {
    public String[] getAllWords(String str) {
        // TODO:
        String result;

        //String 타입 배열 리턴
        //단어는 공백 한칸으로 구분
        //연속된 공백은 없다고 가정
        String[] arr;
    if(str.length()==0 ){  //빈 문자열을 받은경우 빈 문자열 리턴
        arr =new String[]{};  //빈 arr 를 만드는 법
    } else { arr= str.split(" ");}
    return arr;
    //" " 정규표현식 = regex
// String[] arr; 가 if문 안에 들어가면 Stirng에 들어가면 밑에 else에서
        //arr를 못 받는다 .

        //str.split 문자열을 잘라 배열을 만든다.그래서 타입을 배열로 넣어줌
    }
}

//공백 받았을 때 빈배열만드는법
//if (str.equals("")){
// arr = new String[]{};   or arr = new String[0];   }



////str.isempty() 비어있을 때 쓰는 것

//String[] strArray;
//strArray = str.splict( " ");
//}return strArray;
//        }

