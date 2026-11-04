package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.t0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class CircularProgressIndicator extends b<f> {

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final int f113145i3 = r6.a.n.f361046aj;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final int f113146j3 = 0;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final int f113147k3 = 1;

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface a {
    }

    public CircularProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    private void u() {
        d dVar = new d((f) this.f113166a);
        setIndeterminateDrawable(k.y(getContext(), (f) this.f113166a, dVar));
        setProgressDrawable(g.B(getContext(), (f) this.f113166a, dVar));
    }

    public int getIndicatorDirection() {
        return ((f) this.f113166a).f113223j;
    }

    @t0
    public int getIndicatorInset() {
        return ((f) this.f113166a).f113222i;
    }

    @t0
    public int getIndicatorSize() {
        return ((f) this.f113166a).f113221h;
    }

    public void setIndicatorDirection(int i10) {
        ((f) this.f113166a).f113223j = i10;
        invalidate();
    }

    public void setIndicatorInset(@t0 int i10) {
        S s10 = this.f113166a;
        if (((f) s10).f113222i != i10) {
            ((f) s10).f113222i = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(@t0 int i10) {
        int iMax = Math.max(i10, getTrackThickness() * 2);
        S s10 = this.f113166a;
        if (((f) s10).f113221h != iMax) {
            ((f) s10).f113221h = iMax;
            ((f) s10).e();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.b
    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        ((f) this.f113166a).e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.b
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public f i(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new f(context, attributeSet);
    }

    public CircularProgressIndicator(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.L2);
    }

    public CircularProgressIndicator(@NonNull Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        super(context, attributeSet, i10, f113145i3);
        u();
    }
}
