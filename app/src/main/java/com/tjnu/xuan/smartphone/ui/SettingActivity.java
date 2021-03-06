package com.tjnu.xuan.smartphone.ui;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.tjnu.xuan.smartphone.R;


import java.util.ArrayList;
import java.util.List;

/*
 *  项目名：  com.tjnu.xuan.smartphone.ui
 *  包名：    SmartPhone
 *  文件名:   WebViewActivity
 *  创建者:   happy_yuxuan
 *  创建时间:  17/6/20 下午3:54
 *  描述：    关于我们
 */

public class SettingActivity extends BaseActivity  {
    private ListView mListView;
    private List<String> mList = new ArrayList<>();
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        //去除阴影
        getSupportActionBar().setElevation(0);

        initView();
    }

    //初始化View
    private void initView() {
        mListView = (ListView) findViewById(R.id.mListView);

        mList.add(getString(R.string.app_name));
        mList.add(getString(R.string.text_app_name));
        mList.add(getString(R.string.text_class));
        mList.add(getString(R.string.text_person));
        mList.add(getString(R.string.text_website_address));

        mAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mList);
        //设置适配器
        mListView.setAdapter(mAdapter);
    }



}
