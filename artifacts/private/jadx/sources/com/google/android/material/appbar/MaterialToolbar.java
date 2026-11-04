package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.u1;
import com.google.android.material.internal.g0;
import com.google.android.material.internal.h0;
import com.google.android.material.shape.k;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f111135f = r6.a.n.Dk;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ImageView.ScaleType[] f111136g = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private Integer f111137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f111138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f111139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private ImageView.ScaleType f111140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private Boolean f111141e;

    public MaterialToolbar(@NonNull Context context) {
        this(context, null);
    }

    private void C(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    private void D() {
        if (this.f111138b || this.f111139c) {
            TextView textViewI = h0.i(this);
            TextView textViewG = h0.g(this);
            if (textViewI == null && textViewG == null) {
                return;
            }
            Pair<Integer, Integer> pairW = w(textViewI, textViewG);
            if (this.f111138b && textViewI != null) {
                C(textViewI, pairW);
            }
            if (!this.f111139c || textViewG == null) {
                return;
            }
            C(textViewG, pairW);
        }
    }

    @p0
    private Drawable E(@p0 Drawable drawable) {
        if (drawable != null && this.f111137a != null) {
            drawable = androidx.core.graphics.drawable.c.r(drawable.mutate());
            androidx.core.graphics.drawable.c.n(drawable, this.f111137a.intValue());
        }
        return drawable;
    }

    private void F() {
        ImageView imageViewD = h0.d(this);
        if (imageViewD != null) {
            Boolean bool = this.f111141e;
            if (bool != null) {
                imageViewD.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f111140d;
            if (scaleType != null) {
                imageViewD.setScaleType(scaleType);
            }
        }
    }

    private Pair<Integer, Integer> w(@p0 TextView textView, @p0 TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void y(Context context) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : com.google.android.material.drawable.a.g(background);
        if (colorStateListValueOf != null) {
            k kVar = new k();
            kVar.p0(colorStateListValueOf);
            kVar.a0(context);
            kVar.o0(u1.T(this));
            u1.O1(this, kVar);
        }
    }

    public boolean A() {
        return this.f111139c;
    }

    public boolean B() {
        return this.f111138b;
    }

    @p0
    public ImageView.ScaleType getLogoScaleType() {
        return this.f111140d;
    }

    @l
    @p0
    public Integer getNavigationIconTint() {
        return this.f111137a;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof androidx.appcompat.view.menu.g;
        if (z10) {
            ((androidx.appcompat.view.menu.g) menu).n0();
        }
        super.inflateMenu(i10);
        if (z10) {
            ((androidx.appcompat.view.menu.g) menu).m0();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.l.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        D();
        F();
    }

    @Override // android.view.View
    @w0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.shape.l.d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f111141e;
        if (bool == null || bool.booleanValue() != z10) {
            this.f111141e = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.f111140d != scaleType) {
            this.f111140d = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@p0 Drawable drawable) {
        super.setNavigationIcon(E(drawable));
    }

    public void setNavigationIconTint(@l int i10) {
        this.f111137a = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f111139c != z10) {
            this.f111139c = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f111138b != z10) {
            this.f111138b = z10;
            requestLayout();
        }
    }

    public void x() {
        this.f111137a = null;
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            androidx.core.graphics.drawable.c.o(androidx.core.graphics.drawable.c.r(navigationIcon.mutate()), null);
            setNavigationIcon(navigationIcon);
        }
    }

    public boolean z() {
        Boolean bool = this.f111141e;
        return bool != null && bool.booleanValue();
    }

    public MaterialToolbar(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.f359321ik);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f111135f;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayK = g0.k(context2, attributeSet, r6.a.o.po, i10, i11, new int[0]);
        if (typedArrayK.hasValue(r6.a.o.so)) {
            setNavigationIconTint(typedArrayK.getColor(r6.a.o.so, -1));
        }
        this.f111138b = typedArrayK.getBoolean(r6.a.o.uo, false);
        this.f111139c = typedArrayK.getBoolean(r6.a.o.to, false);
        int i12 = typedArrayK.getInt(r6.a.o.ro, -1);
        if (i12 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f111136g;
            if (i12 < scaleTypeArr.length) {
                this.f111140d = scaleTypeArr[i12];
            }
        }
        if (typedArrayK.hasValue(r6.a.o.qo)) {
            this.f111141e = Boolean.valueOf(typedArrayK.getBoolean(r6.a.o.qo, false));
        }
        typedArrayK.recycle();
        y(context2);
    }
}
