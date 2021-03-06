package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_thumb_down extends SVGRenderer {

    public ic_thumb_down(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(15.0f, 3.0f);
        mPath.lineTo(6.0f, 3.0f);
        mPath.rCubicTo(-0.83f, 0.0f, -1.54f, 0.5f, -1.84f, 1.22f);
        mPath.rLineTo(-3.02f, 7.05f);
        mPath.rCubicTo(-0.09f, 0.23f, -0.14f, 0.47f, -0.14f, 0.73f);
        mPath.rLineTo(0f, 1.91f);
        mPath.rLineTo(0.01f, 0.01f);
        mPath.lineTo(1.0f, 14.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(6.31f, 0f);
        mPath.rLineTo(-0.95f, 4.57f);
        mPath.rLineTo(-0.03f, 0.32f);
        mPath.rCubicTo(0.0f, 0.41f, 0.17f, 0.79f, 0.44f, 1.06f);
        mPath.lineTo(9.83f, 23.0f);
        mPath.rLineTo(6.59f, -6.59f);
        mPath.rCubicTo(0.36f, -0.36f, 0.58f, -0.86f, 0.58f, -1.41f);
        mPath.lineTo(17.0f, 5.0f);
        mPath.rCubicTo(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(15.0f, 3.0f);
        mPath.rMoveTo(4.0f, 0.0f);
        mPath.rLineTo(0f, 12.0f);
        mPath.rLineTo(4.0f, 0f);
        mPath.lineTo(23.0f, 3.0f);
        mPath.rLineTo(-4.0f, 0f);
        mPath.close();
        mPath.moveTo(19.0f, 3.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}