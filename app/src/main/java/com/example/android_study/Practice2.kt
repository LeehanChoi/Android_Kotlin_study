package com.example.android_study

// MutableList 수정 가능한 리스트 -> array 기본적으로 뮤타블 (Read, Write 둘 다 가능)
// InMutableList 수정 불가능한 리스트 = List (Read 전용)


fun array(){
    val array = arrayOf(1,2,3) // array 초기화
    val list = listOf(1,2,3) // list 초기화
    val array2 = arrayOf(a, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)
}
