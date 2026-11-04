package com.planner5d.library.widget.editor.editor2d;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.TextureView;

/* JADX INFO: loaded from: classes12.dex */
public abstract class l extends TextureView implements com.planner5d.library.widget.editor.editor2d.painter.d.b, TextureView.SurfaceTextureListener {
    public l(Context context) {
        this(context, null);
    }

    @Override // com.planner5d.library.widget.editor.editor2d.painter.d.b
    public void d(Canvas canvas) {
        unlockCanvasAndPost(canvas);
    }

    @Override // com.planner5d.library.widget.editor.editor2d.painter.d.b
    public Canvas lock() {
        return lockCanvas();
    }

    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public l(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setOpaque(false);
        setSurfaceTextureListener(this);
    }
}
