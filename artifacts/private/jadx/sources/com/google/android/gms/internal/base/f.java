package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
final class f extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f107929a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f107930b = new e(null);

    private f() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return f107930b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@p0 ColorFilter colorFilter) {
    }
}
