package cloud.computer.app;

import android.Manifest;
import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;


public class MainActivity extends Activity {
    public static String[] ALL_PERMISSIONS = {
            Manifest.permission.INTERNET,  // 网络权限
            Manifest.permission.ACCESS_NETWORK_STATE, // 获取网络状态的权限

    };
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 申请所需权限
        requestPermissions(ALL_PERMISSIONS, 1);


    }

}
