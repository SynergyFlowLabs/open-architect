package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.core.view.u1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class LinearProgressIndicator extends com.google.android.material.progressindicator.b<o> {

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final int f113148i3 = r6.a.n.f361309mj;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final int f113149j3 = 0;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final int f113150k3 = 1;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final int f113151l3 = 0;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final int f113152m3 = 1;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final int f113153n3 = 2;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final int f113154o3 = 3;

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface b {
    }

    public LinearProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    private void u() {
        l lVar = new l((o) this.f113166a);
        setIndeterminateDrawable(k.A(getContext(), (o) this.f113166a, lVar));
        setProgressDrawable(g.D(getContext(), (o) this.f113166a, lVar));
    }

    public int getIndeterminateAnimationType() {
        return ((o) this.f113166a).f113286h;
    }

    public int getIndicatorDirection() {
        return ((o) this.f113166a).f113287i;
    }

    @t0
    public int getTrackStopIndicatorSize() {
        return ((o) this.f113166a).f113289k;
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        S s10 = this.f113166a;
        o oVar = (o) s10;
        boolean z11 = true;
        if (((o) s10).f113287i != 1 && ((u1.c0(this) != 1 || ((o) this.f113166a).f113287i != 2) && (u1.c0(this) != 0 || ((o) this.f113166a).f113287i != 3))) {
            z11 = false;
        }
        oVar.f113288j = z11;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        int paddingLeft = i10 - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i11 - (getPaddingTop() + getPaddingBottom());
        k<o> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        g<o> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    @Override // com.google.android.material.progressindicator.b
    public void p(int i10, boolean z10) {
        S s10 = this.f113166a;
        if (s10 != 0 && ((o) s10).f113286h == 0 && isIndeterminate()) {
            return;
        }
        super.p(i10, z10);
    }

    public void setIndeterminateAnimationType(int i10) {
        if (((o) this.f113166a).f113286h == i10) {
            return;
        }
        if (s() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s10 = this.f113166a;
        ((o) s10).f113286h = i10;
        ((o) s10).e();
        if (i10 == 0) {
            getIndeterminateDrawable().F(new m((o) this.f113166a));
        } else {
            getIndeterminateDrawable().F(new n(getContext(), (o) this.f113166a));
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.b
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((o) this.f113166a).e();
    }

    public void setIndicatorDirection(int i10) {
        S s10 = this.f113166a;
        ((o) s10).f113287i = i10;
        o oVar = (o) s10;
        boolean z10 = true;
        if (i10 != 1 && ((u1.c0(this) != 1 || ((o) this.f113166a).f113287i != 2) && (u1.c0(this) != 0 || i10 != 3))) {
            z10 = false;
        }
        oVar.f113288j = z10;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.b
    public void setTrackCornerRadius(int i10) {
        super.setTrackCornerRadius(i10);
        ((o) this.f113166a).e();
        invalidate();
    }

    public void setTrackStopIndicatorSize(@t0 int i10) {
        S s10 = this.f113166a;
        if (((o) s10).f113289k != i10) {
            ((o) s10).f113289k = Math.min(i10, ((o) s10).f113184a);
            ((o) this.f113166a).e();
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.b
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public o i(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new o(context, attributeSet);
    }

    public LinearProgressIndicator(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.Hb);
    }

    public LinearProgressIndicator(@NonNull Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        super(context, attributeSet, i10, f113148i3);
        u();
    }
}
