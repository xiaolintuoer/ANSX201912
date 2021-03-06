package com.example.androidproject;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

import java.nio.file.attribute.UserPrincipalLookupService;

public class LaunchActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.link_start);
        //定义一个handle对象
        Handler handler = new Handler();
        //设置3瞄准延迟执行splashHandler线程
        handler.postDelayed(new splashHandler(),3000);
    }
    class splashHandler implements Runnable{

        @Override
        public void run() {
            //作用3秒后进入主界面
            startActivity(new Intent(getApplicationContext(),LoginActivity.class));
            LaunchActivity.this.finish();//把当前的LaunchActivity结束掉
        }
    }

    @SuppressLint("ResourceType")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.layout.login_activity,menu);
        return true;
    }
}
