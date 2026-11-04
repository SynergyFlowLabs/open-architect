package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.d;
import com.google.android.material.color.u;
import com.google.android.material.internal.g0;
import com.google.android.material.resources.c;

/* JADX INFO: loaded from: classes4.dex */
public class a extends AppCompatRadioButton {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f113290g = r6.a.n.f361178gj;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[][] f113291h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private ColorStateList f113292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f113293f;

    public a(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f113292e == null) {
            int iD = u.d(this, r6.a.c.f359465p3);
            int iD2 = u.d(this, r6.a.c.I3);
            int iD3 = u.d(this, r6.a.c.f359214e4);
            int[][] iArr = f113291h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = u.t(iD3, iD, 1.0f);
            iArr2[1] = u.t(iD3, iD2, 0.54f);
            iArr2[2] = u.t(iD3, iD2, 0.38f);
            iArr2[3] = u.t(iD3, iD2, 0.38f);
            this.f113292e = new ColorStateList(iArr, iArr2);
        }
        return this.f113292e;
    }

    public boolean a() {
        return this.f113293f;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f113293f && d.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f113293f = z10;
        if (z10) {
            d.d(this, getMaterialThemeColorsTintList());
        } else {
            d.d(this, null);
        }
    }

    public a(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.f359677yf);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f113290g;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayK = g0.k(context2, attributeSet, r6.a.o.On, i10, i11, new int[0]);
        if (typedArrayK.hasValue(r6.a.o.Pn)) {
            d.d(this, c.a(context2, typedArrayK, r6.a.o.Pn));
        }
        this.f113293f = typedArrayK.getBoolean(r6.a.o.Qn, false);
        typedArrayK.recycle();
    }
}
