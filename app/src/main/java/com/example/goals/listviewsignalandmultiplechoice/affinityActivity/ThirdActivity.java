package com.example.goals.listviewsignalandmultiplechoice.affinityActivity;import android.support.v7.app.AppCompatActivity;import android.os.Bundle;import android.view.View;import com.example.goals.listviewsignalandmultiplechoice.R;import de.greenrobot.event.EventBus;public class ThirdActivity extends AppCompatActivity {    @Override    protected void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_third);    }    public void finishAffinityTest(View view) {        //        String json="ThirdActivity发送来的消息";        EventBus.getDefault().post(json);        finishAffinity();    }}