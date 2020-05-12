/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.drawtest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class PathEffectView extends View {

    private int mWidth;
    private int mHeight;

    private Paint mLinePaint;
    private Paint mPaint;
    private Path mPath;

    public PathEffectView(Context context) {
        this(context, null);
    }

    public PathEffectView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStrokeWidth(20);
        mPaint.setColor(getResources().getColor(R.color.colorPrimary));
        mPaint.setStyle(Paint.Style.STROKE);

        mLinePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mLinePaint.setStrokeWidth(1);
        mLinePaint.setStyle(Paint.Style.STROKE);
        mLinePaint.setColor(getResources().getColor(R.color.colorAccent));

        mPath = new Path();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 绘制一条参考线
        canvas.drawLine(60, 0, 60, mHeight, mLinePaint);

        // 绘制第一条虚线
        DashPathEffect dashPathEffect1 = new DashPathEffect(new float[]{60, 60}, 0);
        mPaint.setPathEffect(dashPathEffect1);
        mPath.reset();
        mPath.moveTo(0, mHeight / 10);
        mPath.lineTo(mWidth, mHeight / 10);
        canvas.drawPath(mPath, mPaint);

        // 绘制第二条虚线
        DashPathEffect dashPathEffect2 = new DashPathEffect(new float[]{60, 60}, 20);
        mPaint.setPathEffect(dashPathEffect2);
        mPath.reset();
        mPath.moveTo(0, mHeight * 2 / 10);
        mPath.lineTo(mWidth, mHeight * 2 / 10);
        canvas.drawPath(mPath, mPaint);

        // 绘制第三条虚线
        DashPathEffect dashPathEffect3 = new DashPathEffect(new float[]{60, 60}, 40);
        mPaint.setPathEffect(dashPathEffect3);
        mPath.reset();
        mPath.moveTo(0, mHeight * 3 / 10);
        mPath.lineTo(mWidth, mHeight * 3 / 10);
        canvas.drawPath(mPath, mPaint);

        // 绘制第四条虚线
        DashPathEffect dashPathEffect4 = new DashPathEffect(new float[]{60, 60}, 60);
        mPaint.setPathEffect(dashPathEffect4);
        mPath.reset();
        mPath.moveTo(0, mHeight * 4 / 10);
        mPath.lineTo(mWidth, mHeight * 4 / 10);
        canvas.drawPath(mPath, mPaint);

        // 绘制第五条虚线
        DashPathEffect dashPathEffect5 = new DashPathEffect(new float[]{60, 60, 30, 30}, 0);
        mPaint.setPathEffect(dashPathEffect5);
        mPath.reset();
        mPath.moveTo(0, mHeight * 6 / 10);
        mPath.lineTo(mWidth, mHeight * 6 / 10);
        canvas.drawPath(mPath, mPaint);

        // 绘制第六条虚线
        DashPathEffect dashPathEffect6 = new DashPathEffect(new float[]{60, 30, 30, 60}, 0);
        mPaint.setPathEffect(dashPathEffect6);
        mPath.reset();
        mPath.moveTo(0, mHeight * 7 / 10);
        mPath.lineTo(mWidth, mHeight * 7 / 10);
        canvas.drawPath(mPath, mPaint);

        // 绘制第七条虚线
        DashPathEffect dashPathEffect7 = new DashPathEffect(new float[]{30, 60, 60, 30}, 0);
        mPaint.setPathEffect(dashPathEffect7);
        mPath.reset();
        mPath.moveTo(0, mHeight * 8 / 10);
        mPath.lineTo(mWidth, mHeight * 8 / 10);
        canvas.drawPath(mPath, mPaint);

        // 绘制第八条虚线
        DashPathEffect dashPathEffect8 = new DashPathEffect(new float[]{30, 30, 60, 60}, 0);
        mPaint.setPathEffect(dashPathEffect8);
        mPath.reset();
        mPath.moveTo(0, mHeight * 9 / 10);
        mPath.lineTo(mWidth, mHeight * 9 / 10);
        canvas.drawPath(mPath, mPaint);
    }
}