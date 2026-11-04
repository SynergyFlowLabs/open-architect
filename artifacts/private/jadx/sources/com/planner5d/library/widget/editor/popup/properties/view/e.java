package com.planner5d.library.widget.editor.popup.properties.view;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class e extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final float f257995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final RectF f257996b = new RectF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Paint f257997c = new Paint(1);

    public e(Context context) {
        this.f257995a = context.getResources().getDimension(com.planner5d.library.f.g.Rg);
    }

    public void a(Object[] objArr, int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f257996b.set(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@p0 ColorFilter colorFilter) {
    }
}
