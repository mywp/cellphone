package com.example.scorpio.cellphone;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/*程序运行显示的界面*/
public class MainUI extends Activity {
    /*
    当前界面刚被创建时回调此方法*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//必须执行此句代码，执行父类的初始化操作
        setContentView(R.layout.activity_main);//设置当前界面的布局
    }
    /*当拨打此号码的按钮被点击时触发此方法*/
    public void call(View view) {
        System.out.println("拨打号码");
        //1.取出输入框中的号码
        EditText etNumber = (EditText) findViewById(R.id.number);//输入框对象
        String number = etNumber.getText().toString();//将要拨打的号码
        //2.根据号码拨打电话
        Intent intent=new Intent();//创建一个意图
        intent.setAction(Intent.ACTION_CALL);//指定其动作为拨打电话
        intent.setData(Uri.parse("tel:"+number));//指定要拨打的号码
        startActivity(intent);//执行这个动作

    }
}
