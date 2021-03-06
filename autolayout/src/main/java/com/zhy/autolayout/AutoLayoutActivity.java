package com.zhy.autolayout;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.View;

import com.zhy.autolayout.widget.AutoHorizontalScrollView;
import com.zhy.autolayout.widget.AutoRadioGroup;

/**
 * Created by zhy on 15/11/19.
 */
public class AutoLayoutActivity extends FragmentActivity
{
    private static final String LAYOUT_LINEARLAYOUT = "LinearLayout";
    private static final String LAYOUT_FRAMELAYOUT = "FrameLayout";
    private static final String LAYOUT_RELATIVELAYOUT = "RelativeLayout";
    private static final String LAYOUT_RADIOGROUP ="RadioGroup";
    private static final String LAYOUT_HORIZONTALSCROLLVIEW ="HorizontalScrollView";


    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs)
    {
        View view = null;
        if (name.equals(LAYOUT_FRAMELAYOUT))
        {
            view = new AutoFrameLayout(context, attrs);
        }

        if (name.equals(LAYOUT_LINEARLAYOUT))
        {
            view = new AutoLinearLayout(context, attrs);
        }

        if (name.equals(LAYOUT_RELATIVELAYOUT))
        {
            view = new AutoRelativeLayout(context, attrs);
        }

        if(name.equals(LAYOUT_RADIOGROUP)){
            view = new AutoRadioGroup(context,attrs);
        }

        if(name.equals(LAYOUT_HORIZONTALSCROLLVIEW)){
            view = new AutoHorizontalScrollView(context,attrs);
        }

        if (view != null) return view;

        return super.onCreateView(name, context, attrs);
    }




}
