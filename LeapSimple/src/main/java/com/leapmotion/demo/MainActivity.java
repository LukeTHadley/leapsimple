package com.leapmotion.demo;

import android.app.Activity;
import android.os.Bundle;
import android.text.Layout;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import com.leapmotion.leap.Controller;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";
    private Controller mController;
    private SampleListener mListener;
    private TextView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mView = (TextView)findViewById(R.id.text_view);
        mView.setMovementMethod(new ScrollingMovementMethod());
    }

    @Override
    protected void onStart() {
        super.onStart();

        mController = new Controller();
        mListener = new SampleListener(this);
        mController.addListener(mListener);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mController.removeListener(mListener);
        mController.delete();
        mListener.delete();
    }

    public void printLog(final String str) {
        runOnUiThread(new Runnable() {
            public void run() {
                mView.setText(str + "\n");
            }
        });
    }

    public void addLog(final String str) {
        runOnUiThread(new Runnable() {
            public void run() {
                mView.append(str + "\n");
            }
        });
    }

}
