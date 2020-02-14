package com.julive.evaluationpdf;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //个人服务器上的 pdf 测试资源可能随着服务器不续费停机地址失效
    public static final String PDF_URL = "http://106.13.169.38/test.pdf";

    public static final String LOCAL_FILE = "file:///android_asset/test.pdf";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
