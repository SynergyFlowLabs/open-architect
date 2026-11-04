package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.color.u;
import com.google.android.material.internal.g0;
import r6.a;

/* JADX INFO: loaded from: classes4.dex */
public class SwitchMaterial extends SwitchCompat {
    private static final int P3 = a.n.f361200hj;
    private static final int[][] Q3 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    @NonNull
    private final w6.a L3;

    @p0
    private ColorStateList M3;

    @p0
    private ColorStateList N3;
    private boolean O3;

    public SwitchMaterial(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.M3 == null) {
            int iD = u.d(this, a.c.f359214e4);
            int iD2 = u.d(this, a.c.f359465p3);
            float dimension = getResources().getDimension(a.f.Fd);
            if (this.L3.l()) {
                dimension += com.google.android.material.internal.p0.p(this);
            }
            int iE = this.L3.e(iD, dimension);
            int[][] iArr = Q3;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = u.t(iD, iD2, 1.0f);
            iArr2[1] = iE;
            iArr2[2] = u.t(iD, iD2, 0.38f);
            iArr2[3] = iE;
            this.M3 = new ColorStateList(iArr, iArr2);
        }
        return this.M3;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.N3 == null) {
            int[][] iArr = Q3;
            int[] iArr2 = new int[iArr.length];
            int iD = u.d(this, a.c.f359214e4);
            int iD2 = u.d(this, a.c.f359465p3);
            int iD3 = u.d(this, a.c.I3);
            iArr2[0] = u.t(iD, iD2, 0.54f);
            iArr2[1] = u.t(iD, iD3, 0.32f);
            iArr2[2] = u.t(iD, iD2, 0.12f);
            iArr2[3] = u.t(iD, iD3, 0.12f);
            this.N3 = new ColorStateList(iArr, iArr2);
        }
        return this.N3;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.O3 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.O3 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public boolean r() {
        return this.O3;
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.O3 = z10;
        if (z10) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public SwitchMaterial(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Fh);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchMaterial(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = P3;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.L3 = new w6.a(context2);
        TypedArray typedArrayK = g0.k(context2, attributeSet, a.o.uv, i10, i11, new int[0]);
        this.O3 = typedArrayK.getBoolean(a.o.vv, false);
        typedArrayK.recycle();
    }
}
