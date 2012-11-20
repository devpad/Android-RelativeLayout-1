package ru.devpad.relativelayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class ProgramRelativeActivity extends Activity {
    public static final int BUTTON_ID_1 = 1;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button button1 = new Button(this);
        RelativeLayout.LayoutParams buttonParam1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        button1.setText("Button 1");
        button1.setId(BUTTON_ID_1);
        button1.setLayoutParams(buttonParam1);

        Button button2 = new Button(this);
        RelativeLayout.LayoutParams buttonParam2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        buttonParam2.addRule(RelativeLayout.BELOW, button1.getId());
        buttonParam2.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        button2.setText("Button 2");
        button2.setLayoutParams(buttonParam2);

        RelativeLayout relativeLayout = new RelativeLayout(this);
        RelativeLayout.LayoutParams param = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
        relativeLayout.setLayoutParams(param);

        relativeLayout.addView(button1);
        relativeLayout.addView(button2);

        setContentView(relativeLayout);
    }
}