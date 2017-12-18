package org.opencv.samples;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by fanzhengchen on 12/18/17.
 */

public class PortraitCameraViewBase extends SurfaceView implements SurfaceHolder.Callback{


    private static final int MAX_UNSPECIFIED = -1;
    private static final int STOPPED = 0;
    private static final int STARTED = 1;


    public PortraitCameraViewBase(Context context) {
        super(context);
    }

    public PortraitCameraViewBase(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PortraitCameraViewBase(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
