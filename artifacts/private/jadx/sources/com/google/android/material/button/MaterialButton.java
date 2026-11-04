package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.n;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.t0;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.appcompat.widget.h;
import androidx.core.view.d0;
import androidx.core.view.u1;
import androidx.core.widget.r;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.g0;
import com.google.android.material.shape.l;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialButton extends h implements Checkable, t {
    public static final int H1 = 3;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f111605g3 = 16;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final int f111606h3 = 32;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final String f111607i3 = "MaterialButton";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f111609p0 = 1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f111610p1 = 2;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f111611p2 = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final com.google.android.material.button.b f111614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final LinkedHashSet<b> f111615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private c f111616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private PorterDuff.Mode f111617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private ColorStateList f111618h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private Drawable f111619i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private String f111620j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @t0
    private int f111621k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @t0
    private int f111622l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @t0
    private int f111623m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @t0
    private int f111624n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f111625o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f111626s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f111627t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int[] f111612v = {R.attr.state_checkable};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int[] f111613w = {R.attr.state_checked};

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final int f111608j3 = r6.a.n.Hi;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f111628c;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(@NonNull Parcel parcel) {
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f111628c = z10;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f111628c ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    interface c {
        void a(MaterialButton materialButton, boolean z10);
    }

    public MaterialButton(@NonNull Context context) {
        this(context, null);
    }

    private boolean d() {
        int i10 = this.f111627t;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    private boolean e() {
        int i10 = this.f111627t;
        if (i10 != 1 && i10 != 2) {
            return false;
        }
        return true;
    }

    private boolean f() {
        int i10 = this.f111627t;
        return i10 == 16 || i10 == 32;
    }

    private boolean g() {
        return u1.c0(this) == 1;
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        int i10 = 0 | 4;
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & d0.f48645d;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    private boolean i() {
        com.google.android.material.button.b bVar = this.f111614d;
        return (bVar == null || bVar.o()) ? false : true;
    }

    private void k() {
        if (e()) {
            r.u(this, this.f111619i, null, null, null);
        } else if (d()) {
            r.u(this, null, null, this.f111619i, null);
        } else if (f()) {
            r.u(this, null, this.f111619i, null, null);
        }
    }

    private void l(boolean z10) {
        Drawable drawable = this.f111619i;
        if (drawable != null) {
            Drawable drawableMutate = androidx.core.graphics.drawable.c.r(drawable).mutate();
            this.f111619i = drawableMutate;
            androidx.core.graphics.drawable.c.o(drawableMutate, this.f111618h);
            PorterDuff.Mode mode = this.f111617g;
            if (mode != null) {
                androidx.core.graphics.drawable.c.p(this.f111619i, mode);
            }
            int intrinsicWidth = this.f111621k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f111619i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f111621k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f111619i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f111619i;
            int i10 = this.f111622l;
            int i11 = this.f111623m;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f111619i.setVisible(true, z10);
        }
        if (z10) {
            k();
            return;
        }
        Drawable[] drawableArrH = r.h(this);
        Drawable drawable3 = drawableArrH[0];
        Drawable drawable4 = drawableArrH[1];
        Drawable drawable5 = drawableArrH[2];
        if ((!e() || drawable3 == this.f111619i) && ((!d() || drawable5 == this.f111619i) && (!f() || drawable4 == this.f111619i))) {
            return;
        }
        k();
    }

    private void m(int i10, int i11) {
        if (this.f111619i == null || getLayout() == null) {
            return;
        }
        if (!e() && !d()) {
            if (f()) {
                this.f111622l = 0;
                if (this.f111627t == 16) {
                    this.f111623m = 0;
                    l(false);
                    return;
                }
                int intrinsicHeight = this.f111621k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f111619i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f111624n) - getPaddingBottom()) / 2);
                if (this.f111623m != iMax) {
                    this.f111623m = iMax;
                    l(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f111623m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.f111627t;
        if (i12 != 1 && i12 != 3 && ((i12 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i12 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
            int intrinsicWidth = this.f111621k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f111619i.getIntrinsicWidth();
            }
            int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - u1.m0(this)) - intrinsicWidth) - this.f111624n) - u1.n0(this);
            if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                textLayoutWidth /= 2;
            }
            if (g() != (this.f111627t == 4)) {
                textLayoutWidth = -textLayoutWidth;
            }
            if (this.f111622l != textLayoutWidth) {
                this.f111622l = textLayoutWidth;
                l(false);
                return;
            }
            return;
        }
        this.f111622l = 0;
        l(false);
    }

    public void a(@NonNull b bVar) {
        this.f111615e.add(bVar);
    }

    public void b() {
        this.f111615e.clear();
    }

    public boolean c() {
        com.google.android.material.button.b bVar = this.f111614d;
        return bVar != null && bVar.p();
    }

    @NonNull
    String getA11yClassName() {
        if (TextUtils.isEmpty(this.f111620j)) {
            return (c() ? CompoundButton.class : Button.class).getName();
        }
        return this.f111620j;
    }

    @Override // android.view.View
    @p0
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @p0
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @t0
    public int getCornerRadius() {
        if (i()) {
            return this.f111614d.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f111619i;
    }

    public int getIconGravity() {
        return this.f111627t;
    }

    @t0
    public int getIconPadding() {
        return this.f111624n;
    }

    @t0
    public int getIconSize() {
        return this.f111621k;
    }

    public ColorStateList getIconTint() {
        return this.f111618h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f111617g;
    }

    @androidx.annotation.r
    public int getInsetBottom() {
        return this.f111614d.c();
    }

    @androidx.annotation.r
    public int getInsetTop() {
        return this.f111614d.d();
    }

    @p0
    public ColorStateList getRippleColor() {
        if (i()) {
            return this.f111614d.h();
        }
        return null;
    }

    @Override // com.google.android.material.shape.t
    @NonNull
    public p getShapeAppearanceModel() {
        if (i()) {
            return this.f111614d.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (i()) {
            return this.f111614d.j();
        }
        return null;
    }

    @t0
    public int getStrokeWidth() {
        if (i()) {
            return this.f111614d.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.h, androidx.core.view.p1
    @b1({b1.a.LIBRARY_GROUP})
    @p0
    public ColorStateList getSupportBackgroundTintList() {
        return i() ? this.f111614d.l() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.h, androidx.core.view.p1
    @b1({b1.a.LIBRARY_GROUP})
    @p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return i() ? this.f111614d.m() : super.getSupportBackgroundTintMode();
    }

    public boolean h() {
        return this.f111614d.q();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f111625o;
    }

    public void j(@NonNull b bVar) {
        this.f111615e.remove(bVar);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (i()) {
            l.f(this, this.f111614d.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (c()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f111612v);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f111613w);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.h, android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.h, android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(c());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.h, android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@p0 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.f111628c);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f111628c = this.f111625o;
        return savedState;
    }

    @Override // androidx.appcompat.widget.h, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        m(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f111614d.q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f111619i != null) {
            if (this.f111619i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    void setA11yClassName(@p0 String str) {
        this.f111620j = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@androidx.annotation.l int i10) {
        if (i()) {
            this.f111614d.s(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.h, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!i()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
        } else {
            this.f111614d.t();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.h, android.view.View
    public void setBackgroundResource(@v int i10) {
        setBackgroundDrawable(i10 != 0 ? j.a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@p0 ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@p0 PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (i()) {
            this.f111614d.u(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (c() && isEnabled() && this.f111625o != z10) {
            this.f111625o = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).p(this, this.f111625o);
            }
            if (this.f111626s) {
                return;
            }
            this.f111626s = true;
            Iterator<b> it = this.f111615e.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.f111625o);
            }
            this.f111626s = false;
        }
    }

    public void setCornerRadius(@t0 int i10) {
        if (i()) {
            this.f111614d.v(i10);
        }
    }

    public void setCornerRadiusResource(@q int i10) {
        if (i()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    @w0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (i()) {
            this.f111614d.f().o0(f10);
        }
    }

    public void setIcon(@p0 Drawable drawable) {
        if (this.f111619i != drawable) {
            this.f111619i = drawable;
            l(true);
            m(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f111627t != i10) {
            this.f111627t = i10;
            m(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@t0 int i10) {
        if (this.f111624n != i10) {
            this.f111624n = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(@v int i10) {
        setIcon(i10 != 0 ? j.a.b(getContext(), i10) : null);
    }

    public void setIconSize(@t0 int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f111621k != i10) {
            this.f111621k = i10;
            l(true);
        }
    }

    public void setIconTint(@p0 ColorStateList colorStateList) {
        if (this.f111618h != colorStateList) {
            this.f111618h = colorStateList;
            l(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f111617g != mode) {
            this.f111617g = mode;
            l(false);
        }
    }

    public void setIconTintResource(@n int i10) {
        setIconTint(j.a.a(getContext(), i10));
    }

    public void setInsetBottom(@androidx.annotation.r int i10) {
        this.f111614d.w(i10);
    }

    public void setInsetTop(@androidx.annotation.r int i10) {
        this.f111614d.x(i10);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(@p0 c cVar) {
        this.f111616f = cVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        c cVar = this.f111616f;
        if (cVar != null) {
            cVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(@p0 ColorStateList colorStateList) {
        if (i()) {
            this.f111614d.y(colorStateList);
        }
    }

    public void setRippleColorResource(@n int i10) {
        if (i()) {
            setRippleColor(j.a.a(getContext(), i10));
        }
    }

    @Override // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@NonNull p pVar) {
        if (!i()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f111614d.z(pVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (i()) {
            this.f111614d.A(z10);
        }
    }

    public void setStrokeColor(@p0 ColorStateList colorStateList) {
        if (i()) {
            this.f111614d.B(colorStateList);
        }
    }

    public void setStrokeColorResource(@n int i10) {
        if (i()) {
            setStrokeColor(j.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(@t0 int i10) {
        if (i()) {
            this.f111614d.C(i10);
        }
    }

    public void setStrokeWidthResource(@q int i10) {
        if (i()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.h, androidx.core.view.p1
    @b1({b1.a.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@p0 ColorStateList colorStateList) {
        if (i()) {
            this.f111614d.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.h, androidx.core.view.p1
    @b1({b1.a.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@p0 PorterDuff.Mode mode) {
        if (i()) {
            this.f111614d.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    @w0(17)
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        m(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f111614d.F(z10);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f111625o);
    }

    public MaterialButton(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.f359405mc);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f111608j3;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f111615e = new LinkedHashSet<>();
        this.f111625o = false;
        this.f111626s = false;
        Context context2 = getContext();
        TypedArray typedArrayK = g0.k(context2, attributeSet, r6.a.o.f361767gm, i10, i11, new int[0]);
        this.f111624n = typedArrayK.getDimensionPixelSize(r6.a.o.f362080tm, 0);
        int i12 = 7 & (-1);
        this.f111617g = com.google.android.material.internal.p0.t(typedArrayK.getInt(r6.a.o.f362152wm, -1), PorterDuff.Mode.SRC_IN);
        this.f111618h = com.google.android.material.resources.c.a(getContext(), typedArrayK, r6.a.o.f362128vm);
        this.f111619i = com.google.android.material.resources.c.e(getContext(), typedArrayK, r6.a.o.f362031rm);
        int i13 = 0 << 1;
        this.f111627t = typedArrayK.getInteger(r6.a.o.f362056sm, 1);
        this.f111621k = typedArrayK.getDimensionPixelSize(r6.a.o.f362104um, 0);
        com.google.android.material.button.b bVar = new com.google.android.material.button.b(this, p.e(context2, attributeSet, i10, i11).m());
        this.f111614d = bVar;
        bVar.r(typedArrayK);
        typedArrayK.recycle();
        setCompoundDrawablePadding(this.f111624n);
        l(this.f111619i != null);
    }
}
