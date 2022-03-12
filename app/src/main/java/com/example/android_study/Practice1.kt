package com.example.android_study
// 회색으로 뜨는 것은 사용하지 않았기 때문임
// 주석을 원하면 원하는 라인 블록처리해서 command + /
fun main() {
    helloWorld()
    helloKotlinWorld()
    println(add(4,5)) // add 함수 치고 a와 b자리에 올 숫자만 입력하면 앞에 자동으로 회색으로 a: b: 가 뜸!
    hi()
    println(condition(2,3))
    println(condition2(5,2))
    checkNum(1)
}

// fun == function 함수
// 리턴형식이 없을 때는 : Unit 달기!(생략 가능!)  Void와 같은 역할
fun helloWorld() : Unit {
    println("Hello World!")
}
// 글씨가 회색으로 표시될 때 마우스 가져다 대면 'Redundant 'Unit' return type' 라고 뜨는데 이유는 안 써도 되는 것이기 때문에, 즉 지워주면 됨.

fun helloKotlinWorld() {
    println("Hello Kotlin World!")
}

// return 값과 parameter(매개변수 - 함수 정의시 사용되는 변수) 사용해야할 경우에는! (변수명, 변수타입) : 리턴해야할 타입

fun add(a : Int, b : Int) : Int { // 리턴하는 경우 반드시 리턴 타입 지정해줘야함!
    return a + b
}

// val = value (값 = 변하지 않는 것)
// var = variable (변수 = 변할 수 있는 값)
fun hi(){
    val a : Int = 10 // 상수
    var b : Int = 9
    // a = 100 // Val cannot be reassigned -> 변하지 않는 값이기에 또 다시 할당할 수 없는 것
    b = 100  // 얘만 적으면 b가  회색으로 뜨는데
    println(b) // b를 사용하게 되면 회색에서 검은색으로 변함!

    val c : Int = 100 // 코틀린은 자동으로 타입을 인식함(자동추론) 그래서 : Int 안 써도 괜찮음
    val d = 200 // 이렇게 써도 됨 다만 val, var 는 구분해서 써줄 것
    var e = 300
    var name : String = "Leehan" // : String도 굳이 안 써도 됨!
    var myName = "Leehan" // 이렇게
    var myAge = 22
    var lastName = "Choi"
    // String template
    println("my name is $myName") // 변수출력하고자 할 때, $ 표시하고 사용하고자 하는 var/val이름을 써주면 됨
    // 단 주의할 점, 해당 $myName 뒤에 다른 문장이 더 올 경우, 띄어쓰기를 하거나 변수명을 {} 대괄호로 묶어주어야만 함
    // println("my name is $myNameand I'm 22") // 이러면 X
    println("my name is ${myName} and I'm 22")
    println("my name is ${myName + lastName} and I'm 22") // 대괄호 안에 있는 건 전부 변수로 인식함!
    // 만약에 그냥 순수하게 $ 문자를 쓰고 싶으면 백슬래시를 앞에 써주기!
    println("this laptop is 3000\$ ")
}

fun condition(a : Int, b : Int) : Int{
    if (a > b){
        return a
    }else{
        return b
    }
}

fun condition2(a : Int, b : Int) = if(a>b) a else b
// condition 과 condition2 둘 다 같은 의미임

fun checkNum(score : Int){
    when(score) { // when 은 스위치
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3  -> println("this is 2 or 3")
        else -> println("I don't know")
    }
    var b = when(score){ // 이렇게도 짤 수 있음
        1 -> 1
        2 -> 2
        else -> 3 // else 꼭 써줘야함
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("You are genius") // in 90..100 의미는 90에서 100까지 의미
        in 10..80 -> println("Not bad")
        else -> println("Okay")
    }
}

// Expression Vs Statement