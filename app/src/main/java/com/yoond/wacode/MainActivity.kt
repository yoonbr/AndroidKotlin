package com.yoond.wacode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // activity_main.xml 파일의 내용을 현재 Activity의
        // 전체 영역에 출력하는 코드
        // main을 읽은 것
        setContentView(R.layout.activity_main)

        // xml에 디자인한 2개의 버튼과 텍스트 뷰를 가져오기
        // findViewById는 View로 리턴하기 때문에 원래의 자료형으로 형 변환을 해야함
        // kotlinx import후에는 작성안해줘도 됨
//        val btn1 = findViewById(R.id.btn1) as Button
//        val btn2 = findViewById(R.id.btn2) as Button
//        var text = findViewById(R.id.text) as TextView

        // class 옆에 AppCompatActivity(), View.OnClickListener 붙인 후
//        btn1.setOnClickListener(this)
//        btn2.setOnClickListener(this)

        // 위처럼 해도 되고 View.OnClickListener 없앤 후 밑처럼 해도 됨
        // VISIBLE : 보여지기 INVISIBLE : 숨기기
        // kotlin의 확장 기능을 이용해서 xml 파일에 설정한 id를 클래스의 프로퍼티로 추가했기 때문에
        // 선언하지 않아도 오류가 나지 않음
        btn1.setOnClickListener({text.visibility = View.VISIBLE})
        btn2.setOnClickListener({text.visibility = View.INVISIBLE})

//        val linearLayout = LinearLayout(this)
//
//        val btn1 = Button(this)
//        btn1.setText("Button1")
//        linearLayout.addView(btn1)
//
//        val btn2 = Button(this)
//        btn2.setText("Button2")
//        linearLayout.addView(btn2)
//
//        setContentView(linearLayout)

    }
}