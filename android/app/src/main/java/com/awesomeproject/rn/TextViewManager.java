package com.awesomeproject.rn;

import android.widget.TextView;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class TextViewManager extends SimpleViewManager<TextView> {
    public static final String REACT_VIEW = "TextView";

    @Override
    public String getName() {
        return REACT_VIEW;
    }

    @Override
    protected TextView createViewInstance(ThemedReactContext reactContext) {
        return new TextView(reactContext);
    }
    @ReactProp(name = "text")
    public void setText(TextView view, String text) {
        view.setText(text);
    }

    @ReactProp(name = "textSize", defaultFloat = 20f)
    public void setTextSize(TextView view, float size) {
        view.setTextSize(size);
    }

    @ReactProp(name = "textColor", defaultInt = 0x000000)
    public void setTextColor(TextView view, int color) {
        view.setTextColor(color);
    }
    @ReactProp(name = "width", defaultInt = 100)
    public void setWidth(TextView view, int width) {
        view.setWidth(width);
    }
    @ReactProp(name = "height", defaultInt = 100)
    public void setHeight(TextView view, int height) {
        view.setHeight(height);
    }
}
