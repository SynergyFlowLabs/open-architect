package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.g1;
import androidx.annotation.p0;
import androidx.annotation.t0;
import com.google.android.material.internal.g0;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f113286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f113287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f113288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @t0
    public int f113289k;

    public o(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.Hb);
    }

    @Override // com.google.android.material.progressindicator.c
    void e() {
        super.e();
        if (this.f113289k < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.f113286h == 0) {
            if (this.f113185b > 0 && this.f113190g == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.f113186c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public o(@NonNull Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        this(context, attributeSet, i10, LinearProgressIndicator.f113148i3);
    }

    public o(@NonNull Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10, @g1 int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayK = g0.k(context, attributeSet, r6.a.o.El, r6.a.c.Hb, LinearProgressIndicator.f113148i3, new int[0]);
        this.f113286h = typedArrayK.getInt(r6.a.o.Fl, 1);
        this.f113287i = typedArrayK.getInt(r6.a.o.Gl, 0);
        this.f113289k = Math.min(typedArrayK.getDimensionPixelSize(r6.a.o.Hl, 0), this.f113184a);
        typedArrayK.recycle();
        e();
        this.f113288j = this.f113287i == 1;
    }
}
