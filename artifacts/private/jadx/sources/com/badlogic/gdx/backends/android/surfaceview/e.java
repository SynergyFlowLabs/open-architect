package com.badlogic.gdx.backends.android.surfaceview;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f89789a;

    public e(float f10) {
        this.f89789a = f10;
    }

    @Override // com.badlogic.gdx.backends.android.surfaceview.f
    public f.a a(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float f10 = this.f89789a;
        float f11 = size;
        float f12 = size2;
        if (f11 / f12 < f10) {
            size2 = Math.round(f11 / f10);
        } else {
            size = Math.round(f12 * f10);
        }
        return new f.a(size, size2);
    }

    public e(float f10, float f11) {
        this.f89789a = f10 / f11;
    }
}
