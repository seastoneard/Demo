package com.zhh.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zhh.test.update.UpdateVersionController;

/**
 * Created by zhh on 2017/1/18.
 * 个人
 * csdn网站：http://blog.csdn.net/zhh_csdn_ard
 * devstore网站：http://www.devstore.cn/user_home/zhanghai_ardapp.html
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private UpdateVersionController controller = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.force_update).setOnClickListener(this);
        findViewById(R.id.normal_update).setOnClickListener(this);
        if (null == controller) {
            controller = UpdateVersionController.getInstance(this);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.normal_update:
                controller.normalCheckUpdateInfo();
                break;
            case R.id.force_update:
                controller.forceCheckUpdateInfo();
                break;
            default:
                break;
        }
    }

}
