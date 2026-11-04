package com.planner5d.library.widget.editor.editor2d;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* JADX INFO: loaded from: classes12.dex */
public abstract class k extends SurfaceView implements com.planner5d.library.widget.editor.editor2d.painter.d.b, SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f255127a;

    public k(Context context) {
        this(context, null);
    }

    @Override // com.planner5d.library.widget.editor.editor2d.painter.d.b
    public void d(Canvas canvas) {
        getHolder().getSurface().unlockCanvasAndPost(canvas);
    }

    @Override // com.planner5d.library.widget.editor.editor2d.painter.d.b
    public Canvas lock() {
        return getHolder().getSurface().lockHardwareCanvas();
    }

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public k(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f255127a = true;
        SurfaceHolder holder = getHolder();
        holder.setFormat(-1);
        holder.addCallback(this);
    }
}
