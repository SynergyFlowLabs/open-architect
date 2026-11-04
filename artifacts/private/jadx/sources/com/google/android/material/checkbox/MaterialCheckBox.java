package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.f1;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.j1;
import com.google.android.material.color.u;
import com.google.android.material.internal.g0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final int f111804i3 = 0;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final int f111805j3 = 1;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final int f111806k3 = 2;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final int[] f111808m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final int[][] f111809n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @e.a({"DiscouragedApi"})
    private static final int f111810o3;

    @p0
    private CompoundButton.OnCheckedChangeListener H1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final LinkedHashSet<d> f111811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private final LinkedHashSet<c> f111812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private ColorStateList f111813g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b.a f111814g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f111815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f111816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f111817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private CharSequence f111818k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private Drawable f111819l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private Drawable f111820m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f111821n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    ColorStateList f111822o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f111823p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @p0
    private CharSequence f111824p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @p0
    private final androidx.vectordrawable.graphics.drawable.c f111825p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    ColorStateList f111826s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    private PorterDuff.Mode f111827t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f111828v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f111829w;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final int f111803h3 = r6.a.n.f361156fj;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final int[] f111807l3 = {r6.a.c.f359250fh};

    static class SavedState extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f111830a;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @NonNull
        private String a() {
            int i10 = this.f111830a;
            if (i10 != 1) {
                return i10 != 2 ? "unchecked" : "indeterminate";
            }
            return "checked";
        }

        @NonNull
        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f111830a));
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f111830a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    class a extends androidx.vectordrawable.graphics.drawable.b.a {
        a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b.a
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f111822o;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.c.o(drawable, colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b.a
        public void c(Drawable drawable) {
            super.c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f111822o;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.c.n(drawable, colorStateList.getColorForState(materialCheckBox.f111829w, MaterialCheckBox.this.f111822o.getDefaultColor()));
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface b {
    }

    public interface c {
        void a(@NonNull MaterialCheckBox materialCheckBox, int i10);
    }

    public interface d {
        void a(@NonNull MaterialCheckBox materialCheckBox, boolean z10);
    }

    static {
        int i10 = r6.a.c.f359227eh;
        f111808m3 = new int[]{i10};
        f111809n3 = new int[][]{new int[]{R.attr.state_enabled, i10}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f111810o3 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    @NonNull
    private String getButtonStateDescription() {
        int i10 = this.f111828v;
        if (i10 == 1) {
            return getResources().getString(r6.a.m.W0);
        }
        return i10 == 0 ? getResources().getString(r6.a.m.Y0) : getResources().getString(r6.a.m.X0);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f111813g == null) {
            int[][] iArr = f111809n3;
            int[] iArr2 = new int[iArr.length];
            int iD = u.d(this, r6.a.c.f359465p3);
            int iD2 = u.d(this, r6.a.c.f359533s3);
            int iD3 = u.d(this, r6.a.c.f359214e4);
            int iD4 = u.d(this, r6.a.c.I3);
            iArr2[0] = u.t(iD3, iD2, 1.0f);
            iArr2[1] = u.t(iD3, iD, 1.0f);
            iArr2[2] = u.t(iD3, iD4, 0.54f);
            iArr2[3] = u.t(iD3, iD4, 0.38f);
            iArr2[4] = u.t(iD3, iD4, 0.38f);
            this.f111813g = new ColorStateList(iArr, iArr2);
        }
        return this.f111813g;
    }

    @p0
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f111822o;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private boolean h(j1 j1Var) {
        return j1Var.u(r6.a.o.un, 0) == f111810o3 && j1Var.u(r6.a.o.vn, 0) == 0;
    }

    private void l() {
        this.f111819l = com.google.android.material.drawable.a.d(this.f111819l, this.f111822o, androidx.core.widget.d.c(this));
        this.f111820m = com.google.android.material.drawable.a.d(this.f111820m, this.f111826s, this.f111827t);
        p();
        q();
        super.setButtonDrawable(com.google.android.material.drawable.a.a(this.f111819l, this.f111820m));
        refreshDrawableState();
    }

    private void o() {
        if (Build.VERSION.SDK_INT >= 30 && this.f111824p1 == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    private void p() {
        androidx.vectordrawable.graphics.drawable.c cVar;
        if (this.f111821n) {
            androidx.vectordrawable.graphics.drawable.c cVar2 = this.f111825p2;
            if (cVar2 != null) {
                cVar2.b(this.f111814g3);
                this.f111825p2.c(this.f111814g3);
            }
            Drawable drawable = this.f111819l;
            if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f111825p2) == null) {
                return;
            }
            ((AnimatedStateListDrawable) drawable).addTransition(r6.a.h.G0, r6.a.h.f360790v6, cVar, false);
            ((AnimatedStateListDrawable) this.f111819l).addTransition(r6.a.h.f360658f2, r6.a.h.f360790v6, this.f111825p2, false);
        }
    }

    private void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f111819l;
        if (drawable != null && (colorStateList2 = this.f111822o) != null) {
            androidx.core.graphics.drawable.c.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f111820m;
        if (drawable2 == null || (colorStateList = this.f111826s) == null) {
            return;
        }
        androidx.core.graphics.drawable.c.o(drawable2, colorStateList);
    }

    private void r() {
    }

    public void d(@NonNull c cVar) {
        this.f111812f.add(cVar);
    }

    public void e(@NonNull d dVar) {
        this.f111811e.add(dVar);
    }

    public void f() {
        this.f111812f.clear();
    }

    public void g() {
        this.f111811e.clear();
    }

    @Override // android.widget.CompoundButton
    @p0
    public Drawable getButtonDrawable() {
        return this.f111819l;
    }

    @p0
    public Drawable getButtonIconDrawable() {
        return this.f111820m;
    }

    @p0
    public ColorStateList getButtonIconTintList() {
        return this.f111826s;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f111827t;
    }

    @Override // android.widget.CompoundButton
    @p0
    public ColorStateList getButtonTintList() {
        return this.f111822o;
    }

    public int getCheckedState() {
        return this.f111828v;
    }

    @p0
    public CharSequence getErrorAccessibilityLabel() {
        return this.f111818k;
    }

    public boolean i() {
        return this.f111816i;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f111828v == 1;
    }

    public boolean j() {
        return this.f111817j;
    }

    public boolean k() {
        return this.f111815h;
    }

    public void m(@NonNull c cVar) {
        this.f111812f.remove(cVar);
    }

    public void n(@NonNull d dVar) {
        this.f111811e.remove(dVar);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f111815h && this.f111822o == null && this.f111826s == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f111807l3);
        }
        if (j()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f111808m3);
        }
        this.f111829w = com.google.android.material.drawable.a.f(iArrOnCreateDrawableState);
        r();
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f111816i || !TextUtils.isEmpty(getText()) || (drawableA = androidx.core.widget.d.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (com.google.android.material.internal.p0.s(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            androidx.core.graphics.drawable.c.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@p0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && j()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f111818k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@p0 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f111830a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @p0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f111830a = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@v int i10) {
        setButtonDrawable(j.a.b(getContext(), i10));
    }

    public void setButtonIconDrawable(@p0 Drawable drawable) {
        this.f111820m = drawable;
        l();
    }

    public void setButtonIconDrawableResource(@v int i10) {
        setButtonIconDrawable(j.a.b(getContext(), i10));
    }

    public void setButtonIconTintList(@p0 ColorStateList colorStateList) {
        if (this.f111826s == colorStateList) {
            return;
        }
        this.f111826s = colorStateList;
        l();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f111827t == mode) {
            return;
        }
        this.f111827t = mode;
        l();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@p0 ColorStateList colorStateList) {
        if (this.f111822o == colorStateList) {
            return;
        }
        this.f111822o = colorStateList;
        l();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@p0 PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        l();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f111816i = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f111828v != i10) {
            this.f111828v = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            o();
            if (this.f111823p0) {
                return;
            }
            this.f111823p0 = true;
            LinkedHashSet<c> linkedHashSet = this.f111812f;
            if (linkedHashSet != null) {
                Iterator<c> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.f111828v);
                }
            }
            if (this.f111828v != 2 && (onCheckedChangeListener = this.H1) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f111823p0 = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        r();
    }

    public void setErrorAccessibilityLabel(@p0 CharSequence charSequence) {
        this.f111818k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@f1 int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f111817j != z10) {
            this.f111817j = z10;
            refreshDrawableState();
            Iterator<d> it = this.f111811e.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.f111817j);
            }
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@p0 CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.H1 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @w0(30)
    public void setStateDescription(@p0 CharSequence charSequence) {
        this.f111824p1 = charSequence;
        if (charSequence == null) {
            o();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f111815h = z10;
        if (z10) {
            androidx.core.widget.d.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.d.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.f359212e2);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@p0 Drawable drawable) {
        this.f111819l = drawable;
        this.f111821n = false;
        l();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f111803h3;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f111811e = new LinkedHashSet<>();
        this.f111812f = new LinkedHashSet<>();
        this.f111825p2 = androidx.vectordrawable.graphics.drawable.c.d(getContext(), r6.a.g.G1);
        this.f111814g3 = new a();
        Context context2 = getContext();
        this.f111819l = androidx.core.widget.d.a(this);
        this.f111822o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        j1 j1VarL = g0.l(context2, attributeSet, r6.a.o.tn, i10, i11, new int[0]);
        this.f111820m = j1VarL.h(r6.a.o.wn);
        if (this.f111819l != null && g0.h(context2) && h(j1VarL)) {
            super.setButtonDrawable((Drawable) null);
            this.f111819l = j.a.b(context2, r6.a.g.F1);
            this.f111821n = true;
            if (this.f111820m == null) {
                this.f111820m = j.a.b(context2, r6.a.g.H1);
            }
        }
        this.f111826s = com.google.android.material.resources.c.b(context2, j1VarL, r6.a.o.xn);
        this.f111827t = com.google.android.material.internal.p0.t(j1VarL.o(r6.a.o.yn, -1), PorterDuff.Mode.SRC_IN);
        this.f111815h = j1VarL.a(r6.a.o.En, false);
        this.f111816i = j1VarL.a(r6.a.o.An, true);
        this.f111817j = j1VarL.a(r6.a.o.Dn, false);
        this.f111818k = j1VarL.x(r6.a.o.Cn);
        if (j1VarL.C(r6.a.o.Bn)) {
            setCheckedState(j1VarL.o(r6.a.o.Bn, 0));
        }
        j1VarL.I();
        l();
    }
}
