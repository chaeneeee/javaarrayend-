package com.choongang;

public class F_GetAllLetters {
    public char[] getAllLetters(String str) {
        // TODO:

        //빈문자열을 받으면 빈 배열을 리턴해야한다.
        //문자열 입력받으면 구성하는 각 문자를 요소로 갖는 배열 리턴
//        char [] chars;
//        chars = str.toCharArray();
//        return chars;
//        이 str.toCharArray(); 는 하나씩 잘라주는 함수다.

    char[] chars = new char[str.length()];
        //몇개의 배열이 들어올지는 str.length 를 통해 미리 선언 할 수 있다.
        for(int i = 0; i<str.length(); i++){
            chars[i] = str.charAt(i);
        }

        return chars;


//        char result;
//        String[] arr;
//        for (int i = 0; i < str.length(); i++) {
//            result = str.charAt(i);
//            arr = new String[]{"result"};
//
////        for(String i; i<=str.length(); i++)
//            //string for문?
        }
//
    }

